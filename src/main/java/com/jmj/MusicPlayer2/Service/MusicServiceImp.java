package com.jmj.MusicPlayer2.Service;

import com.jmj.MusicPlayer2.Model.Music;
import com.jmj.MusicPlayer2.Repo.MusicRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class MusicServiceImp implements MusicService{

    @Autowired
    private MusicRepo musicRepo;

    @Override
    public Music createMusic(Music music) {
        return musicRepo.save(music);
    }

    @Override
    public Music updateMusic(Music music, int id) {
        Optional<Music> sample = Optional.of(musicRepo.findById(id).get());
        sample.ifPresent(value -> {
            value.setmName(music.getmName());
            musicRepo.save(sample.get());
        });
        return sample.orElse(null);
    }

    @Override
    public Music getMusicById(int id) {
        return musicRepo.findById(id).orElse(null);
    }

    @Override
    public Collection<Music> getMusic() {
        return musicRepo.findAll();
    }

    @Override
    public boolean deleteMusic(Music music, int id) {
        if(musicRepo.findById(id).isPresent()) {
            musicRepo.deleteById(id);
            return true;
        }
        return false;
    }
}
