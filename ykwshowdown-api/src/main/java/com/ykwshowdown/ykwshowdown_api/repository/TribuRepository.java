package com.ykwshowdown.ykwshowdown_api.repository;

import com.ykwshowdown.ykwshowdown_api.model.Tribu;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TribuRepository extends JpaRepository<Tribu, String> {
    
    // Chercher un Yokai par nom
    List<Tribu> findByNomTribu(String nomTribu);

}