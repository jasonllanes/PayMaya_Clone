package com.example.paymaya;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.google.android.material.snackbar.Snackbar;

public class Rewards_Activity extends AppCompatActivity {

    ImageView btnBack;
    Button btnYes,btnNo;
    LinearLayout layout,btnTreat_1,btnTreat_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rewards);

        layout = findViewById(R.id.layout);

        btnTreat_1 = findViewById(R.id.btnTreat_1);
        btnTreat_2 = findViewById(R.id.btnTreat_2);

        btnTreat_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog builder = new Dialog(Rewards_Activity.this);
                builder.requestWindowFeature(Window.FEATURE_NO_TITLE);
                builder.setContentView(R.layout.redeem_poop);
                builder.setCancelable(true);
                builder.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));

                btnYes = builder.findViewById(R.id.btnYes);
                btnYes.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Snackbar customSnackBar = Snackbar.make(layout, "Redeemed Successfully", Snackbar.LENGTH_LONG);
                        customSnackBar.setTextColor(ContextCompat.getColor(Rewards_Activity.this,R.color.white));
                        customSnackBar.setBackgroundTint(ContextCompat.getColor(Rewards_Activity.this,R.color.green));
                        customSnackBar.show();

                        btnTreat_1.setVisibility(View.INVISIBLE);
                        builder.dismiss();

                    }
                });

                btnNo = builder.findViewById(R.id.btnNo);
                btnNo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        builder.dismiss();
                    }
                });
                builder.show();
            }
        });

        btnTreat_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog builder = new Dialog(Rewards_Activity.this);
                builder.requestWindowFeature(Window.FEATURE_NO_TITLE);
                builder.setContentView(R.layout.redeem_poop);
                builder.setCancelable(true);
                builder.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));

                btnYes = builder.findViewById(R.id.btnYes);
                btnYes.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Snackbar customSnackBar = Snackbar.make(layout, "Redeemed Successfully", Snackbar.LENGTH_LONG);
                        customSnackBar.setTextColor(ContextCompat.getColor(Rewards_Activity.this,R.color.white));
                        customSnackBar.setBackgroundTint(ContextCompat.getColor(Rewards_Activity.this,R.color.green));
                        customSnackBar.show();

                        btnTreat_2.setVisibility(View.INVISIBLE);
                        builder.dismiss();

                    }
                });

                btnNo = builder.findViewById(R.id.btnNo);
                btnNo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        builder.dismiss();
                    }
                });
                builder.show();
            }
        });


        btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}