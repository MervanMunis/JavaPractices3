/*
 * Rest API (Intermediate) Test:
 * In this challenge, the REST API contains information about football matches. The provided API allows querying matches by teams and year.
 *  Your task is to get the total number of goals scored by a given team in a given year.
 * To access a collection of matches, perform GET requests to 
 * https://jsonmock.hackerrank.com/api/football_matches?year=<year>&team1=<team>&page=<page>
 * https://jsonmock.hackerrank.com/api/football_matches?year=<year>&team2=<team>&page=<page>
 * where ‹year> is the year of the competition, ‹team is the name of the team, and ‹page> is the page of the results to request. 
 * The results might be divided into several pages. Pages are numbered from 1. Notice that the above two URLs are different.
 *  The first URL specifies the team parameter (denoting the home team) while the second URL specifies the team2 parameter 
 * (denoting the visiting team). Thus, in order to get all matches that a partic lar team played in, you need to retrieve matches 
 * where the team was the home team and the visiting team.
 * For example, a GET request to https://jsonmock.hackerrank.com/api/football_matches?year=2011&team1=Barcelona&page=2
 * returns data associated with matches in the year 2011, where team (the home team) was Barcelona, on the second page of the results.
 * 
 * Similarly, a GET request to https://jsonmock.hackerrank.com/api/football_matches?year=2011&team2=Barcelona&page=1
 * returns data associated with matches in the year 2011 where team2 (the visiting team) was Barcelona, on the first page of the results.
 * 
 * The response to such a request is a JSON with the following 5 fields:
 *      • page: The current page of the results.
 *      • per_page: The maximum number of matches returned per page.
 *      • total: The total number of matches on all pages of the results.
 *      • total_pages: The total number of pages with results.
 *      • data: An array of objects containing matches information on the requested page.
 * 
 * Each match record has several fields, but in this task only the following 4 are relevant:
 *      • team: a string denoting the name of the first team in the match
 *      • team2: a string denoting the name of the second team in the match
 *      • teamigoals: a string denoting the number of goals scored by team in the match
 *      • teamgoals: a string denoting the number of goals scored by team in the match
 * 
 * Sample Input For Custom Testing
 * Barcelona
 * 2011
 * Sample Output
 * 35
 * Explanation
 * The team is Barcelona and the year is 2011. When we fetch all the matches that Barcelona played in the year 2011,
 *  we find that they scored a total of 35 goals, which is the required answer.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class RestAPI {

    public static int getTotalGoals(String team, int year) throws IOException, ScriptException {
        final String EndPoint = "https://jsonmock.hackerrank.com/api/football_matches";

        int totalGoalsAtHome = getPageTotalGoals(String.format(EndPoint + "?team1=%s&year=%d", 
                                                URLEncoder.encode(team, "UTF-8"), 
                                                year), 
                                                "team1",
                                                1);

        int totalGoalsAtVisiting = getPageTotalGoals(String.format(EndPoint + "?team1=%s&year=%d", 
                                                URLEncoder.encode(team, "UTF-8"), 
                                                year), 
                                                "team2",
                                                1);
        return totalGoalsAtHome + totalGoalsAtVisiting;
    }

    private static int getPageTotalGoals(String request, String team, int page) throws IOException, ScriptException {
        URL url = new URL(request + "&page=" + page);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();

        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.setConnectTimeout(5000);
        httpURLConnection.setReadTimeout(5000);
        httpURLConnection.addRequestProperty("Content-Type", "application/json");

        int status = httpURLConnection.getResponseCode();

        InputStream in = (status < 200 || status > 299) ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream();

        StringBuilder responseContent;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
            String responseLine;
            responseContent = new StringBuilder();
            while((responseLine = br.readLine()) != null){
                responseContent.append(responseLine);
            }
        }

        httpURLConnection.disconnect();

        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("javascript");

        String script = "var obj = JSON.parse(`" + responseContent.toString() + "`);";
        script+= "var total_pages = obj.total_pages;";
        script += "var total_goals = obj.data.reduce(function(accumulator, current) { return accumulator + parseInt(current." + team + "goals); }, 0);";

        engine.eval(script);
        
        if(engine.get("total_pages") == null){
            throw new RuntimeException("Cannot retrieve data from the server.");
        }

        int totalPages = (int) engine.get("total_pages");
        int totalGoals = (int) Double.parseDouble(engine.get("total_goals").toString());

        return (page < totalPages) ? getPageTotalGoals(request, team, page + 1) : totalGoals;
    }

}    

