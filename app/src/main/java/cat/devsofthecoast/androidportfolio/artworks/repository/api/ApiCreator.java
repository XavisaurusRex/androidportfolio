package cat.devsofthecoast.androidportfolio.artworks.repository.api;
import com.google.gson.annotations.SerializedName;

public class ApiCreator {
    @SerializedName("id")
    private int id;

    @SerializedName("description")
    private String description;

    @SerializedName("extent")
    private String extent;

    @SerializedName("qualifier")
    private String qualifier;

    @SerializedName("role")
    private String role;

    @SerializedName("biography")
    private String biography;

    @SerializedName("name_in_original_language")
    private String name_in_original_language;

    @SerializedName("birth_year")
    private String birth_year;

    @SerializedName("death_year")
    private String death_year;

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getExtent() {
        return extent;
    }

    public String getQualifier() {
        return qualifier;
    }

    public String getRole() {
        return role;
    }

    public String getBiography() {
        return biography;
    }

    public String getName_in_original_language() {
        return name_in_original_language;
    }

    public String getBirth_year() {
        return birth_year;
    }

    public String getDeath_year() {
        return death_year;
    }
}
