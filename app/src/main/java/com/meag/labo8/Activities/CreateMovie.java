package com.meag.labo8.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.meag.labo8.Classes.AppDatabase;
import com.meag.labo8.Classes.Movie;
import com.meag.labo8.R;

import java.util.List;

public class CreateMovie extends AppCompatActivity {

    EditText name, studio, category;
    Button btn;
    List<Movie> movies;
    String sname, sstudio, scat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_movie);

        btn = (Button) findViewById(R.id.button_submit);
        name = (EditText) findViewById(R.id.new_movie_name);
        studio = (EditText) findViewById(R.id.new_movie_studio);
        category = (EditText) findViewById(R.id.new_movie_category);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sname = name.getText().toString();
                sstudio = studio.getText().toString();
                scat = category.getText().toString();
                AppDatabase db = AppDatabase.getAppDatabase(getApplicationContext());
                db.moviesDAO().insertMovie(new Movie(sname, sstudio, scat));
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });

    }
}
