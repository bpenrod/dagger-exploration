package com.opentable.daggerexploration;

import android.app.Application;
import android.content.SharedPreferences;

import javax.inject.Inject;

public class MyApplication extends Application {

	private AppComponent component;
	@Inject	SharedPreferences prefs;

	@Override
	public void onCreate() {
		super.onCreate();

		component = DaggerAppComponent.builder()
				.appModule(new AppModule(this))
				.build();

		component.inject(this);
	}

	public AppComponent getComponent() {
		return component;
	}
}
