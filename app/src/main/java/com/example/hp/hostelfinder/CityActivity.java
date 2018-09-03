package com.example.hp.hostelfinder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CityActivity extends AppCompatActivity {

    Button btnctg,btndhk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);

        btnctg=findViewById(R.id.btn_ctg);
        btndhk=findViewById(R.id.btn_dhk);


        btnctg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(CityActivity.this,CtgParlourListActivity.class);
                intent.putExtra("Parlour_location","one");
                Toast.makeText(CityActivity.this, "Chittagong", Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });

        btndhk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(CityActivity.this,CtgParlourListActivity.class);
                intent.putExtra("Parlour_location","two");
                Toast.makeText(CityActivity.this, "Dhaka", Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });


    }
}
