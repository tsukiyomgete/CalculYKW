package com.ykwshowdown.ykwshowdown_api.controller;

import com.ykwshowdown.ykwshowdown_api.model.Users;
import com.ykwshowdown.ykwshowdown_api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UsersController {

    @Autowired
    private UserRepository usersRepository; 

    // Récupérer tous les users
    @GetMapping
    public List<Users> getAllUsers() {
        return usersRepository.findAll();
    }

    // Récupérer par username
    @GetMapping("/{nom}")
    public Users getUserByNom(@PathVariable String nom) {
        return usersRepository.chercherNom(nom);
    }

    // Récupérer par elo
    @GetMapping("/elo/{elo}")
    public List<Users> getUsersByElo(@PathVariable int elo) {
        return usersRepository.chercherUserParElo(elo);
    }

    @PostMapping
    public void createUsers(@RequestParam String username,@RequestParam String password,@RequestParam String joinedDate,@RequestParam String lastConnected,@RequestParam int elo) {
        usersRepository.creeUsers(username, password, joinedDate, lastConnected, elo);
    }


}