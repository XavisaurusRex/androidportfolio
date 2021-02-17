package cat.devsofthecoast.androidportfolio.artworks.repository.api;
import com.google.gson.annotations.SerializedName;

public class ApiPeople {
    @SerializedName("role")
    private String role;

    @SerializedName("birthplace")
    private String birthplace;

    @SerializedName("gender")
    private String gender;

    @SerializedName("displaydate")
    private String displaydate;

    @SerializedName("culture")
    private String culture;

    @SerializedName("displayname")
    private String displayname;

    @SerializedName("alphasort")
    private String alphasort;

    @SerializedName("name")
    private String name;

    @SerializedName("personid")
    private int personid;

    @SerializedName("deathplace")
    private String deathplace;

    @SerializedName("displayorder")
    private int displayorder;

    public String getRole() {
        return role;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public String getGender() {
        return gender;
    }

    public String getDisplaydate() {
        return displaydate;
    }

    public String getCulture() {
        return culture;
    }

    public String getDisplayname() {
        return displayname;
    }

    public String getAlphasort() {
        return alphasort;
    }

    public String getName() {
        return name;
    }

    public int getPersonid() {
        return personid;
    }

    public String getDeathplace() {
        return deathplace;
    }

    public int getDisplayorder() {
        return displayorder;
    }
}
