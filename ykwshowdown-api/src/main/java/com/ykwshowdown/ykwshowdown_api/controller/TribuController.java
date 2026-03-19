package com.ykwshowdown.ykwshowdown_api.controller;

import com.ykwshowdown.ykwshowdown_api.model.Tribu;
import com.ykwshowdown.ykwshowdown_api.repository.TribuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/tribu")
public class TribuController {

    @Autowired
    private TribuRepository TribuRepository;

    // Récupérer une Tribu
    @GetMapping("/{nomTribu}")
    public List<Tribu> getYokaiByNom(@PathVariable String nomTribu) {
        return TribuRepository.findByNomTribu(nomTribu);
    }

}