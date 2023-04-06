package com.spring6.tx.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/*
 *@Time：2023/4/3
 *@Author：Jelly
 */
@Repository
public class BookDaoImpl implements BookDao {

    //1.先把jdbcTemplate注入进来
    //因为dao层一般是与数据库打交道的
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Integer getBookPriceByBookId(Integer bookId) {
        String sql = "select price from t_book where book_id = ?";
        Integer price = jdbcTemplate.queryForObject(sql, Integer.class, bookId);
        return price;
    }

    @Override
    public Integer updateStock(Integer bookId) {
        String sql = "update t_book set stock = stock - 1 where book_id = ?";
        int rows = jdbcTemplate.update(sql, bookId);
        return rows;
    }

    @Override
    public Integer updateUserBalance(Integer userId, Integer price) {
        String sql = "update t_user set balance = balance - ? where user_id = ?";
        int rows = jdbcTemplate.update(sql, price, userId);
        return rows;
    }
}
