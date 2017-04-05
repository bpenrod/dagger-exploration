package com.opentable.daggerexploration;

import dagger.Subcomponent;

@ActivityScope
@Subcomponent(modules = ActivityModule.class)
public interface ActivityComponent extends BaseActivityComponent {
	void inject(MainActivity activity);
}
