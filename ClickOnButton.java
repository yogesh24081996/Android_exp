package com.outlook.yogeshkrmeena.clickonbutton;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button myButton=(Button)findViewById(R.id.myButton);
        Button myReturn = (Button)findViewById(R.id.myReturn);
        myButton.setOnClickListener(
                  new Button.OnClickListener() {
                      public void onClick(View v) {
                          TextView myText = (TextView) findViewById(R.id.myText);
                          myText.setText("You are a Student of IIITDM ");
                      }
                  }
                  );
        myButton.setBackgroundColor(Color.CYAN);
        myButton.setGravity(48);
        myButton.setOnHoverListener(
                new Button.OnHoverListener() {
                    @Override
                    public boolean onHover(View v, MotionEvent event) {
                        TextView myText = (TextView) findViewById(R.id.myText);
                        myText.setText("You Are Hovering on button");
                        return false;
                    }


                }

        );
        myReturn.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {

                    }
                }
        );

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
