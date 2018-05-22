package com.meag.labo8.Interface;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.meag.labo8.Classes.Movie;

import java.util.List;

import static android.arch.persistence.room.OnConflictStrategy.REPLACE;

/**
 * Created by UCA on 22/05/2018.
 */

@Dao
public interface MoviesDAO {

    @Query("SELECT * FROM MOVIE")
    List<Movie> getAll();

    @Insert(onConflict = REPLACE)
    void insertMovie(Movie movie);

}
