package com.kenjo_coding.fragmenttransaction;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 初回はaddでOK
        getSupportFragmentManager() // ActivityでManager取得はこれ
                .beginTransaction()
                .replace(R.id.fragment_container_view, new FirstFragment())
                .commit();
    }
}