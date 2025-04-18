package kr.ac.kopo.konumon.bookmarket.service;

import kr.ac.kopo.konumon.bookmarket.domain.Book;

import java.util.List;

public interface BookService {
    List<Book> getAllBookList();
    Book getBookById(String bookId);
    List<Book> getBookListByCategory(String category);
}