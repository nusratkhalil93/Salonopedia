package com.example.hp.hostelfinder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CtgParlourListActivity extends AppCompatActivity {

    Button btnart,btntouch,btnallure,btnbuffet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ctgparlour_list);

        btnart=findViewById(R.id.btn_art);
        btntouch=findViewById(R.id.btn_touch);
        btnallure=findViewById(R.id.btn_allure);
        btnbuffet=findViewById(R.id.btn_buffet);

        btnart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(CtgParlourListActivity.this,CtgDetailsActivity.class);
                intent.putExtra("Parlour_name","one");
                Toast.makeText(CtgParlourListActivity.this, "Art and Beauty Salon", Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });

        btntouch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(CtgParlourListActivity.this,CtgDetailsActivity.class);
                intent.putExtra("Parlour_name","two");
                Toast.makeText(CtgParlourListActivity.this, "Touch and Glow", Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });

        btnallure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(CtgParlourListActivity.this,CtgDetailsActivity.class);
                intent.putExtra("parlour_name","three");
                Toast.makeText(CtgParlourListActivity.this, "Allure Beauty Parlour", Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });

        btnbuffet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(CtgParlourListActivity.this,CtgDetailsActivity.class);
                intent.putExtra("Parlour_name","four");
                Toast.makeText(CtgParlourListActivity.this, "Beauty Buffet", Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });

    }
}
