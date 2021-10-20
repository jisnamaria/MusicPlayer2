package com.jmj.MusicPlayer2.Repo;

import com.jmj.MusicPlayer2.Model.Album;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AlbumRepo extends JpaRepository<Album,Integer> {
}
