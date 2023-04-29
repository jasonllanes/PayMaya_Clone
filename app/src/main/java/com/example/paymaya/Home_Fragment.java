package com.example.paymaya;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;


public class Home_Fragment extends Fragment {
    LinearLayout layout,btnTreat_1,btnTreat_2;
    Button btnRewards,btnYes,btnNo;
    TextView btnViewAll;

    ImageView btnSend,btnReceive,btnBank,btnAdd,btnPay,btnLoad,btnData,btnTreats;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_home_, container, false);
        layout = v.findViewById(R.id.layout);
        btnTreat_1 = v.findViewById(R.id.btnTreat_1);
        btnTreat_2 = v.findViewById(R.id.btnTreat_2);
        btnSend = v.findViewById(R.id.btnSend);
        btnReceive = v.findViewById(R.id.btnReceive);
        btnBank = v.findViewById(R.id.btnBank);
        btnAdd = v.findViewById(R.id.btnAdd);

        btnPay = v.findViewById(R.id.btnPay);
        btnLoad = v.findViewById(R.id.btnLoad);
        btnData = v.findViewById(R.id.btnData);
        btnTreats = v.findViewById(R.id.btnTreats);

        btnRewards= v.findViewById(R.id.btnRewards);
        btnViewAll = v.findViewById(R.id.btnViewAll);


        btnTreat_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog builder = new Dialog(getContext());
                builder.requestWindowFeature(Window.FEATURE_NO_TITLE);
                builder.setContentView(R.layout.redeem_poop);
                builder.setCancelable(true);
                builder.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));

                btnYes = builder.findViewById(R.id.btnYes);
                btnYes.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Snackbar customSnackBar = Snackbar.make(layout, "Redeemed Successfully", Snackbar.LENGTH_LONG);
                        customSnackBar.setTextColor(ContextCompat.getColor(getContext(),R.color.white));
                        customSnackBar.setBackgroundTint(ContextCompat.getColor(getContext(),R.color.green));
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
                Dialog builder = new Dialog(getContext());
                builder.requestWindowFeature(Window.FEATURE_NO_TITLE);
                builder.setContentView(R.layout.redeem_poop);
                builder.setCancelable(true);
                builder.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));

                btnYes = builder.findViewById(R.id.btnYes);
                btnYes.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Snackbar customSnackBar = Snackbar.make(layout, "Redeemed Successfully", Snackbar.LENGTH_LONG);
                        customSnackBar.setTextColor(ContextCompat.getColor(getContext(),R.color.white));
                        customSnackBar.setBackgroundTint(ContextCompat.getColor(getContext(),R.color.green));
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

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar customSnackBar = Snackbar.make(layout, "System is under maintenance.", Snackbar.LENGTH_LONG);
                customSnackBar.setTextColor(ContextCompat.getColor(getContext(),R.color.white));
                customSnackBar.setBackgroundTint(ContextCompat.getColor(getContext(),R.color.green));
                customSnackBar.show();
            }
        });

        btnReceive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar customSnackBar = Snackbar.make(layout, "System is under maintenance.", Snackbar.LENGTH_LONG);
                customSnackBar.setTextColor(ContextCompat.getColor(getContext(),R.color.white));
                customSnackBar.setBackgroundTint(ContextCompat.getColor(getContext(),R.color.green));
                customSnackBar.show();
            }
        });

        btnBank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar customSnackBar = Snackbar.make(layout, "System is under maintenance.", Snackbar.LENGTH_LONG);
                customSnackBar.setTextColor(ContextCompat.getColor(getContext(),R.color.white));
                customSnackBar.setBackgroundTint(ContextCompat.getColor(getContext(),R.color.green));
                customSnackBar.show();
            }
        });


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar customSnackBar = Snackbar.make(layout, "System is under maintenance.", Snackbar.LENGTH_LONG);
                customSnackBar.setTextColor(ContextCompat.getColor(getContext(),R.color.white));
                customSnackBar.setBackgroundTint(ContextCompat.getColor(getContext(),R.color.green));
                customSnackBar.show();
            }
        });


        btnPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar customSnackBar = Snackbar.make(layout, "System is under maintenance.", Snackbar.LENGTH_LONG);
                customSnackBar.setTextColor(ContextCompat.getColor(getContext(),R.color.white));
                customSnackBar.setBackgroundTint(ContextCompat.getColor(getContext(),R.color.green));
                customSnackBar.show();
            }
        });

        btnLoad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar customSnackBar = Snackbar.make(layout, "System is under maintenance.", Snackbar.LENGTH_LONG);
                customSnackBar.setTextColor(ContextCompat.getColor(getContext(),R.color.white));
                customSnackBar.setBackgroundTint(ContextCompat.getColor(getContext(),R.color.green));
                customSnackBar.show();
            }
        });

        btnData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar customSnackBar = Snackbar.make(layout, "System is under maintenance.", Snackbar.LENGTH_LONG);
                customSnackBar.setTextColor(ContextCompat.getColor(getContext(),R.color.white));
                customSnackBar.setBackgroundTint(ContextCompat.getColor(getContext(),R.color.green));
                customSnackBar.show();
            }
        });

        btnTreats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar customSnackBar = Snackbar.make(layout, "System is under maintenance.", Snackbar.LENGTH_LONG);
                customSnackBar.setTextColor(ContextCompat.getColor(getContext(),R.color.white));
                customSnackBar.setBackgroundTint(ContextCompat.getColor(getContext(),R.color.green));
                customSnackBar.show();
            }
        });

        btnRewards.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(),Rewards_Activity.class);
                startActivity(i);
            }
        });

        btnViewAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(),ViewAll_Activity.class);
                startActivity(i);
            }
        });

        return v;
    }
}