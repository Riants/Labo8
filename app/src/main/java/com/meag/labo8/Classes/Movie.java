package com.meag.labo8.Classes;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by UCA on 22/05/2018.
 */
@Entity(tableName = "movie")
public class Movie {

    @PrimaryKey(autoGenerate = true)
    private int idMovies;

    @ColumnInfo(name = "nom_movie")
    private int nomMovie;

    @ColumnInfo(name = "desc_movie")
    private int descMovie;

    @ColumnInfo(name = "nom_category")
    private int nomCategory;

    @ColumnInfo(name = "nom_studio")
    private int nomEstudio;

    public Movie() {
    }

    public Movie(int nomMovie, int nomCategory, int nomEstudio) {
        this.nomMovie = nomMovie;
        this.nomCategory = nomCategory;
        this.nomEstudio = nomEstudio;
    }

    public int getIdMovies() {
        return idMovies;
    }

    public void setIdMovies(int idMovies) {
        this.idMovies = idMovies;
    }

    public int getNomMovie() {
        return nomMovie;
    }

    public void setNomMovie(int nomMovie) {
        this.nomMovie = nomMovie;
    }

    public int getDescMovie() {
        return descMovie;
    }

    public void setDescMovie(int descMovie) {
        this.descMovie = descMovie;
    }

    public int getNomCategory() {
        return nomCategory;
    }

    public void setNomCategory(int nomCategory) {
        this.nomCategory = nomCategory;
    }

    public int getNomEstudio() {
        return nomEstudio;
    }

    public void setNomEstudio(int nomEstudio) {
        this.nomEstudio = nomEstudio;
    }
}
