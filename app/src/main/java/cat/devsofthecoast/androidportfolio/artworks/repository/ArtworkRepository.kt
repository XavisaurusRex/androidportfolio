package cat.devsofthecoast.androidportfolio.artworks.repository

import cat.devsofthecoast.androidportfolio.artworks.repository.api.ApiArtworksRoot
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ArtworkRepository {
  @GET("object")
  fun getArtworks(
    @Query("q") searchTerm: String?,
    @Query("size") limitResultsNumber: Int,
    @Query("classification") vararg classificationId: Int
  ): Call<ApiArtworksRoot?>?
}