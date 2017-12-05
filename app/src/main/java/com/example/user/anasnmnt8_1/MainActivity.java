package com.example.user.anasnmnt8_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    //ListView is a view which groups several items and display them in vertical scrollable list. The list items are automatically
    // inserted to the list using an Adapter that pulls content from a source such as an array or database

    ArrayAdapter adapter;
    //ArrayAdapter object
    // adapter to provide views for an AdapterView, Returns a view for each object in a collection of data objects you provide,
    // and can be used with list-based user interface widgets such as ListView or Spinner
    //Array containing the months name
   String[] arr={"january","february","march","april","may","june","july","august","september","october","november","december"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initiling the listview
        listView = (ListView) findViewById(R.id.listview);
        //Initilazing the ArrayAdapter
        adapter= new ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,arr);
        listView.setAdapter(adapter);
    }

    public void Ascending(View view)//Ascending:it handles the ascending order by clicking this button

    {
        Arrays.sort(arr);//here we will sort given array

        adapter.notifyDataSetChanged();
        //Notifies the attached observes that the underlying data has been changed and any View reflecting the data set should
        // refresh itself
        Toast.makeText(this, "Month in ascending order", Toast.LENGTH_LONG).show();
    }

    public void Descending(View view)//Descending:it handles the descending order by clicking this button
    //It shows a toast aslo
    {
        Arrays.sort(arr, Collections.<String>reverseOrder());
        //here will sort the given string array into reverse order using collections
        adapter.notifyDataSetChanged();
        Toast.makeText(this, "Month in descending order", Toast.LENGTH_LONG).show();
    }
}