package com.example.assignment6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    ListFragment mListFragment;
    ButtonFragment mButtonFragment;

    @Override
        public void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListFragment = new ListFragment();
        mButtonFragment = new ButtonFragment();

        FragmentTransaction transaction =
                getSupportFragmentManager().beginTransaction();

        transaction.add(R.id.list_fragment, mListFragment);
        transaction.add(R.id.buttons_fragment, mButtonFragment);

        transaction.commit();

    }

    //tehtävä jäi keskeneräiseksi, yritetty myös toteuttaa DBHelper luokkaa
    }
