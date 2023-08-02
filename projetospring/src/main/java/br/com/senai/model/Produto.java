package br.com.senai.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Produto {
	
	@Id
	private Long id;
	private String nome;
	private String categoria;
	private int quantidade;
	private double preco;
	
}