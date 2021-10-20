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
public class Albumrequest {
    private String albName;
    private List<Integer> musicId;
}
