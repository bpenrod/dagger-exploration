package com.opentable.daggerexploration;

import dagger.Subcomponent;

@ActivityScope
@Subcomponent(modules = Activity2Module.class)
public interface Activity2Component extends BaseActivityComponent {
	void inject(Activity2 activity);
}
