package com.ykwshowdown.ykwshowdown_api.model;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"idMedaillum", "nomYokai", "nomTribu", "rangYokai", "tierYokai", "typeElementaire", "faiblesseElementaire", "resistanceElementaire", "statB", "statA"})
@Entity
@Table(name = "Yokai")
public class Yokai {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMedaillum;

    @Column(name = "nomYokai")
    private String nomYokai;

    @Column(name = "nomTribu")
    private String nomTribu;

    @Column(name = "rangYokai")
    private String rangYokai;

    @Column(name = "tierYokai")
    private String tierYokai;

    @Column(name = "typeElementaire")
    private String typeElementaire;

    @Column(name = "faiblesseElementaire")
    private String faiblesseElementaire;

    @Column(name = "resistanceElementaire")
    private String resistanceElementaire;

    @Column(name = "statB")
    private int statB;

    @Column(name = "statA")
    private int statA;

    // Getters
    public int getIdMedaillum() { return idMedaillum; }
    public String getNomYokai() { return nomYokai; }
    public String getNomTribu() { return nomTribu; }
    public String getRangYokai() { return rangYokai; }
    public String getTierYokai() { return tierYokai; }
    public String getTypeElementaire() { return typeElementaire; }
    public String getFaiblesseElementaire() { return faiblesseElementaire; }
    public String getResistanceElementaire() { return resistanceElementaire; }
    public int getStatB() { return statB; }
    public int getStatA() { return statA; }
}
