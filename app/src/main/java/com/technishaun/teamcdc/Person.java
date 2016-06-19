package com.technishaun.teamcdc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        this.movies = new ArrayList<String>();
        this.hobbies = new ArrayList<String>();
        this.interests = new ArrayList<String>();
        this.songs = new ArrayList<String>();
        this.games = new ArrayList<String>();
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

    public ArrayList<String> getHobbies() {
        return hobbies;
    }

    public ArrayList<String> getInterests() {
        return interests;
    }

    public ArrayList<String> getMovies() {
        return movies;
    }

    public ArrayList<String> getSongs() {
        return songs;
    }

    public ArrayList<String> getGames() {
        return games;
    }

    public void addHobby(String hobby) {
        hobbies.add(hobby);
    }

    public void addHobby(String hobbies[]) {
        List<String> updateList = Arrays.asList(hobbies);
        this.hobbies.addAll(updateList);
    }

    public void addInterest(String interest) {
        interests.add(interest);
    }

    public void addInterest(String interests[]) {
        List<String> updateList = Arrays.asList(interests);
        this.interests.addAll(updateList);
    }

    public void addMovie(String movie) {
        movies.add(movie);
    }

    public void addMovie(String movies[]) {
        List<String> updateList = Arrays.asList(movies);
        this.movies.addAll(updateList);
    }

    public void addSong(String song) {
        songs.add(song);
    }

    public void addSong(String songs[]) {
        List<String> updateList = Arrays.asList(songs);
        this.songs.addAll(updateList);
    }

    public void addGame(String game) {
        games.add(game);
    }

    public void addGame(String games[]) {
        List<String> updateList = Arrays.asList(games);
        this.games.addAll(updateList);
    }

}
