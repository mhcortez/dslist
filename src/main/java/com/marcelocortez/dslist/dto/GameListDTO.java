package com.marcelocortez.dslist.dto;

import com.marcelocortez.dslist.entities.GameList;

public class GameListDTO {
	private Long id;
	private String name;
	
	public GameListDTO() {}

	public GameListDTO(GameList entity) {		
		id = entity.getID();
		name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	

}
