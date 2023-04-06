package com.spring6.tx.controller;

/*
 *@Time：2023/4/3
 *@Author：Jelly
 */

import com.spring6.tx.service.BookService;
import com.spring6.tx.service.CheckOutBookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    public void buyBook(Integer bookId,Integer userId) {

        bookService.buyBook(bookId,userId);
    }

}
