package com.example.mygymbuddy;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class chest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest);

    }
    @Override
    public void onBackPressed() {
        finishAffinity();
    }
    public void done(View V)
    {
        CheckBox one= (CheckBox) findViewById(R.id.checkBox);
        CheckBox t= (CheckBox) findViewById(R.id.checkBox2);
        CheckBox th= (CheckBox) findViewById(R.id.checkBox3);
        CheckBox fo= (CheckBox) findViewById(R.id.checkBox7);
        CheckBox fi= (CheckBox) findViewById(R.id.checkBox8);
        CheckBox si= (CheckBox) findViewById(R.id.checkBox9);
        int count=0;
        if(one.isChecked())
            count++;
        if(t.isChecked())
            count++;
        if(fo.isChecked())
            count++;
        if(fi.isChecked())
            count++;
        if(th.isChecked())
            count++;
        if(si.isChecked())
            count++;
        if (count>=3)
        {
            Toast.makeText(getApplicationContext(),"WELL DONE!!",Toast.LENGTH_SHORT).show();
            finish();
        }
        else
        {
            Toast.makeText(getApplicationContext(),"Oh Oh! Should do atleast 3. Try harder :)",Toast.LENGTH_SHORT).show();
        }
    }
    public  void  img1(View V)
    {
        Intent webOpen = new Intent(android.content.Intent.ACTION_VIEW);
        webOpen.setData(Uri.parse("https://www.youtube.com/watch?v=XSza8hVTlmM"));
        startActivity(webOpen);
    }
    public  void  img2(View V)
    {
        Intent webOpen = new Intent(android.content.Intent.ACTION_VIEW);
        webOpen.setData(Uri.parse("https://www.youtube.com/watch?v=0G2_XV7slIg"));
        startActivity(webOpen);
    }
    public  void  img3(View V)
    {
        Intent webOpen = new Intent(android.content.Intent.ACTION_VIEW);
        webOpen.setData(Uri.parse("https://www.youtube.com/watch?v=eozdVDA78K0"));
        startActivity(webOpen);
    }
    public  void  img4(View V)
    {
        Intent webOpen = new Intent(android.content.Intent.ACTION_VIEW);
        webOpen.setData(Uri.parse("https://www.youtube.com/watch?v=77UbTnqvVzE"));
        startActivity(webOpen);
    }
    public  void  img5(View V)
    {
        Intent webOpen = new Intent(android.content.Intent.ACTION_VIEW);
        webOpen.setData(Uri.parse("https://www.youtube.com/watch?v=IODxDxX7oi4"));
        startActivity(webOpen);
    }
    public  void  img6(View V)
    {
        Intent webOpen = new Intent(android.content.Intent.ACTION_VIEW);
        webOpen.setData(Uri.parse("https://www.youtube.com/watch?v=tfnSyJTbSkU"));
        startActivity(webOpen);
    }

    public void goback( View V)
    {


            Intent gob = new Intent();
            gob.setClass(this, MainActivity.class);
            startActivity(gob);
            finish();

    }
    public void more(View V)
    {
        Intent webOpen = new Intent(android.content.Intent.ACTION_VIEW);
        webOpen.setData(Uri.parse("https://www.mensjournal.com/health-fitness/30-best-chest-exercises-all-time/"));
        startActivity(webOpen);

    }
}
