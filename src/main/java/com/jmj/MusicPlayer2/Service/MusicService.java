package com.jmj.MusicPlayer2.Service;

import com.jmj.MusicPlayer2.Model.Music;


import java.util.Collection;

public interface MusicService {
    Music createMusic(Music music);
    Music updateMusic(Music music, int id);

    Music getMusicById(int id);
    Collection<Music> getMusic();

    boolean deleteMusic(Music music, int id);
}
