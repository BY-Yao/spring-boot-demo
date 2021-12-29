package com.hori.springbootdemo.service;

import com.hori.springbootdemo.domain.Book;
import com.hori.springbootdemo.domain.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    /**
     * 獲取讀書清單列表
     * @return
     */
    public List<Book> findAll(){
        return bookRepository.findAll();
    }

    /**
     * 新增一個書單資料
     * @param book
     * @return
     */
    public List<Book> save(Book book){
        return (List<Book>) bookRepository.save(book);
    }


    /**
     * 查詢一條書單
     * @param id
     * @return
     */
    public Optional<Book> findOne(long id){
        return bookRepository.findById(id);

    }



}
