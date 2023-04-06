package com.spring6.tx.service;

import com.spring6.tx.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.TimeUnit;

/*
 *@Time：2023/4/3
 *@Author：Jelly
 */
//@Transactional(readOnly = true) //只读
//@Transactional(timeout = 3)  //超时  单位：秒
//↓如果抛出了如下设置的异常，不会发生回滚
//@Transactional(noRollbackFor = ArithmeticException.class)
//@Transactional(isolation = Isolation.DEFAULT)  //隔离级别
@Transactional(propagation = Propagation.REQUIRED) //传播行为
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public void buyBook(Integer bookId, Integer userId) {
        //TODO 模拟超时效果
//        try {
//            TimeUnit.SECONDS.sleep(5);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        //根据图书的ID查询图书的价格
        Integer bookPrice = bookDao.getBookPriceByBookId(bookId);

        //更新图书表库存量 -1
        Integer rows1 = bookDao.updateStock(bookId);

        //更新用户表用户余额 -图书价格
        Integer rows2 = bookDao.updateUserBalance(userId, bookPrice);

//        System.out.println(1/0);
    }
}
