package com.marcelocortez.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcelocortez.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

	
	
}
