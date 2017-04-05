package com.opentable.daggerexploration;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

public class Activity2 extends AppCompatActivity {
	@Inject Foo foo;
	@Inject	SharedPreferences prefs;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		Activity2Component component = ((MyApplication)getApplication()).getComponent()
				.createActivity2Component(new Activity2Module());
		component.inject(this);

		super.onCreate(savedInstanceState);
	}
}
