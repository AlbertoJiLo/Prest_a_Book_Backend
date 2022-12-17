package com.example.prestabook.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.prestabook.dto.Usuario;
import com.example.prestabook.dto.Wishes;


public interface IWishesDAO extends JpaRepository<Wishes, Long>{
	
	List<Wishes> findByUsuario(Usuario usuario);
}
