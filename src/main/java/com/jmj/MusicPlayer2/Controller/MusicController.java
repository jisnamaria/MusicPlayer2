package com.jmj.MusicPlayer2.Controller;

import com.jmj.MusicPlayer2.Model.Music;
import com.jmj.MusicPlayer2.Service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/music")
public class MusicController {

    @Autowired
    private MusicService musicService;

    @GetMapping("/{id}")
    public Music getMusicById(@PathVariable("id") int id) {
        return musicService.getMusicById(id);
    }

    @GetMapping
    public Collection<Music> getMusic() {
        return musicService.getMusic();
    }

    @PostMapping
    public Music createMusic(@RequestBody Music music) {
        return musicService.createMusic(music);
    }

    @PutMapping("/{id}")
    public Music updateMusic(@PathVariable int id, @RequestBody Music music) {
        return musicService.updateMusic(music, id);
    }

    @DeleteMapping("/{id}")
    public boolean deleteMusic(@PathVariable int id, @RequestBody Music music) {
        return musicService.deleteMusic(music, id);
    }
}
