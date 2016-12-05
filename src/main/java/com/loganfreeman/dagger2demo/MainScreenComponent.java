package com.loganfreeman.dagger2demo;

import dagger.Component;

/**
 * Created by scheng on 12/4/16.
 */

@CustomScope
@Component(dependencies = NetComponent.class, modules = MainScreenModule.class)
public interface MainScreenComponent {
    void inject(MainActivity activity);
}