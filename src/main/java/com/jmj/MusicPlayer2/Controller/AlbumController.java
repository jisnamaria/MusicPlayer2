package com.jmj.MusicPlayer2.Controller;

import com.jmj.MusicPlayer2.Model.Album;
import com.jmj.MusicPlayer2.Request.Albumrequest;
import com.jmj.MusicPlayer2.Service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/album")
public class AlbumController {

    @Autowired
    private AlbumService albumService;

    @GetMapping("/{id}")
    public Album getAlbumById(@PathVariable("id") int id) {
        return albumService.getAlbumById(id);
    }

    @GetMapping
    public Collection<Album> getAlbum() {
        return albumService.getAlbum();
    }

    @PostMapping
    public Album createAlbum(@RequestBody Albumrequest album) {
        return albumService.createAlbum(album);
    }

    @PutMapping("/{id}")
    public Album updateAlbum(@PathVariable int id, @RequestBody Albumrequest album) {
        return albumService.updateAlbum(album,id);
    }

    @DeleteMapping("/{id}")
    public boolean deleteAlbum(@PathVariable int id, @RequestBody Album album) {
        return albumService.deleteAlbum(album, id);
    }
}
