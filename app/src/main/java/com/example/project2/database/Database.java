package com.example.project2.database;

import android.content.Context;
import android.provider.ContactsContract;

import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.project2.model.Book;
import com.example.project2.model.User;

@androidx.room.Database(entities = {User.class, Book.class}, exportSchema = false, version = 1)
public abstract class Database extends RoomDatabase {
    private static final String DB_NAME = "db";
    private static Database instance;

    public static synchronized Database getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),
                    Database.class,
                    DB_NAME)
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return instance;
    }

    public abstract UserDao userDao();

    public abstract BookDao bookDao();
}
