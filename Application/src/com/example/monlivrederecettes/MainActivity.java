package com.example.monlivrederecettes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	//private String[] MyMenu;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu, menu);
	
		
		
		return true;
				
		
		/*MyMenu = getResources().getStringArray(R.array.ItemsMenu);
		ArrayAdapter myList = new ArrayAdapter(this, R.layout.activity_menu, );*/
	}
	
	public void mesRecettes (View v){
		Intent intent = new Intent(this, MyRecettesActivity.class);
		startActivity(intent);
	}

	

}
