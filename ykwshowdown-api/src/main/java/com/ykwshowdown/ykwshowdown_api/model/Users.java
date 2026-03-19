package com.ykwshowdown.ykwshowdown_api.model;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.*;

@JsonPropertyOrder({"id", "username", "password", "joined_date", "last_connected", "elo"})
@Entity
@Table(name = "Users")
public class Users {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "joined_date")
    private Date joined_date;

    @Column(name = "last_connected")
    private Date last_connected;

    @Column(name = "elo")
    private int elo;

    public int getId() {return id;}
    public String getUsername() {return username;}
    public String getPassword() {return password;}
    public Date getJoinedDate() {return joined_date;}
    public Date getLastLog() {return last_connected;}
    public int getElo() {return elo;}


}
