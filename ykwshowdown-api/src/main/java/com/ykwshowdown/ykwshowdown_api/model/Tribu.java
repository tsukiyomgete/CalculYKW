package com.ykwshowdown.ykwshowdown_api.model;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Entity
@Table(name = "Tribu")
public class Tribu {
    @Id
    private String nomTribu;

    // Getters
    public String getTribu() {return nomTribu;}
}
