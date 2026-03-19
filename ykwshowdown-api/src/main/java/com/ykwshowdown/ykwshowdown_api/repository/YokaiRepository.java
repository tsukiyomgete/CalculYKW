package com.ykwshowdown.ykwshowdown_api.repository;

import com.ykwshowdown.ykwshowdown_api.model.Yokai;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface YokaiRepository extends JpaRepository<Yokai, Integer> {
    
    // Chercher un Yokai par nom
    List<Yokai> findByNomYokai(String nomYokai);
    
    // Chercher par tribu
    List<Yokai> findByNomTribu(String nomTribu);
    
    // Chercher par rang
    List<Yokai> findByRangYokai(String rangYokai);
}