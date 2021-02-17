package cat.devsofthecoast.androidportfolio.artworks.repository.api;
import com.google.gson.annotations.SerializedName;

public class ApiParams {

    @SerializedName("q")
    private String filterTerm;

    @SerializedName("skip")
    private int offsetIndex;

    @SerializedName("limit")
    private int limitResultsNumber;

    public String getFilterTerm() {
        return filterTerm;
    }

    public int getOffsetIndex() {
        return offsetIndex;
    }

    public int getLimitResultsNumber() {
        return limitResultsNumber;
    }
}
