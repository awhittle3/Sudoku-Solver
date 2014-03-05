package com.awhittle.sudokusolver;

import android.os.Bundle;
import android.widget.TextView;
import android.app.Activity;

public class SolveActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_solve);
	}
	
	@Override
	protected void onResume(){
		super.onResume();
		
		TextView tv = (TextView)findViewById(R.id.textViewSolution);
		Grid.setRowCol(0, 0);
		
		Solve.bruteForce();
		Grid.printMatrix(tv, Grid.grid);


	}


}
