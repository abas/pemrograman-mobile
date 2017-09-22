package com.example.d2a.anjay;

// #1
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//
//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }
//}


// #2
//import android.app.Activity;
//import android.os.Bundle;
//import android.widget.TextView;
//
//public class MainActivity extends Activity {
//    /** Called when the activity is first created. */
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        TextView hello = new TextView(this);
//        hello.setText("Hello Android");
//        setContentView(hello);
//    }
//}

// #3
//import android.app.Activity;
//import android.os.Bundle;
//import android.widget.TextView;
//
//public class MainActivity extends Activity {
//    /** Called when the activity is first created. */
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }
//}

// #4
//import android.app.Activity;
//import android.os.Bundle;
//import android.widget.ImageView;
//
//public class MainActivity extends Activity {
//    /** Called when the activity is first created. */
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        ImageView HelloWord = new ImageView(this);
//        HelloWord.setImageResource(R.drawable.android);
//        setContentView(HelloWord);
//    }
//}

// #5
import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
