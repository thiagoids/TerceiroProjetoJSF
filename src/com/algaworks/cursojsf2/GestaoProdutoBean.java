package com.algaworks.cursojsf2;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
// @ApplicationScoped
// @ViewScoped
// @RequestScoped
// @NoneScoped
@SessionScoped
public class GestaoProdutoBean {
	private List<Produto> produtos;

	private Produto prod;

	public GestaoProdutoBean() {
		produtos = new ArrayList<Produto>();
		prod = new Produto();
	}

	public void incluir() {
		this.produtos.add(prod);
		prod = new Produto();
	}

	public Produto getProd() {
		return prod;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	@PostConstruct
	public void inicializarBean() {
		System.out.println("Inicializando Bean");
	}

	@PreDestroy
	public void finalizarBean() {
		System.out.println("Finalizando Bean");
	}

}
