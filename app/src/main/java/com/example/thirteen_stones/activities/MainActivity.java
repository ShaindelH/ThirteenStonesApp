package com.example.thirteen_stones.activities;

import android.content.Intent;
import android.os.Bundle;

import com.example.thirteen_stones.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.appcompat.widget.Toolbar;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.thirteen_stones.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;

import lib.DialogUtils;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate (Bundle savedInstanceState)
    {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make (toolbar,"Hello, world!", Snackbar.LENGTH_SHORT).show ();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch (id) {
            case R.id.action_settings:
                showSettings();
                return true;
            case R.id.action_about:
                showAbout();
                return true;
            case R.id.action_new_game:
                startNextNewGame();
                return true;
            case R.id.action_statistics:
                showStatistics();
                return true;
            case R.id.action_reset_stats:
                //mGame.resetStatistics();
                return true;

        }

        return super.onOptionsItemSelected(item);
    }

    private void showStatistics() {
        Intent intent = new Intent(getApplicationContext(), StatisticsActivity.class);
        startActivity(intent);
    }

    private void startNextNewGame() {
    }

    private void showAbout() {
        DialogUtils.showInfoDialog(this,"About 13 Stones", "This is our second in-class app of the semester");
    }

    private void showSettings() {
    }

    public void pick123(View view) {

    }
}