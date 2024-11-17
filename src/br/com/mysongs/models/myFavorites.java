package br.com.mysongs.models;

public class myFavorites {

    public void include(Audio audio){
        if(audio.getRating() >= 9) {
            System.out.println(audio.getTitle() + " considered a success " +
                    "- and recommended by our users.");
        } else {
            System.out.println(audio.getTitle() + " also getting noticed by most users.");
        }
    }
}
