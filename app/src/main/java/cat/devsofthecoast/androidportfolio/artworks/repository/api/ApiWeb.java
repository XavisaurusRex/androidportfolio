package cat.devsofthecoast.androidportfolio.artworks.repository.api;
import com.google.gson.annotations.SerializedName;

public class ApiWeb {

    @SerializedName("url")
    private String imageUrl;

    public String getImageUrl() {
        return imageUrl;
    }
}
