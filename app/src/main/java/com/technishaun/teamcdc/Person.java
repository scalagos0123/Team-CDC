package com.technishaun.teamcdc;

import java.util.ArrayList;

/**
 * Created by Shaun on 6/19/2016.
 */
public class Person {

    private String name;
    private String birthday;
    private ArrayList<String> hobbies;
    private ArrayList<String> interests;
    private ArrayList<String> movies;
    private ArrayList<String> songs;
    private ArrayList<String> games;

    public Person(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void addHobby(String hobby) {
        hobbies.add(hobby);
    }

    public void addHobby(String hobbies[]) {
        for (int i = 0; i < hobbies.length; i++) {
            this.hobbies.add(hobbies[i]);
        }
    }

    public void addInterest(String interest) {
        interests.add(interest);
    }

    public void addInterest(String interests[]) {
        for (int i = 0; i < interests.length; i++) {
            this.interests.add(interests[i]);
        }
    }

    public void addMovie(String movie) {
        movies.add(movie);
    }

    public void addMovie(String movies[]) {
        for (int i = 0; i < movies.length; i++) {
            this.movies.add(movies[i]);
        }
    }

    public void addSong(String song) {
        songs.add(song);
    }

    public void addSong(String songs[]) {
        for (int i = 0; i < songs.length; i++) {
            this.songs.add(songs[i]);
        }
    }

    public void addGame(String game) {
        games.add(game);
    }

    public void addGame(String games[]) {
        for (int i = 0; i < games.length; i++) {
            this.games.add(games[i]);
        }
    }

}
