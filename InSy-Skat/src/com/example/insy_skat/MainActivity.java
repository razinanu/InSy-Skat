package com.example.insy_skat;

import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends ActionBarActivity{
	

	@Override
    protected void onCreate(Bundle savedInstanceState) {
		
		/*
    	getActionBar().setDisplayShowHomeEnabled(false);
    	getActionBar().setDisplayShowTitleEnabled(false); 
    	*/
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }

//<string name="reizassistent
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
       // getMenuInflater().inflate(R.menu.main, menu);
        //return true;
    	MenuInflater mif=getMenuInflater();
    	mif.inflate(R.menu.main_activity_action, menu);
    	return true;
    	//return super.onCreateOptionsMenu(menu);
    }
    
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
    	
    	//for later icons
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
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }
    
    
    public void selectSoldiersActivity(View view) 
    {
        Intent intent = new Intent(this, SelectedSoldiers.class);
        startActivity(intent);
    }



}
