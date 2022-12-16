package com.example.prestabook.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="book")

public class Book {

	//Atributos de la entidad Empleado
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String isbn;
	private String title;
	private int num_pages;
	private String genre;
	private String descripcion;
	private String img;
	
	@ManyToOne
	@JoinColumn(name="id_editorial")
	private Editorial id_editorial;
	
	@ManyToOne
	@JoinColumn(name="id_user")
	private Usuario id_user;
	
	@OneToMany
	@JoinColumn(name="id_book")
	private List<Wishes> wishes;
	
	@OneToMany
	@JoinColumn(name="id_book")
	private List<Wrote> wrote;
	
	@ManyToOne
	@JoinColumn(name="id_drawer")
	private Drawer id_drawer;
	
	@OneToMany
	@JoinColumn(name="id_book")
	private List<Loan> loan;
	
	//Constructores
	
	public Book() {

	}

	public Book(Long id, String isbn, String title, int num_pages, String genre,String img, String descripcion, Editorial id_editorial, Usuario id_user, List<Wishes> wishes, List<Wrote> wrote, 
			Drawer id_drawer, List<Loan> loan) {
		this.id = id;
		this.isbn = isbn;
		this.title = title;
		this.num_pages = num_pages;
		this.genre = genre;
		this.id_editorial = id_editorial;
		this.id_user = id_user;
		this.wishes = wishes;
		this.wrote = wrote;
		this.id_drawer = id_drawer;
		this.loan = loan;
		this.img = img;
		this.descripcion = descripcion;
	}


	//Setters y getters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNum_pages() {
		return num_pages;
	}

	public void setNum_pages(int num_pages) {
		this.num_pages = num_pages;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}
	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Editorial getId_editorial() {
		return id_editorial;
	}

	public void setId_editorial(Editorial id_editorial) {
		this.id_editorial = id_editorial;
	}

	public Usuario getId_user() {
		return id_user;
	}

	public void setId_user(Usuario id_user) {
		this.id_user = id_user;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "id_book")
	public List<Wishes> getWishes() {
		return wishes;
	}

	public void setWishes(List<Wishes> wishes) {
		this.wishes = wishes;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "id_book")
	public List<Wrote> getWrote() {
		return wrote;
	}

	public void setWrote(List<Wrote> wrote) {
		this.wrote = wrote;
	}

	public Drawer getId_drawer() {
		return id_drawer;
	}

	public void setId_drawer(Drawer id_drawer) {
		this.id_drawer = id_drawer;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "id_book")
	public List<Loan> getLoan() {
		return loan;
	}

	public void setLoan(List<Loan> loan) {
		this.loan = loan;
	}
	
	
	
}
