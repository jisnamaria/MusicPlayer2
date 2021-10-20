package com.jmj.MusicPlayer2.Repo;

import com.jmj.MusicPlayer2.Model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepo extends JpaRepository<Artist,Integer> {
}
