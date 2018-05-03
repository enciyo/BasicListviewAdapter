package com.example.enciyo.deneme;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.enciyo.deneme.Adapter.ListviewAdapter;

import java.util.ArrayList;
import java.util.List;

import static com.example.enciyo.deneme.R.drawable.ic_launcher_foreground;

public class MainActivity extends AppCompatActivity {

    ListView _dynamic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        _dynamic=(ListView)findViewById(R.id.listView);
        List<Repo> list=new ArrayList<>();
       list.add(new Repo("title","subtitle"));
       list.add(new Repo("title2","subtitle2"));
       list.add(new Repo("title3","subtitle3"));



        ListviewAdapter listviewAdapter=new ListviewAdapter(this,list);
        _dynamic.setAdapter(listviewAdapter);

    }
}
