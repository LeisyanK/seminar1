package org.example.seminar3.cw.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Students {
    private String surname;
    private Integer group;
    private Integer grant;
    private Integer matem;
    private Integer history;
    private Integer language;
    List<Integer> count;
}
