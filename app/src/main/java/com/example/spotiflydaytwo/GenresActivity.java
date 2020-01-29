package com.example.spotiflydaytwo;

import android.icu.util.ULocale;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.spotiflydaytwo.adapters.CategoryAdapter;
import com.example.spotiflydaytwo.data.CategoryItem;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

public class GenresActivity extends AppCompatActivity {

    //private TextView message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genres);


        ArrayList<CategoryItem> genres = new ArrayList<CategoryItem>();

        CategoryItem trap = new CategoryItem("trap", "genres" );
        CategoryItem hiphop = new CategoryItem("hip hop", "genres" );
        CategoryItem randb = new CategoryItem("R&B", "genres" );
        CategoryItem dancehall = new CategoryItem("Dancehall", "genres" );
        CategoryItem cumbia = new CategoryItem("Cumbia", "genres" );
        CategoryItem pop = new CategoryItem("pop", "genres" );
        CategoryItem punk = new CategoryItem("punk", "genres"  );



        genres.add(trap);
        genres.add(hiphop);
        genres.add(randb);
        genres.add(dancehall);
        genres.add(cumbia);
        genres.add(pop);
        genres.add(punk);


       // message = findViewById(R.id.genres_txt_view);
        Bundle bundle = getIntent().getExtras();
        String msg = (String)bundle.get("msg");
        String title = (String)bundle.get("title");

        this.setTitle(title);
       // message.setText(msg);


//        //Add the adapter and List view, then link
//        ArrayAdapter<CategoryItem> itemsAdapter = new ArrayAdapter<>(this,
//                android.R.layout.simple_list_item_1, genres);
//        ListView listView = findViewById(R.id.genres_list);
//        listView.setAdapter(itemsAdapter);


        CategoryAdapter adapter = new CategoryAdapter(this, genres );

        ListView listView = (ListView) findViewById(R.id.genres_list);
        listView.setAdapter(adapter);


    }
}
