package com.ykwshowdown.ykwshowdown_api.repository;

import com.ykwshowdown.ykwshowdown_api.model.Users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {
    
    // Chercher un Yokai par nom
    @Query(value ="SELECT * FROM Users WHERE username = :nom", nativeQuery = true)
    Users chercherNom(@Param("nom") String nom);

    @Query(value = "SELECT * FROM Users WHERE elo = :elo", nativeQuery = true)
    List<Users> chercherUserParElo(@Param("elo") int elo);

    @Query(value = "SELECT * FROM Users WHERE elo < :elo", nativeQuery = true)
    List<Users> chercherUserInfElo(@Param("elo") int elo);

    @Query(value = "SELECT * FROM Users WHERE elo > :elo", nativeQuery = true)
    List<Users> chercherUserSupElo(@Param("elo") int elo);

    @Query(value = "SELECT * FROM Users WHERE joined_date = :date", nativeQuery = true)
    List<Users> chercherUserParDateJoin(@Param("date") String date);

    @Transactional
    @Modifying
    @Query(value = "INSERT INTO Users (username, password, joined_date, last_connected, elo) VALUES (:username, :password, :joined_date, :logged_date, :elo)", nativeQuery = true)
    void creeUsers(@Param("username") String username, @Param("password") String password, @Param("joined_date") String date, @Param("logged_date") String dateLog, @Param("elo") int elo);

}