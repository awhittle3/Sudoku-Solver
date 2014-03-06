package com.awhittle.sudokusolver;

public class Solve {

	public static boolean bruteForce() {
		if (gridFull()){
			return true;
		}
		
		findNext();
		
		for(int n = 1; n <= 9; n++){
			if (noConflicts(n)){
				Grid.grid[Grid.row][Grid.col] = n;
				if (bruteForce()){
					return true;
				}
				Grid.grid[Grid.row][Grid.col] = 0;
				backstep();
			}
		}
		return false;
	}

	private static void backstep() {
		if(Grid.col != 0){
			Grid.col -= 1;
		}
		else if (Grid.row != 0){
			Grid.col = 8;
			Grid.row -= 1;
		}
		
		if(Grid.gridBool[Grid.row][Grid.col]){
			backstep();
		}
		
	}

	private static void findNext() {
		for(int i = 0; i < 9; i++){
			for( int j = 0; j < 9; j++){
				if(Grid.grid[i][j] == 0){
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
					return false;
				}
			}
		}
		return true;
	}

	public static boolean noConflicts(int n) {
		if (rowGood(n) && colGood(n) && sectorGood(n)){
			return true;
		} else {
			return false;
		}
		
	}

	private static boolean rowGood(int n) {
		for(int j = 0; j < 9; j++){
			if (j != Grid.col){
				if (Grid.grid[Grid.row][j] == n){
					return false;
				}
			}
		}
		return true;
	}

	private static boolean colGood(int n) {
		for(int i = 0; i < 9; i++){
			if (i != Grid.row){
				if (Grid.grid[i][Grid.col] == n){
					return false;
				}
			}
		}
		return true;
	}
	
	private static boolean sectorGood(int n){
		int initI;
		int initJ;
		
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
				if (initI + i != Grid.row && initJ + j != Grid.col){
					if(Grid.grid[initI + i][initJ + j] == n){
						return false;
					}
				}
			}
		}
		return true;
	}
}
