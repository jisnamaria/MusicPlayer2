package com.jmj.MusicPlayer2.Service;

import com.jmj.MusicPlayer2.Model.Album;
import com.jmj.MusicPlayer2.Request.Albumrequest;

import java.util.Collection;

public interface AlbumService {
    Album createAlbum(Albumrequest album);
    Album updateAlbum(Albumrequest album, int id);

    Album getAlbumById(int id);
    Collection<Album> getAlbum();

    boolean deleteAlbum(Album album, int id);
}
