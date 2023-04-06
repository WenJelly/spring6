package com.spring.di;

/*
 *@Time：2023/3/24
 *@Author：Jelly
 */
public class Book {

    private String bName;
    private String author;

    //生成set方法

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(String bName, String author) {
        this.bName = bName;
        this.author = author;
        System.out.println("有参构造执行了");
    }

    public Book() {
    }

    public static void main(String[] args) {

        //set方法注入
        Book book = new Book();
        book.setbName("java");
        book.setAuthor("wenguodong");

        //构造器注入
        Book wenjelly = new Book("C++", "wenjelly");

    }

    @Override
    public String toString() {
        return "Book{" +
                "bName='" + bName + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
