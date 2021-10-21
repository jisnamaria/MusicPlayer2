package com.jmj.MusicPlayer2.Service;

import com.jmj.MusicPlayer2.Model.Album;
import com.jmj.MusicPlayer2.Model.Music;
import com.jmj.MusicPlayer2.Repo.AlbumRepo;
import com.jmj.MusicPlayer2.Request.Albumrequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class AlbumServiceImp implements AlbumService {
    @Autowired
    private AlbumRepo albumRepo;
    @Autowired
    private MusicService musicService;

    public Album createAlbum(Albumrequest album) {

        ArrayList<Music> musicList = new ArrayList<Music>();
        for (Integer m: album.getMusicId()) {
            musicList.add(musicService.getMusicById(m));
        }

        Album alb = new Album();
        alb.setAlName(album.getAlbName());
        alb.setMusic(musicList);

        return albumRepo.save(alb);
    }

    @Override
    public Album updateAlbum(Albumrequest album, int id) {

        ArrayList<Music> musicList = new ArrayList<Music>();
        for (Integer m: album.getMusicId()) {
            musicList.add(musicService.getMusicById(m));
        }
        Optional<Album> sample = Optional.of(albumRepo.findById(id).get());
        sample.ifPresent(value -> {
            value.setAlName(album.getAlbName());
            value.setMusic(musicList);
            albumRepo.save(sample.get());
        });
        return sample.orElse(null);
    }

    @Override
    public Album getAlbumById(int id) {
        return albumRepo.findById(id).orElse(null);
    }

    @Override
    public Album getAlbum() {
        return (Album) albumRepo.findAll();
    }

    @Override
    public boolean deleteAlbum(Album album, int id) {
        if(albumRepo.findById(id).isPresent()) {
            albumRepo.deleteById(id);
            return true;
        }
        return false;
    }
}
