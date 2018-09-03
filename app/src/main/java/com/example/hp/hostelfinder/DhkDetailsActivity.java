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

public class DhkDetailsActivity extends AppCompatActivity {

    ImageView imgParlour;
    TextView txtName, txtDesc;
    Button btnCell;
    String mobilenumber[] = {"8802 9016033", " 01758-183325", "01926-153010", "01799255555"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhk_details);

        imgParlour = findViewById(R.id.img_parlour);
        txtName = findViewById(R.id.txt_name);
        txtDesc = findViewById(R.id.txt_desc);
        btnCell=findViewById(R.id.btn_cell);

        String getName = getIntent().getExtras().getString("parlour_name");

        if (getName.equals("one")) {
            imgParlour.setImageResource(R.drawable.persona);
            txtName.setText("Persona");
            txtDesc.setText("Address:2nd Floor, Plot 1, Avenue 4\n" +
                    "Block C, Section 6, Mirpur\n" +
                    "Dhaka 1216\n\nHours: Open 10:00AM Closes 11:30PM\n\nMobile Number-" + mobilenumber[0]);
            btnCell.setText("CALL");

            btnCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[0]));
                    if (ActivityCompat.checkSelfPermission(DhkDetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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

        else if (getName.equals("two")) {
            imgParlour.setImageResource(R.drawable.style);
            txtName.setText("Style Lounge Salon");
            txtDesc.setText("Address:HOUSE # 45/A .5TH FLOOR DHANMONDI 27. LAND MARK AB BANK , OPPOSITE TO MEENA BAZAR\n" +
                    "Dhaka, Bangladesh\n\nHours: Open 10:00AM Closes 11:30PM\n\nMobile Number-"+mobilenumber[1]);
            btnCell.setText("CALL");

            btnCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[1]));
                    if (ActivityCompat.checkSelfPermission(DhkDetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
        else if (getName.equals("three")) {
            imgParlour.setImageResource(R.drawable.farzana);
            txtName.setText("Farzana Shakils Makeover Studio");
            txtDesc.setText("Address:AM TOWER (level # 2), House #4, Rd 22, Dhaka 1212\n" +
                    "Chittagong\n\nHours: Open 10:00AM Closes 11:30PM\n\nMobile Number-" + mobilenumber[2]);
            btnCell.setText("CALL");

            btnCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[2]));
                    if (ActivityCompat.checkSelfPermission(DhkDetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                imgParlour.setImageResource(R.drawable.aura);
                txtName.setText("Aura Beauty Lounge");
                txtDesc.setText("Address:Gold Palace, 2nd Floor, 3, New Baily Road\n" +
                        "Dhaka, Bangladesh\n" +
                        "Chittagong\n\nHours: Open 10:00AM Closes 11:30PM\n\nMobile Number-"+mobilenumber[3]);
                btnCell.setText("CALL");

                btnCell.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_CALL);
                        intent.setData(Uri.parse("tel:" + mobilenumber[3]));
                        if (ActivityCompat.checkSelfPermission(DhkDetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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

