package com.example.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.example.calculatorexercise.R;
import com.example.calculatorexercise.databinding.ActivityMainBinding;
import com.example.calculatorexercise.viewmodel.MainViewModel;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        MainViewModel mainViewModel = new ViewModelProvider(this).get(MainViewModel.class);
        binding.setLifecycleOwner(this);
        binding.setViewmodel(mainViewModel);
    }
}