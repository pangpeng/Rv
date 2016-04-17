package com.example.pangpeng.rv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        rv = new RecyclerView(this);
//        setContentView(R.layout.activity_main);
        setContentView(rv);
        rv.setLayoutManager(new GridLayoutManager(this,3,LinearLayoutManager.HORIZONTAL,false));
//        rv.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,true)); //线性布局第三项是否反转
        rv.setAdapter(new MyAdapter());




    }

}
