package com.spring6.tx.service;

import com.spring6.tx.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/*
 *@Time：2023/4/6
 *@Author：Jelly
 */
@Service
public class CheckOutBookServiceImpl implements CheckOutBookService{

    @Autowired
    private BookService bookService;

    //买多本书
    @Transactional()
    @Override
    public void checkout(Integer[] bookIds, Integer userId) {
        for (Integer bookId : bookIds){
            bookService.buyBook(bookId,userId);
        }
    }
}
