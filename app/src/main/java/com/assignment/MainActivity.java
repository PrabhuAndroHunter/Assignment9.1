package com.assignment;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private final String TAG = MainActivity.class.toString();
    private TextView mTextTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // initialise layout
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: ");
        mTextTv = (TextView) findViewById(R.id.textview_helloworld); // init textview
    }

    // This override method will create option menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_color, menu); // This will inflate custom menu file
        Log.d(TAG, "onCreateOptionsMenu: ");
        return true;
    }

    // This method will call when option item is selected
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) { //  switch is used to identify the menu item
            case R.id.red:
                mTextTv.setTextColor(Color.RED); // change text color to Red
                break;

            case R.id.green:
                mTextTv.setTextColor(Color.GREEN);  // change text color to Green
                break;

            case R.id.blue:
                mTextTv.setTextColor(Color.BLUE); // change text color to Blue
                break;
        }
        return true;
    }
}
