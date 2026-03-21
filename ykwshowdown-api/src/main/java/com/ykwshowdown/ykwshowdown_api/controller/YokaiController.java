package com.ykwshowdown.ykwshowdown_api.controller;

import com.ykwshowdown.ykwshowdown_api.model.Yokai;
import com.ykwshowdown.ykwshowdown_api.repository.YokaiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/yokai")
public class YokaiController {

    @Autowired
    private YokaiRepository yokaiRepository;

    // Récupérer tous les Yokai
    @GetMapping
    public List<Yokai> getAllYokai() {
        return yokaiRepository.findAll();
    }

    // Récupérer un Yokai par nom
    @GetMapping("/{nom}")
    public List<Yokai> getYokaiByNom(@PathVariable String nom) {
        return yokaiRepository.findByNomYokai(nom);
    }

    // Récupérer par tribu
    @GetMapping("/tribu/{nomTribu}")
    public List<Yokai> getYokaiByTribu(@PathVariable String nomTribu) {
        return yokaiRepository.findByNomTribu(nomTribu);
    }
}