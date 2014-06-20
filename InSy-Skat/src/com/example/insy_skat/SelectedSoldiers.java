package com.example.insy_skat;

import android.support.v4.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Gravity;
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

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_selected_soldiers);

		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}

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

		if (kreuz) {

			mit++;

			if (!pik) {

				str = new StringBuilder("mit ").append(mit).append(" ")
						.append("Spiel ").append(mit + 1).toString();
				Toast toast = Toast.makeText(context, str, Toast.LENGTH_SHORT);
				toast.setGravity(Gravity.CENTER, 0, 0);
				toast.show();
			} else {
				mit++;
				if (!herz) {
					str = new StringBuilder("mit ").append(mit).append(" ")
							.append("Spiel ").append(mit + 1).toString();
					Toast toast = Toast.makeText(context, str,
							Toast.LENGTH_SHORT);
					toast.show();
				} else {
					mit++;
					if (!karo) {
						str = new StringBuilder("mit ").append(mit).append(" ")
								.append("Spiel ").append(mit + 1).toString();
						Toast toast = Toast.makeText(context, str,
								Toast.LENGTH_SHORT);
						toast.show();
					} else {
						mit++;
						str = new StringBuilder("mit ").append(mit).append(" ")
								.append("Spiel ").append(mit + 1).toString();
						Toast toast = Toast.makeText(context, str,
								Toast.LENGTH_SHORT);
						toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
						toast.show();
					}
				}
			}
		} else {
			ohne++;
			if (pik) {
				str = new StringBuilder("ohne ").append(ohne).append(" ")
						.append("Spiel ").append(ohne + 1).toString();
				Toast toast = Toast.makeText(context, str, Toast.LENGTH_SHORT);
				toast.show();
			} else {
				ohne++;
				if (herz) {
					str = new StringBuilder("ohne ").append(ohne).append(" ")
							.append("Spiel ").append(ohne + 1).toString();
					Toast toast = Toast.makeText(context, str,
							Toast.LENGTH_SHORT);
					toast.show();
				} else {
					ohne++;
					if (karo) {
						str = new StringBuilder("ohne ").append(ohne)
								.append(" ").append("Spiel ").append(ohne + 1)
								.toString();
						Toast toast = Toast.makeText(context, str,
								Toast.LENGTH_SHORT);
						toast.show();
					} else {
						ohne++;
						str = new StringBuilder("ohne ").append(ohne)
								.append(" ").append("Spiel ").append(ohne + 1)
								.toString();
						Toast toast = Toast.makeText(context, str,
								Toast.LENGTH_SHORT);
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
		startActivity(intent);
	}

}
