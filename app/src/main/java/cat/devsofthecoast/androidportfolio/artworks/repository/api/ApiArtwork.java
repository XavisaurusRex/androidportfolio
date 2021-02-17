package cat.devsofthecoast.androidportfolio.artworks.repository.api;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public final class ApiArtwork implements Serializable {

    @SerializedName("accessionyear")
    private String accessionyear;

    @SerializedName("technique")
    private String technique;

    @SerializedName("mediacount")
    private int mediacount;

    @SerializedName("totalpageviews")
    private int totalpageviews;

    @SerializedName("groupcount")
    private int groupcount;

    @SerializedName("people")
    private List<ApiPeople> people;

    @SerializedName("objectnumber")
    private String objectnumber;

    @SerializedName("colorcount")
    private int colorcount;

    @SerializedName("lastupdate")
    private String lastupdate;

    @SerializedName("rank")
    private int rank;

    @SerializedName("imagecount")
    private int imagecount;

    @SerializedName("description")
    private String description;

    @SerializedName("dateoflastpageview")
    private String dateoflastpageview;

    @SerializedName("dateoffirstpageview")
    private String dateoffirstpageview;

    @SerializedName("primaryimageurl")
    private String primaryimageurl;

    @SerializedName("title")
    private String title;

    public String getAccessionyear() {
        return accessionyear;
    }

    public String getTechnique() {
        return technique;
    }

    public int getMediacount() {
        return mediacount;
    }

    public int getTotalpageviews() {
        return totalpageviews;
    }

    public int getGroupcount() {
        return groupcount;
    }

    public List<ApiPeople> getPeople() {
        return people;
    }

    public String getObjectnumber() {
        return objectnumber;
    }

    public int getColorcount() {
        return colorcount;
    }

    public String getLastupdate() {
        return lastupdate;
    }

    public int getRank() {
        return rank;
    }

    public int getImagecount() {
        return imagecount;
    }

    public String getDescription() {
        return description;
    }

    public String getDateoflastpageview() {
        return dateoflastpageview;
    }

    public String getDateoffirstpageview() {
        return dateoffirstpageview;
    }

    public String getPrimaryimageurl() {
        return primaryimageurl;
    }

    public String getTitle() {
        return title;
    }
}
