package ru.netology.nmedia.service

import com.google.firebase.messaging.FirebaseMessaging
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class FCMServiceModel {

    @Provides
    @Singleton
    fun provideFCMService(): FirebaseMessaging = FirebaseMessaging.getInstance()
}