package diar.neo.testrecycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

import diar.neo.testrecycler.Adapter.MyRecyclerAdapter;
import diar.neo.testrecycler.Model.User;

public class MainActivity extends AppCompatActivity {

    List<User> mUsers = new ArrayList<>();
    MyRecyclerAdapter myRecyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUsers();


        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        myRecyclerAdapter = new MyRecyclerAdapter(this, mUsers);


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);

        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(myRecyclerAdapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }

    private void setUsers() {

        mUsers.add(new User("amir", "amiri"));
        mUsers.add(new User("reza", "rezayi"));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.add) {
            mUsers.add(new User("mamad", "mamadi"));
            myRecyclerAdapter.addUser(mUsers);
        }
        return super.onOptionsItemSelected(item);
    }
}
