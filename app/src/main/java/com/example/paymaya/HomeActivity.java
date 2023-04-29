package com.example.paymaya;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.paymaya.databinding.ActivityHomeBinding;

public class HomeActivity extends AppCompatActivity {


    ActivityHomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        replaceFragment(new Home_Fragment());
        binding.btmNavBarView.setBackground(null);


        binding.btmNavBarView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.home:
                    replaceFragment(new Home_Fragment());
                    break;
                case R.id.scan:
                    replaceFragment(new record_fragment());
                    break;
                case R.id.card:
                    replaceFragment(new profile_fragment());
                    break;
                case R.id.menu:
                    replaceFragment(new profile_fragment());
                    break;

            }
            return true;
        });


    }

    public void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout,fragment);
        fragmentTransaction.commit();
    }
}