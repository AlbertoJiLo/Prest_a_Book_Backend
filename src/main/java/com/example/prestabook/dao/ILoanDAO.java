package com.example.prestabook.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.prestabook.dto.Loan;
import com.example.prestabook.dto.Usuario;


public interface ILoanDAO extends JpaRepository<Loan, Long>{
	
	Loan findByLoanee(Usuario loanee);
	
}
