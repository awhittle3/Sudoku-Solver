package com.awhittle.sudokusolver;

public class Solve {

	public static boolean bruteForce() {
		//If all values found, exit loop
		if (gridFull()){
			return true;
		}
		
		//Find next spot to fill
		findNext();
		
		//Cycle number 1 through 9
		for(int n = 1; n <= 9; n++){
			if (noConflicts(n)){
				//Assign spot new number
				Grid.grid[Grid.row][Grid.col] = n;
				//Try new number
				if (bruteForce()){
					//Walk out of loop
					return true;
				}
				//Assignment did not work, reset
				Grid.grid[Grid.row][Grid.col] = 0;
				//Go back to old spot, try again
				backstep();
			}
		}
		return false;
	}

	//Go back to old spot
	private static void backstep() {
		if(Grid.col != 0){
			Grid.col -= 1;
		}
		else if (Grid.row != 0){
			Grid.col = 8;
			Grid.row -= 1;
		}
		
		//Pass over fixed values
		if(Grid.gridBool[Grid.row][Grid.col]){
			backstep();
		}
		
	}

	//Find next empty spot
	private static void findNext() {
		for(int i = 0; i < 9; i++){
			for( int j = 0; j < 9; j++){
				if(Grid.grid[i][j] == 0){
					//Assign location
					Grid.row = i;
					Grid.col = j;
					return;
				}
			}
		}
	}

	private static boolean gridFull() {

		for(int i = 0; i < 9; i++){
			for( int j = 0; j < 9; j++){
				if(Grid.grid[i][j] == 0){
					//Empty spot found
					return false;
				}
			}
		}
		//No empty spots found
		return true;
	}

	public static boolean noConflicts(int n) {
		//Check row, columns and sectors for conflicts
		if (rowGood(n) && colGood(n) && sectorGood(n)){
			return true;
		} else {
			return false;
		}
		
	}

	private static boolean rowGood(int n) {
		for(int j = 0; j < 9; j++){
			//Pass over current location
			if (j != Grid.col){
				if (Grid.grid[Grid.row][j] == n){
					//Conflict found
					return false;
				}
			}
		}
		return true;
	}

	private static boolean colGood(int n) {
		for(int i = 0; i < 9; i++){
			//Pass over current location
			if (i != Grid.row){
				if (Grid.grid[i][Grid.col] == n){
					//Conflict found
					return false;
				}
			}
		}
		return true;
	}
	
	private static boolean sectorGood(int n){
		int initI;
		int initJ;
		
		//Start in corner of current sector
		if(Grid.row < 3){
			initI = 0;
		} else if (Grid.row >= 6){
			initI = 6;
		} else {
			initI = 3;
		}
		
		if(Grid.col < 3){
			initJ = 0;
		} else if (Grid.col >= 6){
			initJ = 6;
		} else {
			initJ = 3;
		}
		
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				//Pass over current location
				//Add offsets
				if (initI + i != Grid.row && initJ + j != Grid.col){
					//Add offsets
					if(Grid.grid[initI + i][initJ + j] == n){
						//Conflict found
						return false;
					}
				}
			}
		}
		return true;
	}
}
