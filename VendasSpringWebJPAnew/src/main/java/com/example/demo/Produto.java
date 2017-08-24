package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Produtos")
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	private double preco;

	public Produto() {
	}

	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double valor) {
		preco = valor;
	}
}
