package com.meag.labo8.Classes;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.meag.labo8.Interface.MoviesDAO;

/**
 * Created by UCA on 22/05/2018.
 */

@Database(entities = {Movie.class},version = 1)
public abstract class AppDatabase extends RoomDatabase {

    private static AppDatabase INSTANCE;
    public abstract MoviesDAO moviesDAO();

    public static AppDatabase getAppDatabase (Context context){
        if(INSTANCE == null){
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(),AppDatabase.class,"movies-database")
                    .allowMainThreadQueries().build();
        }

        return INSTANCE;
    }
}
