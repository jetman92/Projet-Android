package com.example.monlivrederecettes;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

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
	}
	
	/** Called when the user clicks the Send button
	 * dzda */
	//Lancement de l'acitivity via le boutton 1
	public void mesRecettes(View view) {
	    // Do something in response to button
		Intent intent  = new Intent(this, MyRecettesActivity.class);
		startActivity(intent);
	}
	
	
	public void rechercheRecettes (View view) {
		Intent intent = new Intent(this, RechercheRecettes.class);
		startActivity(intent);
	}
	
	public void ajouterRecettes (View view) {
		Intent intent = new Intent(this, AjouterRecettes.class);
		startActivity(intent);
	}
	
	public void listeDeCourse (View view) {
		Intent intent = new Intent(this, ListeDeCourse.class);
		startActivity(intent);
	}

}
