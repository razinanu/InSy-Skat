package com.example.insy_skat;

import android.support.v7.app.ActionBarActivity;
import android.support.v4.app.Fragment;
import android.annotation.SuppressLint;
import android.app.ActionBar.LayoutParams;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;


public class ResultActivity extends ActionBarActivity {

	
	LinearLayout rl1,rl2;
	    ScrollView sv;
	   TextView[] b;
	    int sum=30;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_result);
		 rl1=(LinearLayout) findViewById(R.id.linearLayout);
	      
	        b=new TextView[20];
	        
	        for(int i=1;i<15;i++)
	        {
		    b[i]=new TextView(this);
	            LinearLayout.LayoutParams params=new LinearLayout.LayoutParams(
	            		android.view.ViewGroup.LayoutParams.MATCH_PARENT,android.view.ViewGroup.LayoutParams.WRAP_CONTENT);
		   
		    b[i].setText("number "+i);
		    b[i].setBackgroundColor(getResources().getColor(R.color.backgroundnotAvailable));
		    b[i].setLayoutParams(params);
		    rl1.addView(b[i]);
		    sum=sum+100;
	        }
	     
	    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

    	MenuInflater mif=getMenuInflater();
    	mif.inflate(R.menu.main_activity_action, menu);
    	mif.inflate(R.menu.result, menu);
    	
    	return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId())
        {
        case R.id.info_icon:
        	/*
            Intent intent = new Intent(this, InfoMain.class);
            startActivity(intent);
            */
        	return true;
        case R.id.home_icon:
        	Intent intent = new Intent(this, MainActivity.class);
        	intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        	startActivity(intent);
        	return true;
        }
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_result,
					container, false);
			return rootView;
		}
	}
	public void backToPrevActivity(View view) {
		finish();
	}

}
