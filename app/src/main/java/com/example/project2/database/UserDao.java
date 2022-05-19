package com.example.project2.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.project2.model.User;

import java.util.List;

@Dao
public interface UserDao {
    @Query("Select * from User")
    List<User> getUsersList();

    @Query("select * from User where username = :username & password = :password")
    List<User> getUserLogin(String username, String password);

    @Insert
    void insertUser(User user);

    @Delete
    void deleteUser(User user);
}
