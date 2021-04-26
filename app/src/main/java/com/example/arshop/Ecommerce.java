package com.example.arshop;

import android.app.Application;

import com.google.firebase.database.FirebaseDatabase;

public class Ecommerce extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        FirebaseDatabase.getInstance().getReference().keepSynced(true);
    }
}