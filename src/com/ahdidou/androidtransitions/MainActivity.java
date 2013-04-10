package com.ahdidou.androidtransitions;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void showNext(View view) {
		// TODO Auto-generated method stub
		
		Intent intent = new Intent(this, NextActivity.class);

		startActivity(intent);
		overridePendingTransition (R.anim.open_next, R.anim.close_main);


	}
}
