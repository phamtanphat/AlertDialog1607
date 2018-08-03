package com.ptp.phamtanphat.alertdialog1607;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button btnAlertDialog;
//    5 == hang so

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAlertDialog = findViewById(R.id.buttonAlertDialog);

        btnAlertDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alertdialog = new AlertDialog.Builder(MainActivity.this);
                alertdialog.setTitle("Ban hay chon 1 con vat");
//                alertdialog.setMessage("Ban co muon thoat app hay khong?");
                alertdialog.setIcon(R.mipmap.ic_launcher);
                alertdialog.setCancelable(false);

//                alertdialog.setPositiveButton("Co", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//                        Toast.makeText(MainActivity.this, "Ban da chon Co", Toast.LENGTH_SHORT).show();
//                    }
//                });
//                alertdialog.setNegativeButton("Khong", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//                        Toast.makeText(MainActivity.this, "Ban da chon Khong", Toast.LENGTH_SHORT).show();
//                    }
//                });
//                alertdialog.setNeutralButton("Huy", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//                        Toast.makeText(MainActivity.this, "Ban da chon Huy", Toast.LENGTH_SHORT).show();
//                    }
//                })
                //Chon 1 trong nhung gia tri trong list
//                final String[] mangconvat = {"Con meo","Con cho","Con ga","Con gau"};
//                alertdialog.setSingleChoiceItems(mangconvat, 0, new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//                        Toast.makeText(MainActivity.this, mangconvat[i], Toast.LENGTH_SHORT).show();
//                        dialogInterface.cancel();
//                    }
//                });

                String[] mangngongu = {"C","C++","C#","Android","Java"};
                boolean[] mangchecked = {false,false,false,false,false};
                alertdialog.setMultiChoiceItems(mangngongu, mangchecked, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i, boolean b) {
                        if (b){
                            Toast.makeText(MainActivity.this, "Da check", Toast.LENGTH_SHORT).show();
                        }else{
                            Toast.makeText(MainActivity.this, "Bo check", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
                alertdialog.show();
            }
        });
    }
}
