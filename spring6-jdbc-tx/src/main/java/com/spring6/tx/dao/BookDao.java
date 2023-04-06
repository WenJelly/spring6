package com.spring6.tx.dao;

/*
 *@Time：2023/4/3
 *@Author：Jelly
 */
public interface BookDao {

    //根据图书id查询图书价格
    public Integer getBookPriceByBookId(Integer bookId);

    //修改图书的库存数量
    public Integer updateStock(Integer bookId);

    //修改用户的余额
    public Integer updateUserBalance(Integer userId, Integer price);


}
