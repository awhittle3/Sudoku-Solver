package com.awhittle.sudokusolver;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.content.Intent;

public class ClearActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_clear);
	}

	public void gotoMain1(View v){
		Intent intent = new Intent(this, MainActivity.class);
		startActivity(intent);
	}
	
	public void clearMatrix(View v){
		Grid.grid = new int[9][9];
		Intent intent = new Intent(this, MainActivity.class);
		startActivity(intent);
	}

}
