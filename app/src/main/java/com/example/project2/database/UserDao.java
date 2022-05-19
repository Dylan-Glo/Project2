package com.example.project2.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface UserDao {
    @Query("Select * from User")
    List<User> getUsersList();

    @Insert
    void insertUser(User user);

    @Delete
    void deleteUser(User user);
}
