package cat.devsofthecoast.androidportfolio.artworks.repository.api;
import com.google.gson.annotations.SerializedName;

public final class ApiInfo {

    @SerializedName("totalrecordsperquery")
    private int totalrecordsperquery;

    @SerializedName("totalrecords")
    private int totalrecords;

    @SerializedName("pages")
    private int pages;

    @SerializedName("page")
    private int page;

    public int getTotalrecordsperquery() {
        return totalrecordsperquery;
    }

    public int getTotalrecords() {
        return totalrecords;
    }

    public int getPages() {
        return pages;
    }

    public int getPage() {
        return page;
    }
}
