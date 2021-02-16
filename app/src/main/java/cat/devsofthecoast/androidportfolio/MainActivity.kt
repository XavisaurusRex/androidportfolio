package cat.devsofthecoast.androidportfolio

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import cat.devsofthecoast.androidportfolio.testabledata.FlowersJardenImpl
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

  @Inject
  lateinit var flowersJarden: FlowersJardenImpl

  private val tvMainText: TextView by lazy { findViewById(R.id.tvMainText) }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    tvMainText.postDelayed({
      tvMainText.setText(
        flowersJarden.getFlower2().name + flowersJarden.getFlower3().color + flowersJarden.getFlower3().family +
            flowersJarden.getFlower2().name + flowersJarden.getFlower3().color + flowersJarden.getFlower3().family +
            flowersJarden.getFlower2().name + flowersJarden.getFlower3().color + flowersJarden.getFlower3().family
      )
    }, 1000)
  }
}