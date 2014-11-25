package com.fun.core.lib;

import com.fun.core.R;
import com.fun.core.R.layout;
import com.fun.core.R.menu;
import com.fun.core.utils.ActivityUtils;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class WelcomeActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcome);
		ActivityUtils.startMainActivity(getApplicationContext());
		ActivityUtils.finishActivity(WelcomeActivity.this);
		finish();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.welcome, menu);
		return true;
	}

}
