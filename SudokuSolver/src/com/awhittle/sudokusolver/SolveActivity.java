package com.awhittle.sudokusolver;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
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
		Grid.setGridBool();
		
		if (isValidGrid()){
			Solve.bruteForce();
		} else {
			Toast.makeText(this, R.string.errorInvalid, Toast.LENGTH_LONG).show();
		}
		
		Grid.printMatrix(tv, Grid.grid);


	}

	private boolean isValidGrid() {
		for(int i = 0; i < 9; i++){
			for(int j = 0; j < 9; j++){
				if(Grid.gridBool[i][j]){
					Grid.row = i;
					Grid.col = j;
					if(!Solve.noConflicts(Grid.grid[i][j])){
						return false;
					}
				}
			}
		}
		return true;
	}


}
