package com.technishaun.teamcdc;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.LinkedList;
import java.util.List;

public class TeamList extends AppCompatActivity {

    private List<Person> team = new LinkedList<Person>();
    private List<String> team_people = new LinkedList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_list);

        /*

        1st person = Shaun

         */

        Person person1 = new Person("Shaun Cassidy Calagos");
        String hobbies[] = new String[]{"Gaming", "Learning new programming languages"};
        String interests[] = {"Technology", "Art", "Gaming"};
        String movies[] = {"Love, Rosie", "Spider-Man"};
        String games[] = {"Call of Duty", "Battlefield"};

        person1.addSong(new String[]{"Princess of China", "Every Teardrop is a Waterfall", "Yellow", "Sparks"});
        person1.addMovie(movies);
        person1.addGame(games);
        person1.addInterest(interests);
        person1.addHobby(hobbies);

        team.add(person1);


        /*

        2nd person = Kat

         */

        Person person2 = new Person("Kat Delfin");
        person2.addGame(new String[]{"Surgeon 3", "Clash Royale"});
        person2.addHobby(new String[]{"Eating", "Sleeping", "Reading", "Watching TV Series"});
        person2.addMovie(new String[]{"None"});
        person2.addSong(new String[]{"Bring me to Life - Evanescence","Emotion - Carly Rae Jepsen"});

        team.add(person2);

        /*

        3rd person = Bendrhick

         */

        Person person3 = new Person("Bendrhick Co");
        person3.addSong(new String[]{""});

        for (int i = 0; i < team.size(); i++) {
            team_people.add(team.get(i).getName());
        }

        for (int i = 0; i < team.size(); i++) {
            ListView layout = (ListView) findViewById(R.id.result);
            ArrayAdapter<String> list = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, team_people);
            layout.setAdapter(list);
        }


    }

}
