package com.example.Mock.Interview;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    @Autowired
    private Service serviceObj;
    @PostMapping("/addBook")
    public void addBook(Book book){
        serviceObj.addBook(book);
        System.out.println("Book added to bookDb");
    }
    @GetMapping("/getBookByAuthorName/{Id}")
    public String getBookByAuthorName(@RequestParam Integer Id){
        String AuthorName=serviceObj.getBookByAuthorName(Id);
        return AuthorName;
    }
    @PutMapping("/ChangeAuthorName")
    public String ChangeAuthorName(@RequestBody Book book,@RequestParam String Name){
        serviceObj.ChangeAuthorName(book,Name);
        return "Book Name Has Been Changed";
    }
    @DeleteMapping("/delete")
    public String delete(@PathVariable Integer Id){
        serviceObj.delete(Id);
        return "Book has been Deleted";
    }

}
