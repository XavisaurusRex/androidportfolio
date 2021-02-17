package cat.devsofthecoast.androidportfolio

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import cat.devsofthecoast.androidportfolio.artworks.repository.ArtworkRepository
import cat.devsofthecoast.androidportfolio.artworks.repository.api.ApiArtworksRoot
import cat.devsofthecoast.androidportfolio.testabledata.FlowersJardenImpl
import dagger.hilt.android.AndroidEntryPoint
import retrofit2.Call
import retrofit2.Response
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

  @Inject
  lateinit var flowersJarden: FlowersJardenImpl
  @Inject
  lateinit var artworkRepository: ArtworkRepository

  private val tvMainText: TextView by lazy { findViewById(R.id.tvMainText) }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    artworkRepository.getArtworks(null, 20, 26)
      ?.enqueue(object : retrofit2.Callback<ApiArtworksRoot?> {
        override fun onResponse(
          call: Call<ApiArtworksRoot?>,
          response: Response<ApiArtworksRoot?>
        ) {
          if(response.isSuccessful){
            response.body()?.artworks?.forEach {
              tvMainText.text = tvMainText.text?.toString() + it.title + ", ";
            }
          }
        }

        override fun onFailure(call: Call<ApiArtworksRoot?>, t: Throwable) {
          tvMainText.text = "Request failed";
        }
      })
  }
}