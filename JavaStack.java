/*
 * Java Stack:
 * Given a list of strings of bracket characters: {}{}, the string of brackets is balanced under the following conditions.
 * 1. Is it the empty string.
 * 2. If strings a and b are balanced, then ab is balanced.
 * 3. If strings a is balanced, then {a} and {b} are balanced.
 * 
 * Write a class that determine whether the brackets in each string are balanaced and returns true if the string is balanced,
 *  or false if it is not.
 * 
 * EX: s = ["{}()", "{()}", "{{()}}"] all of them are balanced same amounts of brackets.
 * EX: s = ["{}{", "({})", "{{"] non of them are balanced.
 */

public class JavaStack {
    static boolean isBalanced(String input){
        while(input.length() != (input = input.replaceAll("\\(\\)|\\[\\]|\\{\\}", "")).length());
        return input.isEmpty();
    }
}