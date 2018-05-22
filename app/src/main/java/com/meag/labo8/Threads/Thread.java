package com.meag.labo8.Threads;

import android.os.AsyncTask;
import android.support.v7.widget.RecyclerView;

import com.meag.labo8.Adapter.MoviesAdapter;
import com.meag.labo8.Classes.AppDatabase;
import com.meag.labo8.Classes.Movie;

import java.util.List;

/**
 * Created by UCA on 22/05/2018.
 */

public class Thread extends AsyncTask {

    private List<Movie> movies;
    private RecyclerView rv;
    private MoviesAdapter adapter;
    private AppDatabase db;

    public Thread(List<Movie> movies, RecyclerView rv, MoviesAdapter adapter, AppDatabase db) {
        this.movies = movies;
        this.rv = rv;
        this.adapter = adapter;
        this.db = db;
    }

    @Override
    protected Object doInBackground(Object[] objects){
        addMovie(movies);
        adapter = new MoviesAdapter(movies);
        rv.setAdapter(adapter);
        return null;
    }

    public void addMovie(List<Movie> movies){
        movies.add(new Movie("Valerian", "Sci-fi", "MadHouse"));
    }

}
