package com.example.calculatorexercise.viewmodel;


import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    private final MutableLiveData<String> currentOperand = new MutableLiveData<>();
    private double x;
    private double y;

    public void onOperandClick(View v) {
        currentOperand.setValue(((TextView)v).getText().toString());
    }

    public void onNumberOneInput(CharSequence x) {
        this.x = Double.parseDouble(x.toString());
    }

    public void onNumberTwoInput(CharSequence y) {
        this.y = Double.parseDouble(y.toString());
    }

    public void onEqualsClick() {
        switch (currentOperand.getValue()) {
            case "+":
                break;
            case "-":
                break;
            case "/":
                break;
            case "*":
                break;
            default:
                //no default
        }
    }

    public LiveData<String> getOperand() {
       return this.currentOperand;
    }

}
