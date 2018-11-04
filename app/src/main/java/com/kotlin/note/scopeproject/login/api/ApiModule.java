package com.kotlin.note.scopeproject.login.api;

import android.util.Log;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApiModule {

    @Singleton
    @Provides
    public ApiService provideApiService() {
        Log.d("Log", "new apiService");
        return new ApiService();
    }
}
