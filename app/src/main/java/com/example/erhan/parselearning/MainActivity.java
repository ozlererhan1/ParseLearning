package com.example.erhan.parselearning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.parse.FindCallback;
import com.parse.GetCallback;
import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.SaveCallback;

import java.util.List;

public class MainActivity extends AppCompatActivity {
TextView a1,b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a1=(TextView)findViewById(R.id.atext);
        b1=(TextView)findViewById(R.id.btext);


/*
        ParseObject object=new ParseObject("Fruits");
        object.put("name","apple");
        object.put("calories",100);
        object.saveInBackground(new SaveCallback() {
            @Override
            public void done(ParseException e) {
                if (e!=null){
                    Toast.makeText(getApplicationContext(),"olmadı",Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(getApplicationContext(),"Object Saved",Toast.LENGTH_LONG).show();
                }
            }
        });

        ParseQuery<ParseObject>query=ParseQuery.getQuery("Fruits");
        query.getInBackground("83fwMyzH2n", new GetCallback<ParseObject>() {
            @Override
            public void done(ParseObject object, ParseException e) {
                if (e!=null){
                    e.printStackTrace();
                }
                else {
                    String objectname=object.getString("name");
                    int objectcalori=object.getInt("calories");
                    System.out.println("adı"+objectname);
                    System.out.println("kalori"+objectcalori);

                }
            }
        });



            ParseQuery<ParseObject> query=ParseQuery.getQuery("Fruits");
            query.whereEqualTo("name","banana");
               query.findInBackground(new FindCallback<ParseObject>() {
                   @Override
                   public void done(List<ParseObject> objects, ParseException e) {
                       if (e!=null){
                           e.printStackTrace();
                       }else {
                           if (objects.size()>0){
                               for (ParseObject object:objects){
                                   String objectname=object.getString("name");
                                   int objectcalori=object.getInt("calories");
                                   System.out.println("name : "+objectname);
                                   System.out.println("calori : "+objectcalori);
                               }

                           }
                       }
                   }
               });
               */

    }

}
