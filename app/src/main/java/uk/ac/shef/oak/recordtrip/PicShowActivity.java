package uk.ac.shef.oak.recordtrip;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.ViewGroup;

import androidx.appcompat.widget.Toolbar;

import java.util.logging.Logger;

public class PicShowActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pic_show);
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Pictures");
        setSupportActionBar(toolbar);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                // Process the click event
                return true;
            }
        });
        recyclerView = findViewById(R.id.rec);
    }


}
