package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView rv=findViewById(R.id.recyclerView);

        ArrayList<Group> dataone=new ArrayList<>();
        for (int i=1;i<101;i++){
            Group myGroup=new Group();
            myGroup.setGroupName("群聊"+i);
            myGroup.setGroupNews("哈哈哈哈哈");
            myGroup.setTime("星期一");
            myGroup.setGroupPicture(R.drawable.quntou2);
            dataone.add(myGroup);}
        Adapter myAdapter = new Adapter(dataone);
        rv.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
        rv.setAdapter(myAdapter);
        rv.setLayoutManager(new GridLayoutManager(this,1));
        rv.addItemDecoration(new DividerItemDecoration(
                this, DividerItemDecoration.VERTICAL));
    }
}