package com.example.ahmadbasir.abas;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
    private Button btnLogin,btnSignup;
    private int clicked = 0;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = (Button) findViewById(R.id.Login);
//        btnSignup = (Button) findViewById(R.id.Signup);

        btnLogin.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                if(clicked==3){
                    Toast.makeText(getApplicationContext(),
                            "klik teroooss!",
                            50).show();
                    clicked++;
                }else if (clicked==4){
                    Toast.makeText(getApplicationContext(),
                            "Wis Woi :v",
                            50).show();
                    clicked++;
                }else if (clicked==5){
                    Toast.makeText(getApplicationContext(),
                            "Bazeng! :v",
                            50).show();
                    clicked++;
                }else if(clicked>5){
                    Toast.makeText(getApplicationContext(),
                            "MBOH!",
                            50).show();
                }else{
                    Toast.makeText(getApplicationContext(),
                            "Clicked : "+clicked,
                            50).show();

                    clicked++;
                }
            }
        });

//        btnSignup.setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(),
//                        "SingUp Cliked!",
//                        Toast.LENGTH_SHORT).show();
//            }
//        });
    }
}
