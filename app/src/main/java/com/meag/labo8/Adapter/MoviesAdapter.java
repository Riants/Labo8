package com.meag.labo8.Adapter;

import android.content.Context;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import com.meag.labo8.Classes.Movie;
import com.meag.labo8.R;

import java.util.List; /**
 * Created by UCA on 22/05/2018.
 */

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.movies> {

    private List<Movie> movies;

    public MoviesAdapter(List<Movie> movies) {
        this.movies = movies;
    }

    @NonNull
    @Override
    public movies onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new movies(LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_cardview,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull movies holder, int position) {

        Movie movie = movies.get(position);
        holder.movie_name.setText(movie.getNomMovie());
        holder.movie_category.setText(movie.getNomCategory());
        holder.movie_studio.setText(movie.getNomEstudio());

    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    public static class movies extends RecyclerView.ViewHolder {

        TextView movie_name;
        TextView movie_category;
        TextView movie_studio;

        public movies(View itemView) {
            super(itemView);

            movie_name = (TextView) itemView.findViewById(R.id.movie_name_txt);
            movie_category = (TextView) itemView.findViewById(R.id.movie_category_txt);
            movie_studio = (TextView) itemView.findViewById(R.id.movie_studio_txt);

        }
    }

}
