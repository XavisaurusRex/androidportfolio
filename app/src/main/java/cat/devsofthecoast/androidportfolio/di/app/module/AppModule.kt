package cat.devsofthecoast.androidportfolio.di.app.module

import cat.devsofthecoast.androidportfolio.BuildConfig
import cat.devsofthecoast.androidportfolio.artworks.repository.ArtworkRepository
import cat.devsofthecoast.androidportfolio.di.app.scope.AppScope
import cat.devsofthecoast.androidportfolio.di.app.scope.HarvardArtMuseumApiScope
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import okhttp3.HttpUrl
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(ApplicationComponent::class)
class AppModule {

  @Provides
  @AppScope
  fun provideArtworkRepository(@HarvardArtMuseumApiScope okHttpClient: OkHttpClient): ArtworkRepository {
    return getRetrofit(okHttpClient).create(ArtworkRepository::class.java)
  }

  @Provides
  @AppScope
  fun getRetrofit(@HarvardArtMuseumApiScope okHttpClient: OkHttpClient): Retrofit {
    return Retrofit.Builder()
      .baseUrl(BuildConfig.BASE_URL)
      .client(okHttpClient)
      .addConverterFactory(GsonConverterFactory.create())
      .build()
  }

  @Provides
  @HarvardArtMuseumApiScope
  fun provideOkHttpClientForHarvardArtMuseumRequests(@HarvardArtMuseumApiScope HARVARD_ART_MUSEUM_API_KEY_VALUE: String): OkHttpClient {
    val httpClientBuilder: OkHttpClient.Builder = OkHttpClient.Builder()
    httpClientBuilder.addInterceptor {
      // This interceptor register apiKey directly into every request that attach this okhttpsclient
      val request: Request.Builder = it.request().newBuilder()
      val url: HttpUrl = it.request().url.newBuilder().addQueryParameter(
        HARVARD_ART_MUSEUM_API_KEY,
        HARVARD_ART_MUSEUM_API_KEY_VALUE
      ).build()
      request.url(url)
      it.proceed(request.build())
    }

    if (BuildConfig.DEBUG) {
      val logging = HttpLoggingInterceptor()
      logging.setLevel(HttpLoggingInterceptor.Level.BODY)
      httpClientBuilder.addInterceptor(logging)
    }

    return httpClientBuilder.build()
  }

  /**
   * We need an api key to acces Harvard Art Museum public api, you have to request yours and
   * put in your gradle.properties.
   *
   * @return String ApiKey
   * @see [Request Api Key to execute this app](https://docs.google.com/forms/d/e/1FAIpQLSfkmEBqH76HLMMiCC-GPPnhcvHC9aJS86E32dOd0Z8MpY2rvQ/viewform)
   */
  @Provides
  @HarvardArtMuseumApiScope
  fun provideHarvardArtMuseumApiKey(): String {
    return BuildConfig.API_KEY
  }

  companion object {
    private const val HARVARD_ART_MUSEUM_API_KEY = "apikey"
  }
}