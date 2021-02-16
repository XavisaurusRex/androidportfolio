package cat.devsofthecoast.androidportfolio.testabledata

import javax.inject.Inject


class FlowersJardenImpl @Inject constructor() : FlowersJarden {

  override fun getFlower1() = Flower("Margarita", "Soy Daltonico", "Familia desconocida");
  override fun getFlower2() = Flower("Rosa", "Soy Daltonico", "Familia A");
  override fun getFlower3() = Flower("Filomena", "Soy Daltonico", "Familia C");
}