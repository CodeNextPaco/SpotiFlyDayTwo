package com.example.spotiflydaytwo.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.spotiflydaytwo.R;
import com.example.spotiflydaytwo.data.CategoryItem;


import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


public class CategoryAdapter extends ArrayAdapter<CategoryItem> {


    public CategoryAdapter(@NonNull Context context,  @NonNull ArrayList<CategoryItem> categoryArrayList) {
        super(context, 0, categoryArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        /*****************************************************************************
         *This method is a custom getView. To add i, use Ctrl + O to open the method override menu, and select getView()
         *
         * It will return the view for each row, based on the matching data for that row in the categoryArrayList.
         * It uses position to determine the index of the row.
         * First, we "inflate" the view based on the xml file we made, so we have access to all of its views
         * Next, we get the item properties from our object and set the text on the TextViews.
         * Finally, we return the row
         *
         **************************************************************************/

        View listItemView = convertView;


        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.category_list_item, parent, false);
        }

        // Get the object located at this position in the list
        CategoryItem currentItem = getItem(position);

        //Get the views from our custom xml layout.
        //Notice we are using the incoming listItemView to find them by id.
        TextView categoryItem = (TextView) listItemView.findViewById(R.id.item_text_view);
        TextView categoryType = (TextView) listItemView.findViewById(R.id.category_text_view);

        //set the text for both TextViews using our class getters
        categoryItem.setText(currentItem.getCatetoryText());
        categoryType.setText(currentItem.getCategoryType());

        Log.d("CategoryAdapter", "imageID: " + currentItem.getResourceID());

        if(currentItem.getResourceID()> 0){

            //set the drawable if it exists
            ImageView itemImage = (ImageView) listItemView.findViewById(R.id.item_image_view);
            int drawableID = currentItem.getResourceID();
            itemImage.setImageResource(drawableID);

        }



        return  listItemView;


    }
}
