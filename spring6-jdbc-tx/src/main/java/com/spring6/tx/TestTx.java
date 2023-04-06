package com.spring6.tx;

import com.spring6.tx.controller.BookController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.Scanner;

/*
 *@Time：2023/4/3
 *@Author：Jelly
 */
@SpringJUnitConfig(locations = "classpath:beans.xml")
public class TestTx {
    @Autowired
    private BookController bookController;

    @Test
    public void testBuyBook() {
        bookController.buyBook(1,1);
    }
}
