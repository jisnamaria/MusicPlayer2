package com.jmj.MusicPlayer2.Service;

import com.jmj.MusicPlayer2.Model.Artist;
import com.jmj.MusicPlayer2.Request.ArtistRequest;

public interface ArtistService {
    Artist createArtist(ArtistRequest artist);
    Artist updateArtist(ArtistRequest artist, int Id);

    Artist getArtistById(int id);
    Artist getArtist();

    boolean deleteArtist(Artist artist, int Id);
}
