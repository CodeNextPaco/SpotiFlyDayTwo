package com.example.spotiflydaytwo;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

public class SongsActivity extends AppCompatActivity {

    private TextView message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);


        Bundle bundle = getIntent().getExtras();

        String title = (String)bundle.get("title");

        this.setTitle(title);



        //this activity will only use a simple ListView and a String ArrayList
        ArrayList<String> songs = new ArrayList<>();


        songs.add("Suge - DaBaby");
        songs.add("One - Metallica");
        songs.add("Otro Trago - Sech");
        songs.add("Bossa No Se - Cuco");
        songs.add("Harmony Hall - Vampire Weekend");
        songs.add("Binge - Solange");
        songs.add("Malamente - Rosalia");
        songs.add("Juice - Lizzo");
        songs.add("I Shot the Sheriff - Bob Marley");
        songs.add("Ol' Town Road - Lil Nas X");
        songs.add("The End of the World - Sharon Van Etten");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,   android.R.layout.simple_list_item_1, songs);


        ListView listView = findViewById(R.id.songs_list);
        listView.setAdapter(adapter);



    }
}
