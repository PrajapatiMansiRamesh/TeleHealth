package com.example.telehealth;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.view.*;
import android.content.*;
import android.os.Bundle;
import android.widget.ImageView;
public class HomeActivity extends AppCompatActivity {
    ImageView oppointment_icon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        oppointment_icon=(ImageView)findViewById(R.id.appointment);
        set_appointment();
    }

    public void set_appointment() {
        oppointment_icon.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent Webintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://telehealths.in"));
                startActivity(Webintent);
            }
        });
    }



    public void make_call(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:800 1700 199"));
        startActivity(intent);
    }

}
