package com.example.Mock.Interview;

import java.util.HashMap;

@org.springframework.stereotype.Repository
public class Repository {
    HashMap<Integer,Book> bookDb=new HashMap<>();
    public void addBook(Book book){
        int Id=book.getBookId();
        bookDb.put(Id,book);
    }
    public Book getBookByAuthorName(int Id){
        return bookDb.get(Id);
    }
    public void ChangeAuthorName(Book book,String Name){
        String name=book.getName();
        name=Name;
        int Id= book.getBookId();
        bookDb.put(Id,book);
    }
    public void delete(int Id){
        bookDb.remove(Id);
    }
}
