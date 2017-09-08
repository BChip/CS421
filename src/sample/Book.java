package sample;

// Homework 1: JavaGUI - Books
// Student Name: Bradley Chippi
// Course: CS421, Fall 2017
// Instructor: Dr. Cho
// Date finished: 9-5-2017
// Program description: 

import java.util.Arrays;

/**
 *  keeps track of all the books that are ready to be sold.
 * An book has a character identifier, a name, and a price.
 *
 * @author Bradley Chippi
 * @version 1.0 March 29, 2017
 */

class Book {
    private String title;
    private String author;
    private String publisher;
    private String isbn10;
    private String isbn13;
    private String[] keywords;
    private String course;
    private double price;

    /**
     * Constructor that gives values to class variables
     */

    public Book(){
        this.title = "Object-Oriented Software Engineering: An Agile Unified Methodology";
        this.author = "Kung, David";
        this.publisher = "McGraw-Hill Education";
        this.isbn10 = "0073376256";
        this.isbn13 = "9780073376257";
        this.course = "CS421";
        this.price = 85.38;
        this.keywords = new String[] {this.title, this.author, this.publisher, this.isbn10, this.isbn13, this.course};
    }

    /**
     * Constructor that initializes the class variables to the parameters given by the user.
     *
     * @param title     title of book
     * @param author    author of book
     * @param publisher publisher of book
     * @param isbn10    isbn10 identifier for book
     * @param isbn13    isbn13 identifier for book
     * @param price     price of book
     */

    public Book(String title, String author, String publisher, String isbn10, String isbn13, String[] keywords, String course, double price){
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.isbn10 = isbn10;
        this.isbn13 = isbn13;
        this.keywords = new String[] {title, author, publisher, isbn10, isbn13, course};
        this.course = course;
        this.price = price;
    }

    /**
     * Grabs the books author
     *
     * @return books author
     */

    public String getAuthor(){
        return this.author;
    }

    /**
     * Grabs the books title
     *
     * @return books title
     */

    public String getTitle(){
        return this.title;
    }

    /**
     * Grabs the books price
     *
     * @return books price
     */

    public double getPrice(){
        return this.price;
    }

    /**
     * Grabs the books publisher
     *
     * @return books publisher
     */
    public String getPublisher(){
        return this.publisher;
    }

    /**
     * Grabs the books isbn numbers
     *
     * @return books isbn10/isbn13
     */
    public String getISBN(){
        return "ISBN 10: " + this.isbn10 + " / ISBN 13: " + isbn13;
    }

    public String getKeywords(){
        return String.join(" ", this.keywords);
    }

}
