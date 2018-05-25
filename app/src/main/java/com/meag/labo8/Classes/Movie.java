package com.meag.labo8.Classes;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by UCA on 22/05/2018.
 */
@Entity(tableName = "movie")
public class Movie {

    @PrimaryKey(autoGenerate = true)
    private int idMovies;

    @ColumnInfo(name = "nom_movie")
    private String nomMovie;

    @ColumnInfo(name = "desc_movie")
    private String descMovie;

    @ColumnInfo(name = "nom_category")
    private String nomCategory;

    @ColumnInfo(name = "nom_studio")
    private String nomEstudio;

    //public Movie() {
    //}

    public Movie(String nomMovie, String nomCategory, String nomEstudio) {
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

    public String getNomMovie() {
        return nomMovie;
    }

    public void setNomMovie(String nomMovie) {
        this.nomMovie = nomMovie;
    }

    public String getDescMovie() {
        return descMovie;
    }

    public void setDescMovie(String descMovie) {
        this.descMovie = descMovie;
    }

    public String getNomCategory() {
        return nomCategory;
    }

    public void setNomCategory(String nomCategory) {
        this.nomCategory = nomCategory;
    }

    public String getNomEstudio() {
        return nomEstudio;
    }

    public void setNomEstudio(String nomEstudio) {
        this.nomEstudio = nomEstudio;
    }
}
