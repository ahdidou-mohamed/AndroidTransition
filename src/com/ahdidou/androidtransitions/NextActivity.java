package com.ahdidou.androidtransitions;

import android.app.Activity;
import android.os.Bundle;
/**
 * 
 * @author ahdidou
 *
 */
public class NextActivity extends Activity{
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		setContentView(R.layout.next);
		super.onCreate(savedInstanceState);
	}
	
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
		overridePendingTransition (R.anim.open_main, R.anim.close_next);
	}

}
