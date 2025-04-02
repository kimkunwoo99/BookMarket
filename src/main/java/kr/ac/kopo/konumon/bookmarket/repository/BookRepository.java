package kr.ac.kopo.konumon.bookmarket.repository;

import kr.ac.kopo.konumon.bookmarket.domain.Book;

import java.util.List;

public interface BookRepository {
    List<Book> getAllBookList();
}