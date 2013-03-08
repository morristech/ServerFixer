package com.omegavesko.serverfixer;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ProgressBar;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        ProgressBar mProgress;
        
        mProgress = (ProgressBar) findViewById(R.id.pBar);
        
        mProgress.setProgress(45);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    public void daemon(View view)
    {
    	AlertDialog.Builder builder = new AlertDialog.Builder(this);
    	
    	builder.setMessage("Network daemon started! Malware being eradicated.")
        		.setTitle("Network Daemon");
    	
    	builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                // User clicked OK button
            }
        });
    	
    	AlertDialog dialog = builder.create();
    	
    	dialog.show();
    }
    
}
