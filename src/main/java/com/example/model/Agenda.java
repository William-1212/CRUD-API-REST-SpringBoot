package com.example.model;
import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.Table;  
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity  
//defining class name as Table name  
@Table(name="agenda")
public class Agenda {
	@Id  
	@Column(name="id")
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;
	@Column  
	private String nome;
	@Column  
	private String cep;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}

}
