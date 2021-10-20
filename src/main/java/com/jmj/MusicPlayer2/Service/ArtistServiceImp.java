package com.jmj.MusicPlayer2.Service;

import com.jmj.MusicPlayer2.Model.Album;
import com.jmj.MusicPlayer2.Model.Artist;
import com.jmj.MusicPlayer2.Repo.ArtistRepo;
import com.jmj.MusicPlayer2.Request.ArtistRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.Optional;

@Service
public class ArtistServiceImp implements  ArtistService{

    @Autowired
    private ArtistRepo artistRepo;
    @Autowired
    private AlbumService albumService;

    @Override
    public Artist createArtist(ArtistRequest artist) {

         ArrayList<Album> albumList = new ArrayList<Album>();
        for (Integer m: artist.getAlbumId()) {
            albumList.add(albumService.getAlbumById(m));
        }

        Artist ar = new Artist();
        ar.setaName(artist.getArName());
        ar.setAlbum(albumList);

        return artistRepo.save(ar);
    }

    @Override
    public Artist updateArtist(ArtistRequest artist, int Id) {
        ArrayList<Album> albumList = new ArrayList<Album>();
        for (Integer m: artist.getAlbumId()) {
            albumList.add(albumService.getAlbumById(m));
        }
        Optional<Artist> sample = Optional.of(artistRepo.findById(Id).get());
        sample.ifPresent(value -> {
            value.setaName(artist.getArName());
            value.setaLang(artist.getArLang());
            value.setAlbum(albumList);
            artistRepo.save(sample.get());
        });
        return sample.orElse(null);
    }

    @Override
    public Artist getArtistById(int id) {
        return artistRepo.findById(id).orElse(null);
    }

    @Override
    public Collection<Artist> getArtist() {
        return artistRepo.findAll();
    }

    @Override
    public boolean deleteArtist(Artist artist, int Id ) {
        if(artistRepo.findById(Id).isPresent()) {
            artistRepo.deleteById(Id);
            return true;
        }
        return false;
    }
}
