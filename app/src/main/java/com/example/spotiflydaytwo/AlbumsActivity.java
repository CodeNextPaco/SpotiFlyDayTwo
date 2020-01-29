package com.example.spotiflydaytwo;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import com.example.spotiflydaytwo.adapters.CategoryAdapter;
import com.example.spotiflydaytwo.data.CategoryItem;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

public class AlbumsActivity extends AppCompatActivity {

    private TextView message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        //inside onCreate
       // message = findViewById(R.id.albums_txt_view);
        Bundle bundle = getIntent().getExtras();
        String msg = (String)bundle.get("msg");
        String title = (String)bundle.get("title");

        this.setTitle(title);
       // message.setText(msg);

        ArrayList<CategoryItem> albums = new ArrayList<CategoryItem>();

        CategoryItem twenty_one = new CategoryItem("Twenty One" , "Adele", R.drawable.twenty_one);
        CategoryItem born_to_die = new CategoryItem("Born to Die" , "Lana Del Rey", R.drawable.born_to_die);
        CategoryItem dirty_computer = new CategoryItem("Dirty Computer" , "Born to Die", R.drawable.dirty_computer);
        CategoryItem illmatic = new CategoryItem("Illmatic" , "Nas", R.drawable.illmatic);
        CategoryItem legend = new CategoryItem("Legend" , "Bob Marley", R.drawable.bob_marley);
        CategoryItem lemonade = new CategoryItem("Lemonade" , "Beyonce", R.drawable.lemonade);
        CategoryItem american_idiot = new CategoryItem("American Idiot" , "Green Day", R.drawable.american_idiot);

        albums.add(twenty_one);
        albums.add(born_to_die);
        albums.add(dirty_computer);
        albums.add(illmatic);
        albums.add(legend);
        albums.add(lemonade);
        albums.add(american_idiot);

        CategoryAdapter adapter = new CategoryAdapter(this, albums);
        ListView listView = (ListView) findViewById(R.id.albums_list);
        listView.setAdapter(adapter);


    }
}
