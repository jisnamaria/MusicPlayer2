package com.jmj.MusicPlayer2.Request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ArtistRequest {
    private String arName;
    private String arLang;
    private List<Integer> albumId;
}
