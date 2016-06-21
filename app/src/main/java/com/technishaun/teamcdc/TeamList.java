package com.technishaun.teamcdc;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
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
        person2.addMovie(new String[]{"None"});
        person2.addSong(new String[]{"Bring me to Life - Evanescence","Emotion - Carly Rae Jepsen"});

        team_details.add(person2);

        /*

        3rd person = Bendrhick

         */

        Person person3 = new Person("Bendrhick Co");
        person3.addSong(new String[]{"Middle", "Vanilla Twilignt"});
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
            name.setTextSize(30);
            team_layout.addView(name);
            System.out.println(team_details.get(i).getGames().size());

            for (int j = 0; j < team_details.get(i).getGames().size(); j++) {
                appendedTexts.append(team_details.get(j).getGames().get(j) + ", ");
            }
//
            TextView game = new TextView(this);
            game.setText(appendedTexts);
            team_layout.addView(game);
            appendedTexts.delete(0, appendedTexts.lastIndexOf(appendedTexts.toString()));

            for (int j = 0; j < team_details.get(i).getMovies().size(); j++) {
                appendedTexts.append(team_details.get(j).getMovies().get(j) + ", ");
            }

            TextView movie = new TextView(this);
            movie.setText(appendedTexts);
            team_layout.addView(movie);
            appendedTexts.delete(0, appendedTexts.lastIndexOf(appendedTexts.toString()));

            for (int j = 0; j < team_details.get(i).getHobbies().size(); j++) {
                appendedTexts.append(team_details.get(j).getHobbies().get(j) + ", ");
            }

            TextView hobby = new TextView(this);
            hobby.setText(appendedTexts);
            team_layout.addView(hobby);
            appendedTexts.delete(0, appendedTexts.lastIndexOf(appendedTexts.toString()));

            for (int j = 0; j < team_details.get(i).getInterests().size(); j++) {
                appendedTexts.append(team_details.get(j).getInterests().get(j) + ", ");
            }

            TextView interest = new TextView(this);
            interest.setText(appendedTexts);
            team_layout.addView(interest);
            appendedTexts.delete(0, appendedTexts.lastIndexOf(appendedTexts.toString()));

            for (int j = 0; j < team_details.get(i).getSongs().size(); j++) {
                appendedTexts.append(team_details.get(j).getSongs().get(j) + ", ");
            }

            TextView song = new TextView(this);
            song.setText(appendedTexts);
            team_layout.addView(song);
            appendedTexts.delete(0, appendedTexts.lastIndexOf(appendedTexts.toString()));

        }

//        for (int i = 0; i < team_details.size(); i++) {
//            ListView layout = (ListView) findViewById(R.id.result);
//            ArrayAdapter<String> list = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, team_people);
//            layout.setAdapter(list);
//        }


    }

}
