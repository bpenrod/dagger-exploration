package com.opentable.daggerexploration;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

	@Inject	Foo foo;
	@Inject	SharedPreferences prefs;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		ActivityComponent component = ((MyApplication)getApplication()).getComponent()
				.createActivityComponent(new ActivityModule());
		component.inject(this);

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		startActivity(new Intent(this, Activity2.class));
	}
}
