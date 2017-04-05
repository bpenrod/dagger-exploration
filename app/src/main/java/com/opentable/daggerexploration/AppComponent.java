package com.opentable.daggerexploration;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = { AppModule.class })
interface AppComponent {
	void inject(MyApplication app);

	ActivityComponent createActivityComponent(ActivityModule module);
	Activity2Component createActivity2Component(Activity2Module module);
}
