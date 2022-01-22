package com.devsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dsmovie.entitties.Score;
import com.devsuperior.dsmovie.entitties.ScorePk;

@Repository
public interface ScoreRepository extends JpaRepository<Score, ScorePk>{

	

}
