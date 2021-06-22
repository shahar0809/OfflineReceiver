package com.example.offline;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class OfflineActivity extends AppCompatActivity {

    AlertDialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offline);

        /* User loading dialog */
        AlertDialog.Builder builder = new AlertDialog.Builder(OfflineActivity.this);
        builder.setCancelable(false);
        builder.setView(R.layout.dialog);
        dialog = builder.create();
        dialog.show();

    }
}