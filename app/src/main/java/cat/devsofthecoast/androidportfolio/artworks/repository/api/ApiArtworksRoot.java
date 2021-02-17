package cat.devsofthecoast.androidportfolio.artworks.repository.api;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public final class ApiArtworksRoot {

    @SerializedName("info")
    private ApiInfo info;

    @SerializedName("records")
    private List<ApiArtwork> artworks;


    public ApiInfo getInfo() {
        return info;
    }

    public List<ApiArtwork> getArtworks() {
        return artworks;
    }

}
