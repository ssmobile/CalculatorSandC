package com.example.calculatorexercise.viewmodel;


import android.view.View;
import android.widget.TextView;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    private final MutableLiveData<String> currentOperand = new MutableLiveData<>();

    public void onOperandClick(View v) {
        currentOperand.setValue(((TextView)v).getText().toString());
    }

    public LiveData<String> getOperand() {
       return this.currentOperand;
    }

}
