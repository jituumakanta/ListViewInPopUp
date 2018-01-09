package com.example.lenovo.listviewinpopup;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayAdapter adapter;
    ListView myNames;
    String[] mobileArray = {"Android","IPhone","WindowsMobile","Blackberry",
            "WebOS","Ubuntu","Windows7","Max OS X"};


    ArrayList arrayList=new ArrayList();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrayList.add("ddd");
        arrayList.add("kkk");
        arrayList.add("sss");

        Button clickButton = (Button) findViewById(R.id.clickButton);
        clickButton.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.before_submit);
                dialog.setTitle("Title...");
                myNames= (ListView) dialog.findViewById(R.id.List);
                adapter = new ArrayAdapter<String>(getApplicationContext(),R.layout.answer_view,arrayList);
                myNames.setAdapter(adapter);
                dialog.show();
            }
        });
    }
}
