package com.jmj.MusicPlayer2.Model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int alId;
    @Column
    private String alName;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "album_id", referencedColumnName = "alId")
    private List<Music> music;

    public int getAlId() {
        return alId;
    }

    public void setAlId(int alId) {
        this.alId = alId;
    }

    public String getAlName() {
        return alName;
    }

    public void setAlName(String alName) {
        this.alName = alName;
    }

    public List<Music> getMusic() {
        return music;
    }

    public void setMusic(List<Music> music) {
        this.music = music;
    }
}
