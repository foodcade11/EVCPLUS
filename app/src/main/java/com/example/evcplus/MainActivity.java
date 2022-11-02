package com.example.evcplus;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AlertDialog.Builder ob=new AlertDialog.Builder(MainActivity.this);

        ob.setTitle("-EVCPLUS-");

        ob.setMessage("Fadlan Kali Pinkaaga");
        EditText pincode=new EditText(MainActivity.this);
        ob.setView(pincode);
        ob.setNegativeButton("Cencel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        ob.setPositiveButton("Send", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                String code=pincode.getText().toString();
                if (code.equals("1234")){
                    Intent i2=new Intent(MainActivity.this,option.class);
                      startActivity(i2);
                }else{
                    Intent ii =new Intent(MainActivity.this,error.class);
                    startActivity(ii);
                }
            }
        });
        AlertDialog a=ob.create();
        a.show();

    }
}