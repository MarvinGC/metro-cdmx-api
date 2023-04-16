package com.marvingcdev.Metro.CDMX.Train;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Train {
    @Id
    private Long id;
    private String Name;
    private String Color;
    private Long StationId;

}
