package com.tania.androidmaster.main.main;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.tania.androidmaster.R;
import com.tania.androidmaster.main.fragment.TabLayoutFragment;

public class MainActivity extends AppCompatActivity {

    FragmentManager fragmentManager;

    public  static ImageView iconBackArrow;
    public static TextView toolbarTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);

        iconBackArrow = (ImageView) findViewById(R.id.iconBackArrow);
        toolbarTextView = (TextView) findViewById(R.id.toolbarTextView);

        toolbarTextView.setText("Android Master");

        fragmentManager = getSupportFragmentManager();

        TabLayoutFragment tabLayoutFragment = new TabLayoutFragment();

        fragmentManager.beginTransaction().replace(R.id.container_body,tabLayoutFragment).commit();



    }




}
