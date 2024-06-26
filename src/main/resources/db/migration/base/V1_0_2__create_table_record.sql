CREATE TABLE RECORD
(
    ID          bigint NOT NULL,
    RECORD_NAME varchar(255) NULL,
    PRIMARY KEY (ID)
);

CREATE SEQUENCE RECORD_ID_SEQ
    MINVALUE 1
    START WITH 1
    INCREMENT BY 1 CACHE 1
;
