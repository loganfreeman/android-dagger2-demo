package com.loganfreeman.dagger2demo;

import dagger.Module;
import dagger.Provides;

/**
 * Created by scheng on 12/4/16.
 */

@Module
public class MainScreenModule {
    private final MainScreenContract.View mView;


    public MainScreenModule(MainScreenContract.View mView) {
        this.mView = mView;
    }

    @Provides
    @CustomScope
    MainScreenContract.View providesMainScreenContractView() {
        return mView;
    }
}