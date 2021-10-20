package com.jmj.MusicPlayer2.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int aId;
    @Column
    private String aName;
    @Column
    private String aLang;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "artist_id",referencedColumnName = "aId")
    private List<Album> album;

    public int getaId() {
        return aId;
    }

    public void setaId(int aId) {
        this.aId = aId;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public String getaLang() {
        return aLang;
    }

    public void setaLang(String aLang) {
        this.aLang = aLang;
    }

    public List<Album> getAlbum() {
        return album;
    }

    public void setAlbum(List<Album> album) {
        this.album = album;
    }
}
