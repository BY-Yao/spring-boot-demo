package com.hori.springbootdemo.web;


import com.hori.springbootdemo.domain.Book;
import com.hori.springbootdemo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class BookController {

    @GetMapping("/books")
    public String list(){
        return "books";
    }

}
