package com.jmj.MusicPlayer2.Controller;

import com.jmj.MusicPlayer2.Model.Artist;
import com.jmj.MusicPlayer2.Request.ArtistRequest;
import com.jmj.MusicPlayer2.Service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/artist")
public class ArtistController {

        @Autowired
        private ArtistService artistService;

        @GetMapping("/{id}")
        public Artist getArtistById(@PathVariable("id") int id) {
            return artistService.getArtistById(id);
        }

        @GetMapping
        public Collection<Artist> getArtist() {
            return artistService.getArtist();
        }

        @PostMapping
        public Artist createArtist(@RequestBody ArtistRequest artist) {
            return artistService.createArtist(artist);
        }

        @PutMapping("/{Id}")
        public Artist updateArtist(@PathVariable int Id, @RequestBody ArtistRequest artist) {
            return artistService.updateArtist(artist, Id);
        }

        @DeleteMapping("/{Id}")
        public boolean deleteArtist(@PathVariable int Id, @RequestBody Artist artist) {
            return artistService.deleteArtist(artist, Id);
        }

    }



