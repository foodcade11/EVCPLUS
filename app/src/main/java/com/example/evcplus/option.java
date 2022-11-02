package com.example.evcplus;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.EditText;

public class option extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);
        AlertDialog.Builder ob=new AlertDialog.Builder(option.this);
        ob.setTitle("-EVCPLUS-");
        ob.setMessage("1.Itus Haraagaaga\n2.Kaarka Hadalka\n3.Bixi bilka\n4.Uwareeji Evcplus\n5.Warbixin Kooban\n6.Salaam Bank\n7.Maareynta\n8.Taaj\n9.Pill Payment");
        EditText op=new EditText(option.this);
        ob.setView(op);
        ob.setNegativeButton("Cencel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        ob.setPositiveButton("Send", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        AlertDialog a=ob.create();
        a.show();
    }
}