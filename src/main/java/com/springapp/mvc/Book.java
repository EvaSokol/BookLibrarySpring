package com.springapp.mvc;

public class Book {

    private String bookName;
    private String authorName;
    private int productionYear;

    Book(String bookName, String authorName, int productionYear) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.productionYear = productionYear;
    }

    Book() {
        this.bookName = "Default Book Name";
        this.authorName = "Default Author";
        this.productionYear = 0000;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }
}
