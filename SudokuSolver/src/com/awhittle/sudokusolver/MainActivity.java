package com.awhittle.sudokusolver;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.content.Intent;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void gotoClear(View v){
		Intent intent = new Intent(this, ClearActivity.class);
		startActivity(intent);
	}
	
	public void gotoSolve(View v){
		Intent intent = new Intent(this, SolveActivity.class);
		startActivity(intent);
	}
	
	public void gotoDisplay(View v){
		Intent intent = new Intent(this, DisplayActivity.class);
		startActivity(intent);
	}
	
	
	public void gotoS1(View v){
		Grid.setRowCol(0, 0);
		Intent intent = new Intent(this, SectorActivity.class);
		startActivity(intent);
	}
	
	public void gotoS2(View v){
		Grid.setRowCol(0, 3);
		Intent intent = new Intent(this, SectorActivity.class);
		startActivity(intent);
	}
	
	public void gotoS3(View v){
		Grid.setRowCol(0, 6);
		Intent intent = new Intent(this, SectorActivity.class);
		startActivity(intent);
	}
	
	public void gotoS4(View v){
		Grid.setRowCol(3, 0);
		Intent intent = new Intent(this, SectorActivity.class);
		startActivity(intent);
	}
	
	public void gotoS5(View v){
		Grid.setRowCol(3, 3);
		Intent intent = new Intent(this, SectorActivity.class);
		startActivity(intent);
	}
	
	public void gotoS6(View v){
		Grid.setRowCol(3, 6);
		Intent intent = new Intent(this, SectorActivity.class);
		startActivity(intent);
	}
	
	public void gotoS7(View v){
		Grid.setRowCol(6, 0);
		Intent intent = new Intent(this, SectorActivity.class);
		startActivity(intent);
	}
	
	public void gotoS8(View v){
		Grid.setRowCol(6, 3);
		Intent intent = new Intent(this, SectorActivity.class);
		startActivity(intent);
	}
	
	public void gotoS9(View v){
		Grid.setRowCol(6, 6);
		Intent intent = new Intent(this, SectorActivity.class);
		startActivity(intent);
	}
}
