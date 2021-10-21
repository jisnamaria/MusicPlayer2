package com.jmj.MusicPlayer2.Service;

import com.jmj.MusicPlayer2.Model.Music;

public interface MusicService {
    Music createMusic(Music music);
    Music updateMusic(Music music, int id);

    Music getMusicById(int id);
    Music getMusic();

    boolean deleteMusic(Music music, int id);
}
