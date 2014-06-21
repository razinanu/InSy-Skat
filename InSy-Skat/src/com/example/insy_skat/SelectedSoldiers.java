package com.example.insy_skat;

import android.support.v4.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import android.widget.ToggleButton;

//ActionBarActivity
public class SelectedSoldiers extends ActionBarActivity {

	private boolean kreuz = false, pik = false, herz = false, karo = false;
	Boast toast;
	private int factor;
	 private ToggleButton kreTg,piTg,hzTg,kroTg;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_selected_soldiers);
		kreTg=(ToggleButton) findViewById(R.id.kreuztoggle);
	    piTg=(ToggleButton) findViewById(R.id.piktoggle);
	     hzTg=(ToggleButton) findViewById(R.id.herztoggle);
	    kroTg=(ToggleButton) findViewById(R.id.karotoggle);
        if(kreTg.isChecked()){
        	System.out.println("HIIIIII");
        }

	

//		if (savedInstanceState == null) {
//			getSupportFragmentManager().beginTransaction()
//					.add(R.id.container, new PlaceholderFragment()).commit();
//		}

	}

	public void onKreuzClicked(View view) {

		boolean on = ((ToggleButton) view).isChecked();

		if (on) {
			kreuz = true;
			
			toastAppearance();
		} else {
			kreuz = false;
			
			toastAppearance();
		}
	}

	public void onPikClicked(View view) {

		boolean on = ((ToggleButton) view).isChecked();

		if (on) {
			pik = true;
			
			toastAppearance();
		} else {
			pik = false;
			
			toastAppearance();
		}
	}

	public void onHerzClicked(View view) {

		boolean on = ((ToggleButton) view).isChecked();

		if (on) {
			herz = true;
		
			toastAppearance();
		} else {
			herz = false;
			
			toastAppearance();
		}
	}

	public void onKaroClicked(View view) {

		boolean on = ((ToggleButton) view).isChecked();

		if (on) {
			karo = true;
			
			toastAppearance();
		} else {
			karo = false;
		
			toastAppearance();
		}
	}

	protected void toastAppearance() {
		Context context = getApplicationContext();
		int mit = 0;
		int ohne = 0;
		String str = "";

		if (kreTg.isChecked()) {

			mit++;

			if (!piTg.isChecked()) {
				factor=mit+1;

				str = new StringBuilder("mit ").append(mit).append(" ")
						.append("Spiel ").append(mit + 1).toString();
				 toast =Boast.makeText(context, str, Toast.LENGTH_SHORT*2);
				toast.show();
				
			} else {
				mit++;
				if (!hzTg.isChecked()) {
					factor=mit+1;
					str = new StringBuilder("mit ").append(mit).append(" ")
							.append("Spiel ").append(mit + 1).toString();
					 toast =Boast.makeText(context, str, Toast.LENGTH_SHORT*2);
						toast.show();
				} else {
					mit++;
					if (!kroTg.isChecked()) {
						factor=mit+1;
						str = new StringBuilder("mit ").append(mit).append(" ")
								.append("Spiel ").append(mit + 1).toString();
						 toast =Boast.makeText(context, str, Toast.LENGTH_SHORT*2);
							toast.show();
					} else {
						mit++;
						factor=mit+1;
						str = new StringBuilder("mit ").append(mit).append(" ")
								.append("Spiel ").append(mit + 1).toString();
						 toast =Boast.makeText(context, str, Toast.LENGTH_SHORT*2);
							toast.show();
					}
				}
			}
		} else {
			ohne++;
			if (piTg.isChecked()) {
				factor=ohne+1;
				str = new StringBuilder("ohne ").append(ohne).append(" ")
						.append("Spiel ").append(ohne + 1).toString();
				 toast =Boast.makeText(context, str, Toast.LENGTH_SHORT*2);
				toast.show();
			} else {
				ohne++;
				if (hzTg.isChecked()) {
					factor=ohne+1;
					str = new StringBuilder("ohne ").append(ohne).append(" ")
							.append("Spiel ").append(ohne + 1).toString();
					 toast =Boast.makeText(context, str, Toast.LENGTH_SHORT*2);
						toast.show();
				} else {
					ohne++;
					if (kroTg.isChecked()) {
						factor=ohne+1;
						str = new StringBuilder("ohne ").append(ohne)
								.append(" ").append("Spiel ").append(ohne + 1)
								.toString();
						 toast =Boast.makeText(context, str, Toast.LENGTH_SHORT*2);
							toast.show();
					} else {
						ohne++;
						factor=ohne+1;
						str = new StringBuilder("ohne ").append(ohne)
								.append(" ").append("Spiel ").append(ohne + 1)
								.toString();
						 toast =Boast.makeText(context, str, Toast.LENGTH_SHORT*2);
						toast.show();
					}

				}
			}
		}

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

    	MenuInflater mif=getMenuInflater();
    	mif.inflate(R.menu.main_activity_action, menu);
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
			View rootView = inflater.inflate(
					R.layout.fragment_selected_soldiers, container, false);
			return rootView;
		}
	}

	public void backToPrevActivity(View view) {
		finish();
	}

	public void farbenAuswahlAcctivity(View view) {
		Intent intent = new Intent(this, FarbenAuswahl.class);
		((saveGlobalVariable) this.getApplication()).setFactor(factor);
		
		startActivity(intent);
	}

}
