package com.awhittle.sudokusolver;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.app.Activity;
import android.content.Intent;

public class SectorActivity extends Activity {

	public static int a;
	public static int b;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sector);
		
		setButtonNum(0, 0, R.id.button1);
		setButtonNum(0, 1, R.id.button2);
		setButtonNum(0, 2, R.id.button3);
		setButtonNum(1, 0, R.id.button4);
		setButtonNum(1, 1, R.id.button5);
		setButtonNum(1, 2, R.id.button6);
		setButtonNum(2, 0, R.id.button7);
		setButtonNum(2, 1, R.id.button8);
		setButtonNum(2, 2, R.id.button9);
	}

	private void setButtonNum(int r, int c, int textViewID) {
		TextView tv = (TextView)findViewById(textViewID);
		
		int n = Grid.grid[Grid.row + r][Grid.col + c];
		
		if (n==0){
			tv.setText("x");
		} else {
			tv.setText(Integer.toString(n));
		}
	}
	
	public void gotoMain3(View v){
		Intent intent = new Intent(this, MainActivity.class);
		startActivity(intent);
	}

	private void setOffset(int i, int j){
		a = i;
		b = j;
	}
	
	public void gotoEdit1(View v){
		setOffset(0,0);
		Intent intent = new Intent(this, EditActivity.class);
		startActivity(intent);
	}
	
	public void gotoEdit2(View v){
		setOffset(0,1);
		Intent intent = new Intent(this, EditActivity.class);
		startActivity(intent);
	}
	
	public void gotoEdit3(View v){
		setOffset(0,2);
		Intent intent = new Intent(this, EditActivity.class);
		startActivity(intent);
	}
	
	public void gotoEdit4(View v){
		setOffset(1,0);
		Intent intent = new Intent(this, EditActivity.class);
		startActivity(intent);
	}
	
	public void gotoEdit5(View v){
		setOffset(1,1);
		Intent intent = new Intent(this, EditActivity.class);
		startActivity(intent);
	}
	
	public void gotoEdit6(View v){
		setOffset(1,2);
		Intent intent = new Intent(this, EditActivity.class);
		startActivity(intent);
	}
	
	public void gotoEdit7(View v){
		setOffset(2,0);
		Intent intent = new Intent(this, EditActivity.class);
		startActivity(intent);
	}
	
	public void gotoEdit8(View v){
		setOffset(2,1);
		Intent intent = new Intent(this, EditActivity.class);
		startActivity(intent);
	}
	
	public void gotoEdit9(View v){
		setOffset(2,2);
		Intent intent = new Intent(this, EditActivity.class);
		startActivity(intent);
	}

	
}
