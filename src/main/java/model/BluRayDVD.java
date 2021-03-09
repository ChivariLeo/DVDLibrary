package model;

public class BluRayDVD extends DVD{

    private String quality;

    public BluRayDVD(String title, String rating, String directorName, String studio, String userNote, String quality) {
        super(title, rating, directorName, studio, userNote);
        this.quality = quality;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }
}
