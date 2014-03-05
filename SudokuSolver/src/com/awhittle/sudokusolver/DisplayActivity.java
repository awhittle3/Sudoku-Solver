package com.awhittle.sudokusolver;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.app.Activity;
import android.content.Intent;

public class DisplayActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display);
		
		TextView tv = (TextView)findViewById(R.id.textViewDisplayEdits);
		Grid.printMatrix(tv, Grid.grid);
	}



	public void gotoMain2(View v){
		Intent intent = new Intent(this, MainActivity.class);
		startActivity(intent);
	}
}
