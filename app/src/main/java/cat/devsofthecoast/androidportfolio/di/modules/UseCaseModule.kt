package cat.devsofthecoast.androidportfolio.di.modules

import cat.devsofthecoast.androidportfolio.testabledata.FlowersJarden
import cat.devsofthecoast.androidportfolio.testabledata.FlowersJardenImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
object UseCaseModule {

  @Provides
  fun provideFlowersJarden(): FlowersJarden = FlowersJardenImpl()

}