package com.example.hp.hostelfinder;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class CtgDetailsActivity extends AppCompatActivity {

    ImageView imgParlour;
    TextView txtName, txtDesc;
    Button btnCell;
    String mobilenumber[] = {"01754-295238", "01795-064308", "01730-072100", " 01795-776611"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ctg_details);

        imgParlour = findViewById(R.id.img_parlour);
        txtName = findViewById(R.id.txt_name);
        txtDesc = findViewById(R.id.txt_desc);
        btnCell = findViewById(R.id.btn_cell);

        String getName = getIntent().getExtras().getString("parlour_name");

        if (getName.equals("one")) {
            imgParlour.setImageResource(R.drawable.beauty);
            txtName.setText("Art and Beauty Salon");
            txtDesc.setText("Address:Epic Emdad Heights, 38, A-6,6th floor Chatteshawri Circle Chittagong\n" +
                    "Chittagong\n" +
                    "Chittagong\n\nHours: Open 10:00AM Closes 11:30PM\n\nMobile Number-" + mobilenumber[0]);
            btnCell.setText("CALL");

            btnCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[0]));
                    if (ActivityCompat.checkSelfPermission(CtgDetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        // TODO: Consider calling
                        //    ActivityCompat#requestPermissions
                        // here to request the missing permissions, and then overriding
                        //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                        //                                          int[] grantResults)
                        // to handle the case where the user grants the permission. See the documentation
                        // for ActivityCompat#requestPermissions for more details.
                        return;
                    }
                    startActivity(intent);
                }


            });

        } else if (getName.equals("two")) {
            imgParlour.setImageResource(R.drawable.touch);
            txtName.setText("Touch and Glow");
            txtDesc.setText("Address:address-1051,Shubarna R/A,O.R Nizam Road,Panchlaish,Bangladesh\n" +
                    "Chittagong\n" +
                    "Chittagong\n\nHours: Open 10:00AM Closes 11:30PM\n\nMobile Number-" + mobilenumber[1]);
            btnCell.setText("CALL");

            btnCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[1]));
                    if (ActivityCompat.checkSelfPermission(CtgDetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        // TODO: Consider calling
                        //    ActivityCompat#requestPermissions
                        // here to request the missing permissions, and then overriding
                        //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                        //                                          int[] grantResults)
                        // to handle the case where the user grants the permission. See the documentation
                        // for ActivityCompat#requestPermissions for more details.
                        return;
                    }
                    startActivity(intent);
                }


            });


        } else if (getName.equals("three")) {
            imgParlour.setImageResource(R.drawable.allure);
            txtName.setText("Allure Beauty Parlour");
            txtDesc.setText("Address:address-1306,O.R Nizam Road, Golpahar Circle ( Beside BATA Showroom )Post Code 4000\n" +
                    "Chittagong\n" +
                    "Chittagong\n\nHours: Open 10:00AM Closes 11:30PM\n\nMobile Number-" + mobilenumber[2]);
            btnCell.setText("CALL");

            btnCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[2]));
                    if (ActivityCompat.checkSelfPermission(CtgDetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        // TODO: Consider calling
                        //    ActivityCompat#requestPermissions
                        // here to request the missing permissions, and then overriding
                        //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                        //                                          int[] grantResults)
                        // to handle the case where the user grants the permission. See the documentation
                        // for ActivityCompat#requestPermissions for more details.
                        return;
                    }
                    startActivity(intent);
                }


            });
        }

        else if (getName.equals("four")) {
            imgParlour.setImageResource(R.drawable.buffet);
            txtName.setText("Allure Beauty Parlour");
            txtDesc.setText("Address:AS TOWER, Plot# 553, Road# 1, Hill View\n" +
                    "Chittagong\n" +
                    "Chittagong\n" +
                    "Chittagong\n\nHours: Open 10:00AM Closes 11:30PM\n\nMobile Number-" + mobilenumber[3]);
            btnCell.setText("CALL");

            btnCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[3]));
                    if (ActivityCompat.checkSelfPermission(CtgDetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        // TODO: Consider calling
                        //    ActivityCompat#requestPermissions
                        // here to request the missing permissions, and then overriding
                        //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                        //                                          int[] grantResults)
                        // to handle the case where the user grants the permission. See the documentation
                        // for ActivityCompat#requestPermissions for more details.
                        return;
                    }
                    startActivity(intent);
                }


            });
            }
        }
    }


