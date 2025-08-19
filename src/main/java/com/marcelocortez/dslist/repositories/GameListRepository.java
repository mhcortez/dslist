package com.marcelocortez.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcelocortez.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

	
	
}
