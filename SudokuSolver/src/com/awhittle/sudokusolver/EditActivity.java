package com.awhittle.sudokusolver;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.content.Intent;

public class EditActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_edit);
	}

	private void resetOffset() {
		SectorActivity.a = 0;
		SectorActivity.b = 0;
	}
	
	public void gotoSectorN1(View v){
		Grid.editGrid(1);
		resetOffset();
		Intent intent = new Intent(this, SectorActivity.class);
		startActivity(intent);
	}
	
	public void gotoSectorN2(View v){
		Grid.editGrid(2);
		resetOffset();
		Intent intent = new Intent(this, SectorActivity.class);
		startActivity(intent);
	}

	public void gotoSectorN3(View v){
		Grid.editGrid(3);
		resetOffset();
		Intent intent = new Intent(this, SectorActivity.class);
		startActivity(intent);
	}
	
	public void gotoSectorN4(View v){
		Grid.editGrid(4);
		resetOffset();
		Intent intent = new Intent(this, SectorActivity.class);
		startActivity(intent);
	}
	
	public void gotoSectorN5(View v){
		Grid.editGrid(5);
		resetOffset();
		Intent intent = new Intent(this, SectorActivity.class);
		startActivity(intent);
	}
	
	public void gotoSectorN6(View v){
		Grid.editGrid(6);
		resetOffset();
		Intent intent = new Intent(this, SectorActivity.class);
		startActivity(intent);
	}
	
	public void gotoSectorN7(View v){
		Grid.editGrid(7);
		resetOffset();
		Intent intent = new Intent(this, SectorActivity.class);
		startActivity(intent);
	}
	
	public void gotoSectorN8(View v){
		Grid.editGrid(8);
		resetOffset();
		Intent intent = new Intent(this, SectorActivity.class);
		startActivity(intent);
	}
	
	public void gotoSectorN9(View v){
		Grid.editGrid(9);
		resetOffset();
		Intent intent = new Intent(this, SectorActivity.class);
		startActivity(intent);
	}
	
	public void gotoSectorNx(View v){
		Grid.editGrid(0);
		resetOffset();
		Intent intent = new Intent(this, SectorActivity.class);
		startActivity(intent);
	}

}
