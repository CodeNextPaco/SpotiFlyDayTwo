package com.example.spotiflydaytwo;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import com.example.spotiflydaytwo.adapters.CategoryAdapter;
import com.example.spotiflydaytwo.data.CategoryItem;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

public class ArtistActivity extends AppCompatActivity {

    private TextView message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);

        //inside onCreate
        //message = findViewById(R.id.artists_txt_view);
        Bundle bundle = getIntent().getExtras();
        String msg = (String)bundle.get("msg");
        String title = (String)bundle.get("title");

        this.setTitle(title);
       // message.setText(msg);

        ArrayList<CategoryItem> artists = new ArrayList<CategoryItem>();

        CategoryItem badbunny = new CategoryItem("Bad Bunny" , "Artist", R.drawable.bad_bunny);
        CategoryItem bia = new CategoryItem("Bia" , "Artist", R.drawable.bia);
        CategoryItem billie_eilish = new CategoryItem("Billie Eilish" , "Artist", R.drawable.billie_eilish);
        CategoryItem bob_marley = new CategoryItem("Bob Marley" , "Artist", R.drawable.bob_marley);
        CategoryItem dababay = new CategoryItem("DaBaby" , "Artist", R.drawable.dababy);
        CategoryItem drake = new CategoryItem("Drake" , "Artist", R.drawable.drake);
        CategoryItem iron_maiden = new CategoryItem("Iron Maiden" , "Artist", R.drawable.iron_maiden);
        CategoryItem lana_del_rey = new CategoryItem("Lana Del Rey" , "Artist", R.drawable.lana_del_rey);
        CategoryItem lil_nas_x = new CategoryItem("Lil Nas X" , "Artist", R.drawable.lil_nas_x);
        CategoryItem lizzo = new CategoryItem("Lizzo" , "Artist", R.drawable.lizzo);
        CategoryItem metallica = new CategoryItem("Metallica" , "Artist", R.drawable.metallica);
        CategoryItem misfits = new CategoryItem("Misfits" , "Artist", R.drawable.misfits);
        CategoryItem ozuna = new CategoryItem("Ozuna" , "Artist", R.drawable.ozuna);
        CategoryItem rosalia = new CategoryItem("Rosalia" , "Artist", R.drawable.rosalia);


        artists.add(badbunny);
        artists.add(bia);
        artists.add(billie_eilish);
        artists.add(bob_marley);
        artists.add(dababay);
        artists.add(drake);
        artists.add(iron_maiden);
        artists.add(lana_del_rey);
        artists.add(lil_nas_x);
        artists.add(lizzo);
        artists.add(metallica);
        artists.add(misfits);
        artists.add(ozuna);
        artists.add(rosalia);


        CategoryAdapter adapter = new CategoryAdapter(this, artists );

        ListView listView = (ListView) findViewById(R.id.artists_list);
        listView.setAdapter(adapter);




    }
}
