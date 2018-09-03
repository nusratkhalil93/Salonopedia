package com.example.hp.hostelfinder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DhkParListActivity extends AppCompatActivity {

    Button btnpersona,btnstyle,btnfarzana,btnaura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhk_par_list);

        btnpersona=findViewById(R.id.btn_persona);
        btnstyle=findViewById(R.id.btn_style);
        btnfarzana=findViewById(R.id.btn_farzana);
        btnaura=findViewById(R.id.btn_aura);

        btnpersona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(DhkParListActivity.this,DhkDetailsActivity.class);
                intent.putExtra("Parlour_name","one");
                Toast.makeText(DhkParListActivity.this, "Persona", Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });

        btnstyle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(DhkParListActivity.this,DhkDetailsActivity.class);
                intent.putExtra("Parlour_name","two");
                Toast.makeText(DhkParListActivity.this, "Style Lounge Salon", Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });

        btnfarzana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(DhkParListActivity.this,DhkDetailsActivity.class);
                intent.putExtra("parlour_name","three");
                Toast.makeText(DhkParListActivity.this, "Farzana Shakils Makeover Studio", Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });

        btnaura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(DhkParListActivity.this,DhkDetailsActivity.class);
                intent.putExtra("Parlour_name","four");
                Toast.makeText(DhkParListActivity.this, "Aura Beauty Lounge", Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });

    }
    }


