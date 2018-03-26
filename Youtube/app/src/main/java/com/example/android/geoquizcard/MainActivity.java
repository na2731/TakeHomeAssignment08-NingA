package com.example.android.geoquizcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public List<Question>videos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"Try to click these videos!",Toast.LENGTH_LONG).show();

        initialData();

        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new QuestionsAdapter(videos,this));
    }


    public void initialData(){
        videos=new ArrayList<>();
        videos.add(new Question(R.drawable.drawable5,this.getString(R.string.Topic1),this.getString(R.string.Description1),this.getString(R.string.View1)));
        videos.add(new Question(R.drawable.drawable4,this.getString(R.string.Topic2),this.getString(R.string.Description1),this.getString(R.string.View2)));
        videos.add(new Question(R.drawable.drawable6,this.getString(R.string.Topic3),this.getString(R.string.Description3),this.getString(R.string.View3)));
        videos.add(new Question(R.drawable.drawable2,this.getString(R.string.Topic4),this.getString(R.string.Description1),this.getString(R.string.View4)));
        videos.add(new Question(R.drawable.drawable3,this.getString(R.string.Topic5),this.getString(R.string.Description2),this.getString(R.string.View1)));
        videos.add(new Question(R.drawable.drawable1,this.getString(R.string.Topic6),this.getString(R.string.Description1),this.getString(R.string.View5)));
    }
}
