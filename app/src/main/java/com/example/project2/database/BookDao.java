package com.example.project2.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.project2.model.Book;

import java.util.List;

@Dao
public interface BookDao {
    @Query("select * from Book")
    List<Book> getBooks();

    @Insert
    void insertBook(Book book);

    @Delete
    void deleteBook(Book book);
}
