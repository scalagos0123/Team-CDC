package com.technishaun.teamcdc;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
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
        toolbar.setTitle("Choose a person");
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


        /*

        2nd person = Kat

         */

        Person person2 = new Person("Kat Delfin");
        person2.addGame(new String[]{"Surgeon 3", "Clash Royale"});
        person2.addHobby(new String[]{"Eating", "Sleeping", "Reading", "Watching TV Series"});
        person2.addSong(new String[]{"Bring me to Life - Evanescence", "Emotion - Carly Rae Jepsen"});

        /*

        3rd person = Bendrhick

         */

        Person person3 = new Person("Bendrhick Co");
        person3.addSong(new String[]{"Middle", "Vanilla Twilight"});
        person3.addMovie("Marvel Movies");
        person3.addInterest(new String[]{"Sleeping", "Swimming", "Working out", "Reading books"});

        team_details.add(person1);
        team_details.add(person2);
        team_details.add(person3);

        for (int i = 0; i < team_details.size(); i++) {
            team_details.get(i).setPersonId(i+1);
        }

        RelativeLayout team_layout = (RelativeLayout) findViewById(R.id.team);

        for (int i = 0; i < team_details.size(); i++) {
            team_people.add(team_details.get(i).getName());
        }

        ListView list_name = new ListView(this);
        ArrayAdapter<String> list_name_adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, team_people);
        list_name.setAdapter(list_name_adapter);
        team_layout.addView(list_name);

        final Intent person_info = new Intent(this, Profile.class);

        list_name.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String s = parent.getItemAtPosition(position).toString();

                for (int i = 0; i < team_people.size(); i++) {
                    if (s.equals(team_people.get(i))) {
                        person_info.putExtra("person", team_details.get(i));
                        startActivity(person_info);
                    }
                }
            }
        });

    }
}