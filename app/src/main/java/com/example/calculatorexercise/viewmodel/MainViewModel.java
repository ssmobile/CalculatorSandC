package com.example.calculatorexercise.viewmodel;


import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.calculatorexercise.model.Calculator;

public class MainViewModel extends ViewModel {

    private final MutableLiveData<String> currentOperand = new MutableLiveData<>();
    private final MutableLiveData<String> result = new MutableLiveData<>();
    private double x;
    private double y;

    public void onOperandClick(View v) {
        currentOperand.setValue(((TextView)v).getText().toString());
    }

    public void onNumberOneInput(CharSequence x) {
        if (x.toString().isEmpty()) {
            this.x = 0;
            return;
        }

        this.x = Double.parseDouble(x.toString());
    }

    public void onNumberTwoInput(CharSequence y) {
        if (y.toString().isEmpty()) {
            this.y = 0;
            return;
        }
        this.y = Double.parseDouble(y.toString());
    }

    public void onEqualsClick() {
        if (currentOperand.getValue() == null) {
            result.setValue("Please select an operand");
            return;
        }
        Calculator calculator = new Calculator(x,y,currentOperand.getValue().charAt(0));
        result.setValue(String.valueOf(calculator.performOperation()));
    }

    public LiveData<String> getOperand() {
       return this.currentOperand;
    }

    public LiveData<String> getResult() {
        return result;
    }

}
