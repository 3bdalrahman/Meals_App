package com.example.session2task1.di



import com.example.domain.repo.meals.MealsRepo
import com.example.domain.usecase.meals.GetMealsCategoriesFromRemote
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Provides
    fun provideGetDataFromRemoteUseCase(mealsRepo: MealsRepo): GetMealsCategoriesFromRemote {
        return GetMealsCategoriesFromRemote(mealsRepo)
    }


}