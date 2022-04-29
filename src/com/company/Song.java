package com.company;
import java.time.LocalDate;

public class Song {
    String name;
    LocalDate creation;
    String genre;
    boolean forGrandma;
    int rank;


    public Song(String name, LocalDate creation, String genre, boolean forGrandma, int rank) {
        this.name = name;
        this.creation = creation;
        this.genre = genre;
        this.forGrandma = forGrandma;
        this.rank = rank;
    }

    public Song(String name, String genre){
        this.name = name;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getCreation() {
        return creation;
    }

    public void setCreation(LocalDate creation) {
        this.creation = creation;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean isForGrandma() {
        return forGrandma;
    }

    public void setForGrandma(boolean forGrandma) {
        this.forGrandma = forGrandma;
    }

    public boolean isTopCharts(int rank){
        return rank>=8;
    }
}
