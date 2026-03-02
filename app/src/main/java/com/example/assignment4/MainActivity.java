package com.example.assignment4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity {

    TextView Input, Output;
    Button C,AC,Equal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);

            Input = findViewById(R.id.input);
            Output = findViewById(R.id.result);
            C = findViewById(R.id.clear);
            AC = findViewById(R.id.allClear);
            Equal = findViewById(R.id.equal);
            Equal.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String data = Input.getText().toString();
                    Context context = Context.enter();
                    context.setOptimizationLevel(-1);
                    Scriptable scriptable=context.initStandardObjects();
                    String result = context.evaluateString(scriptable,data,"JavaScript",1,null).toString();
                    Output.setText(result);
                }
            });
            AC.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Input.setText("");
                    Output.setText("");
                }
            });
            C.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String text = Input.getText().toString();
                    Input.setText(text.substring(0,text.length()-1));
                }
            });
            return insets;
        });
    }

    public void getValue(View view) {
    Button btn = (Button) view;
    Input.setText(Input.getText().toString()+btn.getText().toString());
    }
}