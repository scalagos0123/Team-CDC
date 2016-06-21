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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_list);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Team CDC");


        /*

        If you want to programatically add layouts, dito nyo ilagay sa method na to.
        [Can also be applied to widgets. (ex: TextView) Same format lang din like the example]

        Use case:

        Layout x = new Layout(this);

        Where:
        - x can be any variable name you want, to call the layout
        - Layout can be any layout that you want to use (Android API kayo pumunta,
        sa Design tab nandun yung list of Layouts na pwede nyong gamitin,
        or yung slides ni Sir Art.
        - this meaning, the layout will be added for this activity.

        Ex:
        Linearlayout myLayout = new LinearLayout(this);

        ---------------------------------------------------------

        Q: What if you want to use a layout na nilagay nyo na sa XML file?
        A: Use the R.id class!

        Use case:

        Layout x = (Layout) findViewById(R.id.y);

        Where:
        - x can be any variable name
        - Layout will be the layout na gusto nyong tawagin sa XML file
        - y will be the element id that you want to call and use here
        (Can also be applied to widgets (ex. TextView). Same format lang din like the example)

         */

    }

}