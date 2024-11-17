package br.com.mysongs.models;

public class Audio {
    private String title;
    private int totalWatches;
    private int totalLikes;
    private int ageRating;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTotalStreams() {
        return totalWatches;
    }

    public int getTotalLikes() {
        return totalLikes;
    }

    public double getAgeRating() {
        return ageRating;
    }

    public void likes(){
        this.totalLikes++;
    }

    public void watches(){
        this.totalWatches++;
    }

}
