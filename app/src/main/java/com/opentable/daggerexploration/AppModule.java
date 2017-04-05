package com.opentable.daggerexploration;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
class AppModule {

	private Application application;

	AppModule(Application app) {
		application = app;
	}

	@Provides
	@Singleton
	SharedPreferences provideSharedPreferences() {
		return PreferenceManager.getDefaultSharedPreferences(application);
	}
}
