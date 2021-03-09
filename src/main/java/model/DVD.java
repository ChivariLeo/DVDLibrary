package model;

public class DVD {

    private String title;
    private String rating;
    private String directorName;
    private String studio;
    private String userNote;


    public DVD() { }

    public DVD(String title, String rating, String directorName, String studio, String userNote) {
        this.title = title;
        this.rating = rating;
        this.directorName = directorName;
        this.studio = studio;
        this.userNote = userNote;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDirectorName() {
        return this.directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public String getStudio() {
        return this.studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getUserNote() {
        return userNote;
    }

    public void setUserNote(String userNote) {
        this.userNote = userNote;
    }


    @Override
    public String toString() {
        return "DVD{" +
                "title='" + title + '\'' +
                ", rating='" + rating + '\'' +
                ", directorName='" + directorName + '\'' +
                ", studio='" + studio + '\'' +
                ", userNote='" + userNote + '\'' +
                '}';
    }
}


