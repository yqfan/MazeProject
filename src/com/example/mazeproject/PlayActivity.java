package com.example.mazeproject;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.widget.TextView;

public class PlayActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.play_main_screen);
		TextView helloView = (TextView) findViewById(R.id.temp_text);
		helloView.setText("CONTENT COMING UP SOON!");
		helloView.setTextColor(Color.BLUE);
		helloView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);
	}
}
