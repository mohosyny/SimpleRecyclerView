package diar.neo.testrecycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;

import android.icu.lang.UScript;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import diar.neo.testrecycler.Adapter.MyRecyclerAdapter;
import diar.neo.testrecycler.Model.User;

public class MainActivity extends AppCompatActivity {

    List<User> mUsers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        MyRecyclerAdapter myRecyclerAdapter = new MyRecyclerAdapter(this, getUsers());


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);

        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(myRecyclerAdapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }

    private List<User> getUsers() {

        mUsers = new ArrayList<>();
        mUsers.add(new User("amir", "amiri"));
        mUsers.add(new User("reza", "rezayi"));
        mUsers.add(new User("ahmad", "ahmadi"));
        mUsers.add(new User("mamad", "mamadi"));
        mUsers.add(new User("hesam", "chepeli"));
        mUsers.add(new User("amir", "amiri"));
        mUsers.add(new User("reza", "rezayi"));
        mUsers.add(new User("ahmad", "ahmadi"));
        mUsers.add(new User("mamad", "mamadi"));
        mUsers.add(new User("hesam", "chepeli"));
        mUsers.add(new User("amir", "amiri"));
        mUsers.add(new User("reza", "rezayi"));
        mUsers.add(new User("ahmad", "ahmadi"));
        mUsers.add(new User("mamad", "mamadi"));
        mUsers.add(new User("hesam", "chepeli"));
        mUsers.add(new User("amir", "amiri"));
        mUsers.add(new User("reza", "rezayi"));
        mUsers.add(new User("ahmad", "ahmadi"));
        mUsers.add(new User("mamad", "mamadi"));
        mUsers.add(new User("hesam", "chepeli"));
        mUsers.add(new User("ahmad", "ahmadi"));
        mUsers.add(new User("mamad", "mamadi"));
        mUsers.add(new User("hesam", "chepeli"));
        mUsers.add(new User("amir", "amiri"));
        mUsers.add(new User("reza", "rezayi"));
        mUsers.add(new User("ahmad", "ahmadi"));
        mUsers.add(new User("mamad", "mamadi"));
        mUsers.add(new User("hesam", "chepeli"));


        return mUsers;
    }
}
