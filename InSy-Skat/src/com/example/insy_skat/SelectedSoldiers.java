package com.example.insy_skat;

import android.support.v4.app.Fragment;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;



//ActionBarActivity
public class SelectedSoldiers extends ActionBarActivity {
	private ToggleButton kreuzToggle, pikToggle, karoToggle,herzToggle;
	private boolean kreuz=false,pik=false,herz=false,karo=false;
	private Activity activity;
			


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_selected_soldiers);

		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
		kreuzToggle = (ToggleButton) findViewById(R.id.kreuztoggle);
//		pikToggle = (ToggleButton) findViewById(R.id.piktoggle);
//		karoToggle = (ToggleButton) findViewById(R.id.karotoggle);
//        herzToggle = (ToggleButton) findViewById(R.id.herztoggle);
		
		
//      
		
		kreuzToggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
		    @Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		        if (isChecked) {
		        	kreuz=true;
					toastAppearance();
		        } else {
		        	kreuz=false;
		        }
		    }
		});
        kreuzToggle.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(kreuzToggle.isChecked()){
					kreuz=true;
					toastAppearance();
				}
				else{
					kreuz=false;
				}
					
			}
		});
		 
	  }
	 
	protected void toastAppearance(){
		Context context = getApplicationContext();
		CharSequence text = "Hello toast!";
		int duration = Toast.LENGTH_SHORT;

		Toast toast = Toast.makeText(context, text, duration);
		toast.show();
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.selected_soldiers, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
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
			View rootView = inflater.inflate(
					R.layout.fragment_selected_soldiers, container, false);
			return rootView;
		}
	}
	   public void backToPrevActivity(View view) 
	    {
	        finish();
	    }
	   public void farbenAuswahlAcctivity(View view) 
	    {
	        Intent intent = new Intent(this, FarbenAuswahl.class);
	        startActivity(intent);
	    }

}
