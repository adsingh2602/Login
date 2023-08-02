//package com.example.myapplication.firebaseathu;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.view.WindowManager;
//import android.widget.TextView;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//public class RegisterActivity extends AppCompatActivity {
//
//    TextView alreadyHaveAccount;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_register);
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
//
//        alreadyHaveAccount=findViewById(R.id.alreadyHaveAccount);
//        alreadyHaveAccount.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivities(new Intent[]{new Intent(RegisterActivity.this, MainActivity.class)});
//            }
//        });
//    }
//}
