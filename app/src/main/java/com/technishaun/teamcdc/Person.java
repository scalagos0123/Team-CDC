package com.technishaun.teamcdc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Shaun on 6/19/2016.
 */
public class Person {

    private String name;
//    private String birthday;
    private List<String> hobbies;
    private List<String> interests;
    private List<String> movies;
    private List<String> songs;
    private List<String> games;

    public Person(String name) {
        this.name = name;
//        this.birthday = birthday;
        this.movies = new LinkedList<String>();
        this.hobbies = new LinkedList<String>();
        this.interests = new LinkedList<String>();
        this.songs = new LinkedList<String>();
        this.games = new LinkedList<String>();
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public List<String> getInterests() {
        return interests;
    }

    public List<String> getMovies() {
        return movies;
    }

    public List<String> getSongs() {
        return songs;
    }

    public List<String> getGames() {
        return games;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public String getBirthday() {
//        return birthday;
//    }

//    public void setBirthday(String birthday) {
//        this.birthday = birthday;
//    }

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
