package com.awhittle.sudokusolver;

import android.widget.TextView;

public class Grid {
	
	public static int[][] grid = new int[9][9];
	public static boolean[][] gridBool = new boolean[9][9];
	
	public static int row = 0;
	public static int col = 0;
	
	public static void printMatrix(TextView tv, int[][] grid) {
		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append("-------------------\n");
		
		for(int i=0; i<9; i++){
			
			sBuilder.append(" | ");
			
			for(int j=0; j<9; j++){
				if (grid[i][j] == 0){
					sBuilder.append("x ");
				} else {
					sBuilder.append(grid[i][j]);
					sBuilder.append(" ");
				}
				if (j%3 == 2){
					sBuilder.append("| ");
				}
			}
			
			sBuilder.append("\n");
			if(i%3 == 2){
				sBuilder.append("-------------------\n");
			}
		}
		tv.setText(sBuilder.toString());
	}
	
	public static void setRowCol(int i, int j){
		row = i;
		col = j;
	}

	public static void editGrid(int n) {
		grid[row + SectorActivity.a][col + SectorActivity.b] = n;
	}
	
	public static void setGridBool(){
		for(int i = 0; i < 9; i++){
			for(int j = 0; j < 9; j++){
				if (grid[i][j] == 0){
					gridBool[i][j] = false;
				} else {
					gridBool[i][j] = true;
				}
			}
		}
	}
}
