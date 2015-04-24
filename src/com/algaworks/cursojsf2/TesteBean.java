package com.algaworks.cursojsf2;

import javax.faces.bean.ManagedBean;
import javax.faces.component.html.HtmlCommandButton;
import javax.faces.component.html.HtmlInputText;

@ManagedBean
public class TesteBean {
	private HtmlInputText campo;
	private HtmlCommandButton botao;

	public TesteBean() {
		campo = new HtmlInputText();
		botao = new HtmlCommandButton();
	}

	public void testar() {
		campo.setDisabled(false);
		campo.setTitle("teste 1111");
		botao.setStyle("background-color:red; color:white;");
		// campo.setAlt("thiago");
	}

	public HtmlInputText getCampo() {
		return campo;
	}

	public void setCampo(HtmlInputText campo) {
		this.campo = campo;
	}

	public HtmlCommandButton getBotao() {
		return botao;
	}

	public void setBotao(HtmlCommandButton botao) {
		this.botao = botao;
	}
}
