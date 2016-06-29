package com.technishaun.teamcdc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by Shaun on 6/28/2016.
 */

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_team_list);

        LinearLayout person_info_layout = (LinearLayout) findViewById(R.id.profile);
        Person person_info = (Person) getIntent().getSerializableExtra("person");

        Toolbar t = (Toolbar) findViewById(R.id.toolbar);
        setTitle(person_info.getName());

//        Labels

        TextView hobbies_label = new TextView(this);
        TextView games_label = new TextView(this);
        TextView interests_label = new TextView(this);
        TextView movies_label = new TextView(this);
        TextView songs_label = new TextView(this);

        hobbies_label.setText(R.string.hobbies);
        games_label.setText(R.string.games);
        interests_label.setText(R.string.interests);
        movies_label.setText(R.string.movies);
        songs_label.setText(R.string.songs);
//
//        Lists

        ListView list_hobbies = new ListView(this);
        list_hobbies.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 300));
        list_hobbies.setNestedScrollingEnabled(true);

        ListView list_games = new ListView(this);
        list_games.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 300));
        list_games.setNestedScrollingEnabled(true);

        ListView list_songs = new ListView(this);
        list_songs.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 300));
        list_songs.setNestedScrollingEnabled(true);

        ListView list_interests = new ListView(this);
        list_interests.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 300));
        list_interests.setNestedScrollingEnabled(true);

        ListView list_movies = new ListView(this);
        list_movies.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 300));
        list_movies.setNestedScrollingEnabled(true);

//        List Adapters

        ArrayAdapter<String> list_hobbies_adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, person_info.getHobbies());
        ArrayAdapter<String> list_games_adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, person_info.getGames());
        ArrayAdapter<String> list_movies_adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, person_info.getMovies());
        ArrayAdapter<String> list_interests_adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, person_info.getInterests());
        ArrayAdapter<String> list_songs_adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, person_info.getSongs());

        list_hobbies.setAdapter(list_hobbies_adapter);
        list_games.setAdapter(list_games_adapter);
        list_interests.setAdapter(list_interests_adapter);
        list_songs.setAdapter(list_songs_adapter);
        list_movies.setAdapter(list_movies_adapter);

//        Adding everything to layout

        person_info_layout.addView(games_label);
        person_info_layout.addView(list_games);
        person_info_layout.addView(movies_label);
        person_info_layout.addView(list_movies);
        person_info_layout.addView(songs_label);
        person_info_layout.addView(list_songs);
        person_info_layout.addView(hobbies_label);
        person_info_layout.addView(list_hobbies);
        person_info_layout.addView(interests_label);
        person_info_layout.addView(list_interests);

    }
}
