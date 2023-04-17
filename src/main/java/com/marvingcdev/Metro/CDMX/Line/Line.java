package com.marvingcdev.Metro.CDMX.Line;

import jakarta.persistence.*;

@Entity
@Table(name = "lines")
public class Line {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Name;
    private String Color;
    private Long StationId;

}
