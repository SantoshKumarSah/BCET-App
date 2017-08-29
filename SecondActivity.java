package in.ac.bcetdgp.bcet;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ViewPager mViewPager = (ViewPager) findViewById(R.id.viewPageAndroid);
        AndroidImageAdapter adapterView = new AndroidImageAdapter(this);
        mViewPager.setAdapter(adapterView);

        //about activity
        Button about = (Button)findViewById(R.id.button1);

        about.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this, AboutActivity.class);
                startActivity(intent);
            }

        });

        //message activity
        Button message = (Button)findViewById(R.id.button2);

        message.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this, MessageActivity.class);
                startActivity(intent);
            }

        });


        //course activity
        Button courses = (Button)findViewById(R.id.button3);

        courses.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this, CourseActivity.class);
                startActivity(intent);
            }

        });



        //maps actrivity
        Button maps = (Button)findViewById(R.id.button9);

        maps.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                startActivity(intent);
            }

        });



    }
}


