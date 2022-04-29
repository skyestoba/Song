package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LocalDate sc = LocalDate.of(1969,5,28);
        Song SweetCaroline = new Song("Sweet Caroline", sc,"Soft Rock", true,6);

        System.out.println(SweetCaroline.getName() + " is a " + SweetCaroline.getGenre() + " song, made on " + SweetCaroline.getCreation() + ". Your Grandma could listen to it: " + SweetCaroline.isForGrandma() + " Is top charts: " + SweetCaroline.isTopCharts(6));

        Song DuckEatDuckWorld = new Song("Duck Eat Duck World", "punk");
        System.out.println(DuckEatDuckWorld.getName() + " is a " + DuckEatDuckWorld.getGenre() + " song.");
    }
}
