package br.com.mysongs.models;

public class Audio {
    private String title;
    private int totalPlays;
    private int totalLikes;
    private int Rating;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTotalPlays() {
        return totalPlays;
    }

    public int getTotalLikes() {
        return totalLikes;
    }

    public int getRating() {
        return Rating;
    }

    public void likes(){
        this.totalLikes++;
    }

    public void plays(){
        this.totalPlays++;
    }

}
