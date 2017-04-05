package com.opentable.daggerexploration;

import dagger.Module;
import dagger.Provides;

@Module
class Activity2Module {

	@Provides
	@ActivityScope
	Foo providesFoo() {
		return new Foo();
	}
}
