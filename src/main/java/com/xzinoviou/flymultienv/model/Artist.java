package com.xzinoviou.flymultienv.model;

import jakarta.persistence.*;
import lombok.Data;

/**
 * @author : Xenofon Zinoviou
 */
@Entity
@Table(name = "ARTIST", schema = "music_records_schema")
@Data
public class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ARTIST_ID_SEQ")
    @SequenceGenerator(
            name = "ARTIST_ID_SEQ",
            sequenceName = "ARTIST_ID_SEQ",
            schema = "music_records_schema",
            allocationSize = 1)
    @Column(name = "ID")
    private Long id;

    @Column(name = "ARTIST_NAME")
    private String artistName;
}
