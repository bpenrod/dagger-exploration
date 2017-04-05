package com.opentable.daggerexploration;

import dagger.Module;
import dagger.Provides;

@Module
class ActivityModule {

	@Provides
	@ActivityScope
	Foo providesFoo() {
		return new Foo();
	}
}
