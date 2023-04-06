package com.spring6.tx.service;

/*
 *@Time：2023/4/6
 *@Author：Jelly
 */
public interface CheckOutBookService {

    public void checkout(Integer[] bookIds,Integer userId);

}
