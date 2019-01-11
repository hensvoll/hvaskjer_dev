package com.takeit.hvaskjerlistview;

import android.app.Activity;
import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MainActivity extends Activity {
    private Connection connnection;
    private Statement statement;
    private ResultSet resultSet;
    private CallableStatement callableStatement;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<HvaSkjer> hvaSkjerArray = HvaSkjerArray.getHvaSkerArrayList();



        ListView listView = (ListView)findViewById(R.id.listView_id);
        HvaSkjerAdapter adapter = new HvaSkjerAdapter(this, R.layout.adapter_view_layout, hvaSkjerArray);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(null,"Da skjerdet...", Toast.LENGTH_LONG).show();
                Log.d("listView2", "listView:" + ", view:" + view.getClass() + ", position:" + position );
            }
        });
    }
   /* @Override
    public void onListItemClick(ListView listView, View view, int position, long id) {
        Log.d("listView2", "listView:" + listView +
                ", view:" + view.getClass() +
                ", position:" + position );
    }*/
}
