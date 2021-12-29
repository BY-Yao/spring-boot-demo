package com.hori.springbootdemo.web;


import com.hori.springbootdemo.domain.Book;
import com.hori.springbootdemo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class BookApp {

    @Autowired
    private BookService bookService;

    /**
     * 查詢所有書單列表
     * @return
     */
    @GetMapping("/books")
    public List<Book> getAll(){
        return bookService.findAll();
    }


    /**
     * 新增一條書單
     * @param name
     * @param author
     * @param description
     * @param status
     * @return
     */
    @PostMapping("/books")
    public List<Book> post(@RequestParam String name,
                           @RequestParam String author,
                           @RequestParam String description,
                           @RequestParam int status){

        Book book = new Book();
        book.setName(name);
        book.setAuthor(author);
        book.setDescription(description);
        book.setStatus(status);

        return bookService.save(book);
    }


    @GetMapping("/books/{id}")
    public Optional<Book> getOne(@PathVariable long id){
        return bookService.findOne(id);
    }

}
