package com.takeit.hvaskjerlistview;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Connection connnection;
    private Statement statement;
    private ResultSet resultSet;
    private CallableStatement callableStatement;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        //setSupportActionBar(myToolbar);
        //myToolbar.setSubtitle("Hva Skjer på Nesodden");
        //myToolbar.setBackgroundColor(Color.CYAN);
        //TextView toolText = findViewById(R.id.textView_toolbar);
        //myToolbar.addView(toolText);

        final ArrayList<HvaSkjer> hvaSkjerArray = HvaSkjerArray.getHvaSkerArrayList();
        ListView listView = (ListView)findViewById(R.id.listView_id);
        HvaSkjerAdapter adapter = new HvaSkjerAdapter(this, R.layout.adapter_view_layout, hvaSkjerArray);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(null,"Da skjerdet...", Toast.LENGTH_LONG).show();
                String sted = hvaSkjerArray.get(position).getPlace();
                String title = hvaSkjerArray.get(position).getTitle();
                String date = hvaSkjerArray.get(position).getDate();
                String description = hvaSkjerArray.get(position).getDescription();
                //Log.d("listView2", "listView:" + ", view:" + view.getClass() + ", position:" + position );
                Log.d("listView2", "sted: " + sted + " dato: " + date + " tittel: " + title + ", position:" + position );
                Bundle bundle = new Bundle();
                bundle.putString(GlobalConstant.BUNDLE_PLACE,sted);
                bundle.putString(GlobalConstant.BUNDLE_TITLE,title);
                bundle.putString(GlobalConstant.BUNDLE_DATE,date);
                bundle.putString(GlobalConstant.BUNDLE_DESCRIPTION,description);
                startEventActivity(bundle);
            }
        });
    }

    private void startEventActivity(Bundle bundle) {
        Intent intent = new Intent(this, EventActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_menu, menu);
        return true;
    }
   /* @Override
    public void onListItemClick(ListView listView, View view, int position, long id) {
        Log.d("listView2", "listView:" + listView +
                ", view:" + view.getClass() +
                ", position:" + position );
    }*/

   @Override
   public boolean onOptionsItemSelected(MenuItem item){
       /*switch (item.getItemId()) {
           case R.id.action_1:
                // do something
               return true;
           case R.id.action_2:
                // do something else
       }*/
           return true;

   }
}
