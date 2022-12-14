package com.example.prestabook.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.prestabook.dto.Drawer;



public interface IDrawerDAO extends JpaRepository<Drawer, String>{
	
	
}
