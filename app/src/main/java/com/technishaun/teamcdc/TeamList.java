package com.technishaun.teamcdc;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.LinkedList;
import java.util.List;

public class TeamList extends AppCompatActivity {

    private List<Person> team_details = new LinkedList<Person>();
    private List<String> team_people = new LinkedList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_list);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Team CDC");
        setSupportActionBar(toolbar);

        /*

        1st person = Shaun

         */

        Person person1 = new Person("Shaun Cassidy Calagos");
        String hobbies[] = new String[]{"Gaming", "Learning new programming languages"};
        String interests[] = {"Technology", "Art", "Gaming"};
        String movies[] = {"Love, Rosie", "Spider-Man"};
        String games[] = {"Call of Duty", "Battlefield", "CSGO", "Dota 2"};

        person1.addSong(new String[]{"Princess of China", "Every Teardrop is a Waterfall", "Yellow", "Sparks"});
        person1.addMovie(movies);
        person1.addGame(games);
        person1.addInterest(interests);
        person1.addHobby(hobbies);

        team_details.add(person1);


        /*

        2nd person = Kat

         */

        Person person2 = new Person("Kat Delfin");
        person2.addGame(new String[]{"Surgeon 3", "Clash Royale"});
        person2.addHobby(new String[]{"Eating", "Sleeping", "Reading", "Watching TV Series"});
        person2.addSong(new String[]{"Bring me to Life - Evanescence","Emotion - Carly Rae Jepsen"});

        team_details.add(person2);

        /*

        3rd person = Bendrhick

         */

        Person person3 = new Person("Bendrhick Co");
        person3.addSong(new String[]{"Middle", "Vanilla Twilight"});
        person3.addMovie("Marvel Movies");
        person3.addInterest(new String[]{"Sleeping", "Swimming", "Working out", "Reading books"});

        team_details.add(person3);

        StringBuffer appendedTexts = new StringBuffer();
        LinearLayout team_layout = (LinearLayout) findViewById(R.id.team);

        for (int i = 0; i < team_details.size(); i++) {
            team_people.add(team_details.get(i).getName());
        }

        for (int i = 0; i < team_people.size(); i++) {
            TextView name = new TextView(this);
            name.setText(team_people.get(i));
            name.setTextAppearance(this, android.R.style.TextAppearance_Large);
            team_layout.addView(name);

//            Games

            TextView game_label = new TextView(this);
            game_label.setText("Games: ");
            game_label.setTextAppearance(this, android.R.style.TextAppearance_Medium);

//            for (int j = 0; j < team_details.get(i).getGames().size(); j++) {
//                appendedTexts.append(team_details.get(i).getGames().get(j) + ", ");
//            }

            ListView list_game = new ListView(this);
            list_game.setNestedScrollingEnabled(true);
            list_game.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 300));

            ArrayAdapter<String> list_game_adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, team_details.get(i).getGames());
            list_game.setAdapter(list_game_adapter);

            if (team_details.get(i).getGames().size() > 0) {
                team_layout.addView(game_label);
                team_layout.addView(list_game);
            }

//            End of games
//            Movies

            TextView movies_label = new TextView(this);
            movies_label.setText("Movies: ");
            movies_label.setTextAppearance(this, android.R.style.TextAppearance_Medium);

            ListView list_movie = new ListView(this);
            list_movie.setNestedScrollingEnabled(true);
            list_movie.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 300));

            ArrayAdapter<String> list_movie_adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, team_details.get(i).getMovies());
            list_movie.setAdapter(list_movie_adapter);

            if (team_details.get(i).getMovies().size() > 0) {
                team_layout.addView(movies_label);
                team_layout.addView(list_movie);
            }

//            End of movies
//            Hobbies

            TextView hobbies_label = new TextView(this);
            hobbies_label.setText("Hobbies: ");
            hobbies_label.setTextAppearance(this, android.R.style.TextAppearance_Medium);

//            for (int j = 0; j < team_details.get(i).getHobbies().size(); j++) {
//                appendedTexts.append(team_details.get(i).getHobbies().get(j) + ", ");
//            }

//            TextView hobby = new TextView(this);
//            hobby.setText(appendedTexts);
//            hobby.setGravity(Gravity.CENTER);
//            team_layout.addView(hobby);
//            appendedTexts.delete(0, appendedTexts.length());

            ListView list_hobby = new ListView(this);
            list_hobby.setNestedScrollingEnabled(true);
            list_hobby.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 300));

            ArrayAdapter<String> list_hobby_adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, team_details.get(i).getHobbies());
            list_hobby.setAdapter(list_hobby_adapter);

            if (team_details.get(i).getHobbies().size() > 0) {
                team_layout.addView(hobbies_label);
                team_layout.addView(list_hobby);
            }

//            End of hobbies
//            Interests

            TextView interests_label = new TextView(this);
            interests_label.setText("Interests: ");
            interests_label.setTextAppearance(this, android.R.style.TextAppearance_Medium);

//            for (int j = 0; j < team_details.get(i).getInterests().size(); j++) {
//                appendedTexts.append(team_details.get(i).getInterests().get(j) + ", ");
//            }

//            TextView interest = new TextView(this);
//            interest.setText(appendedTexts);
//            interest.setGravity(Gravity.CENTER);
//            team_layout.addView(interest);
//            appendedTexts.delete(0, appendedTexts.length());

            ListView list_interest = new ListView(this);
            list_interest.setNestedScrollingEnabled(true);
            list_interest.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 300));

            ArrayAdapter<String> list_interest_adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, team_details.get(i).getInterests());
            list_interest.setAdapter(list_interest_adapter);

            if (team_details.get(i).getInterests().size() > 0) {
                team_layout.addView(interests_label);
                team_layout.addView(list_interest);
            }

//            End of interests
//            Songs

            TextView songs_label = new TextView(this);
            songs_label.setText("Songs: ");
            songs_label.setTextAppearance(this, android.R.style.TextAppearance_Medium);


//            for (int j = 0; j < team_details.get(i).getSongs().size(); j++) {
//                appendedTexts.append(team_details.get(i).getSongs().get(j) + ", ");
//            }
//
//            TextView song = new TextView(this);
//            song.setText(appendedTexts);
//            song.setGravity(Gravity.CENTER);
//            team_layout.addView(song);
//            appendedTexts.delete(0, appendedTexts.length());

            ListView list_song = new ListView(this);
            list_song.setNestedScrollingEnabled(true);
            list_song.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 300));

            ArrayAdapter<String> list_song_adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, team_details.get(i).getSongs());
            list_song.setAdapter(list_movie_adapter);

            if (team_details.get(i).getInterests().size() > 0) {
                team_layout.addView(songs_label);
                team_layout.addView(list_song);
            }
        }

    }

}