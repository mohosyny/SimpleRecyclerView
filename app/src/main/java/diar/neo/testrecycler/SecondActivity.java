package diar.neo.testrecycler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    public static final String KEY_NAME="name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle bundle=getIntent().getExtras();

        TextView txtName=findViewById(R.id.name);

        txtName.setText(bundle.getString(KEY_NAME));


    }
}
