package com.example.assign03_02_6206021622011;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText text_Mid, text_Final , text_Home ;
    Button btn_Calculate;
    TextView text_Sum ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       text_Mid = (EditText) findViewById(R.id.text_Mid);
        text_Final = (EditText) findViewById(R.id.text_Final);
        text_Home = (EditText) findViewById(R.id.text_Home);
        text_Sum = (TextView) findViewById(R.id.text_Sum);
        btn_Calculate = (Button) findViewById(R.id.btn_Calculate);
        btn_Calculate.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (!text_Mid.getText().toString().isEmpty() && !text_Final.getText().toString().isEmpty() && !text_Home.getText().toString().isEmpty() ){
            int midtermscore , finalscore , assignscore , score ;
            String Grade;

            midtermscore = Integer.parseInt(text_Mid.getText().toString());
            finalscore = Integer.parseInt(text_Final.getText().toString());
            assignscore = Integer.parseInt(text_Home.getText().toString());
            score = midtermscore + finalscore + assignscore;
            if(score <= 49) Grade = "F";
            else if (score > 49 && score < 55) Grade = "D";
            else if (score > 54 && score < 60) Grade = "D+";
            else if (score > 59 && score < 65) Grade = "C";
            else if (score > 64 && score < 70) Grade = "C+";
            else if (score > 69 && score < 75) Grade = "B";
            else if (score > 74 && score < 80) Grade = "B+";
            else if (score > 79 && score < 101) Grade = "A";
            else {Grade = "###";
                Toast.makeText(this, "โปรดใส่คะแนนให้ถูกต้องด้วยครับ", Toast.LENGTH_SHORT).show();
            }

            text_Sum.setText("คะแนนรวม : " + score+"\nเกรดที่ได้:"+Grade);



        }
        else Toast.makeText(this, "กรุณาใส่คะเเนนทุกช่อง", Toast.LENGTH_SHORT).show();
    }
}
