package com.jmj.MusicPlayer2.Repo;

import com.jmj.MusicPlayer2.Model.Music;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MusicRepo extends JpaRepository<Music,Integer> {
}
