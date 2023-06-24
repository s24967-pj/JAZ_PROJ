package com.example.jazs24967nbp;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Bank {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Schema(
            name = "id",
            description = "id of the movie",
            example = "1")
    private Integer id;

    @Schema(
            name = "waluta",
            description = "rodzaje walut",
            example = "PLN")
    private String waluta;

    @Schema(
            name = "data_r",
            description = "data rozpoczynajaca przedzial",
            example = "2022-10-19")
    private Date data_r;

    @Schema(
            name = "data_k",
            description = "data konczaca przedzial",
            example = "2023-10-10")
    private Date data_k;

    @Schema(
            name = "wyl_kurs",
            description = "wyliczenie kursu",
            example = "22")
    private Integer wyl_kurs;

    @Schema(
            name = "czas_zapytania",
            description = "data zapytania",
            example = "2023-10-10")
    private Date czas_zapytania;


    public Bank() {

    }

    public Integer getId() {
        return id;
    }

    public String getWaluta() {
        return waluta;
    }

    public Integer getWyl_kurs() {
        return wyl_kurs;
    }
}
