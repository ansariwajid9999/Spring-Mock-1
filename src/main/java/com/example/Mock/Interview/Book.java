package com.example.Mock.Interview;

public class Book {
    int bookId;
    String name;
    int price;
    int printingYear;

    public int getBookId() {
        return bookId;
    }

    public int getPrice() {
        return price;
    }

    public int getPrintingYear() {
        return printingYear;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrintingYear(int printingYear) {
        this.printingYear = printingYear;
    }
}
