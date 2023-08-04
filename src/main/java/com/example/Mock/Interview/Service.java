package com.example.Mock.Interview;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    private Repository repositoryObj;
    public void addBook(Book book){
        repositoryObj.addBook(book);
    }
    public String getBookByAuthorName(int Id){
        Book book=repositoryObj.getBookByAuthorName(Id);
        return book.getName();
    }
    public void ChangeAuthorName(Book book,String Name){
        repositoryObj.ChangeAuthorName(book,Name);
    }
    public void delete(int Id){
        repositoryObj.delete(Id);
    }
}
