package com.mvc;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mvc.model.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer>{

	List<Alien> findByAnameOrderByAidDesc(String aname);
}
