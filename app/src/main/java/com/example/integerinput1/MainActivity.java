// Write a program that takes an integer as input and returns true if the input is a power of two.
// Examples:
// 8 => returns true
// 6 => returns false
package com.example.integerinput1;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkPowerOfTwo(View view) {
        EditText inputEditText = findViewById(R.id.inputEditText);
        TextView resultTextView = findViewById(R.id.resultTextView);

        int input = Integer.parseInt(inputEditText.getText().toString());
        boolean isPowerOfTwo = checkPowerOfTwo(input);
        resultTextView.setText(String.valueOf(isPowerOfTwo));
    }

    private boolean checkPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }


        while (n % 2 == 0) {
            n /= 2;
        }


        return n == 1;
    }
}
