package com.meag.labo8.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.meag.labo8.Adapter.MoviesAdapter;
import com.meag.labo8.Classes.AppDatabase;
import com.meag.labo8.Classes.Movie;
import com.meag.labo8.Threads.Thread;
import com.meag.labo8.R;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    MoviesAdapter adapter;
    List<Movie> movies;
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        rv = findViewById(R.id.recyclerview);
        adapter = new MoviesAdapter(movies);
        rv.setLayoutManager(new LinearLayoutManager(this));

        AppDatabase db = AppDatabase.getAppDatabase(getApplicationContext());
        movies = db.moviesDAO().getAll();

        new Thread(movies, rv, adapter, db).execute();

        fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),CreateMovie.class));
            }
        });
    }

}
