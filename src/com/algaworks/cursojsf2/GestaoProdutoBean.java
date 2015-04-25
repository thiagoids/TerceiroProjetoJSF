package com.algaworks.cursojsf2;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;

@ManagedBean
// @ApplicationScoped
// @ViewScoped
// @RequestScoped
// @NoneScoped
@SessionScoped
public class GestaoProdutoBean {
	private List<Produto> produtosSelecionados;
	private List<Produto> produtos;
	private Produto prod;
	private Produto prodSelecionadoExclusao;

	public List<Produto> getProdutosSelecionados() {
		return produtosSelecionados;
	}

	public Produto getProdSelecionadoExclusao() {
		return prodSelecionadoExclusao;
	}

	public void setProdSelecionadoExclusao(Produto prodSelecionadoExclusao) {
		this.prodSelecionadoExclusao = prodSelecionadoExclusao;
	}

	public GestaoProdutoBean() {
		produtos = new ArrayList<Produto>();
		prod = new Produto();
		produtosSelecionados = new ArrayList<Produto>();
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

	public String redirecionarAjuda() {
		if (this.produtos.isEmpty()) {
			return "AjudaGestaoProdutos?faces-redirect=true";
		} else {
			return "AjudaIndisponivel?faces-redirect=true";
		}
	}

	public void verificarInclusao(ActionEvent event) {
		if ("".equals(this.prod.getFabricante())) {
			prod.setFabricante("Sem fabricante");
		}

		if ("".equals(this.prod.getCategoria())) {
			prod.setFabricante("Sem categoria");
		}

		if ("".equals(this.prod.getNome())) {
			prod.setFabricante("Sem nome");
		}
	}

	public void excluir() {
		this.produtos.remove(prodSelecionadoExclusao);
	}

	public void pesquisaProduto(ValueChangeEvent event) {

		System.out.println("passou aqui");

		this.produtosSelecionados.clear();
		for (Produto item : produtos) {
			if (item.getNome().toUpperCase()
					.startsWith(event.getNewValue().toString().toUpperCase())) {
				this.produtosSelecionados.add(item);
			}
		}

	}
}
