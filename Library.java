/*
 * Library Structure:
 * 
 * Implement the Library structure using the following class.
 * 1. Library class with the following properties
 *  - Attributes
 *      - private integer, attribute number_of_books
 *      - private string attribute name (library name)
 *      - private Map<String, Integer> bookGenres, map of genres to book count
 *  - Public getter and setter methods
 *      --- Getter---
 *      - int getNumber_of_books) method
 *      - string getName() method
 *      - Map<String, Integer > getBookGenres() method
 *      --- Setter ---
 *      - void setNumber_of_books(int number_of_books) method
 *      - void setName(string name) method
 *      - void setBookGenres(Map<String, Integer» bookGenres) method
 * 
 * returns char 
 */

import java.util.Map;

public class Library {
    private int numberOfBooks;
    private String libraryName;
    private Map<String, Integer> bookGenres;

    public int getNumberOfBooks(){
        return this.numberOfBooks;
    }

    public void setNumberOfBooks(int numberOfBooks){
        this.numberOfBooks = numberOfBooks;
    }

    public String getLibraryName() {
        return this.libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public Map<String, Integer> getBookGeners(){
        return this.bookGenres;
    }

    public void setBookGenres(Map<String, Integer> bookGeners){
        this.bookGenres = bookGeners;
    }
    
}