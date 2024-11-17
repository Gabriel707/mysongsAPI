package br.com.mysongs.principal;

import br.com.mysongs.models.Podcast;
import br.com.mysongs.models.Song;

public class Main {
    public static void main(String[] args) {
        Song mySong = new Song();

        mySong.setTitle("Earfquake");
        mySong.setArtist("Tyler, The Creator");
        mySong.setAlbum("IGOR");

        for (int i = 0; i < 1000; i++) {
            mySong.plays();

        }

        for (int i = 0; i < 50; i++) {
            
        }

        Podcast favoritePodcast = new Podcast();
        favoritePodcast.setTitle("JRE - Joe Rogan Experience");
        favoritePodcast.setHost("Joe Rogan");

        for (int i = 0; i < 5000; i++) {
            favoritePodcast.plays();
        }

        for (int i = 0; i < 1000; i++) {
            favoritePodcast.likes();
        }



    }
}
