package com.example.mydialogfragment1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnShowDialog;
    TextView txt;
    String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnShowDialog = (Button) findViewById(R.id.btn_show_dialog);
        txt = findViewById(R.id.tv_class);

        btnShowDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Show Dialog và truyền giá trị vào dialog
                // Các bạn có thể truyền cả object nếu muốn.
                FragmentManager fm = getSupportFragmentManager();
                UserInfoDialog userInfoDialog = UserInfoDialog.newInstance("Nguyễn Văn Khánh");

                userInfoDialog.show(fm, "Hello");
            }
        });
    }

}