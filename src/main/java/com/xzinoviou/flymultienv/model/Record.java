package com.xzinoviou.flymultienv.model;

import jakarta.persistence.*;
import lombok.Data;

/**
 * @author : Xenofon Zinoviou
 */
@Entity
@Table(name = "RECORD", schema = "music_records_schema")
@Data
public class Record {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "RECORD_ID_SEQ")
    @SequenceGenerator(
            name = "RECORD_ID_SEQ",
            sequenceName = "RECORD_ID_SEQ",
            schema = "music_records_schema",
            allocationSize = 1)
    @Column(name = "ID")
    private Long id;

    @Column(name = "RECORD_NAME")
    private String recordName;
}
