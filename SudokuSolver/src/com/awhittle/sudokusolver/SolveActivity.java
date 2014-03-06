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
		
		//Reset row, column and boolean markers
		Grid.setRowCol(0, 0);
		Grid.setGridBool();
		
		if (isValidGrid()){
			//Solve recursively by brute force
			Solve.bruteForce();
		} else {
			//Error, grid is invalid, send a message
			Toast.makeText(this, R.string.errorInvalid, Toast.LENGTH_LONG).show();
		}
		
		//Print the grid
		Grid.printMatrix(tv, Grid.grid);


	}

	private boolean isValidGrid() {
		for(int i = 0; i < 9; i++){
			for(int j = 0; j < 9; j++){
				if(Grid.gridBool[i][j]){
					//Set row and column to current location
					Grid.row = i;
					Grid.col = j;
					if(!Solve.noConflicts(Grid.grid[i][j])){
						//Conflict found, grid inputed is invalid
						return false;
					}
				}
			}
		}
		return true;
	}


}
