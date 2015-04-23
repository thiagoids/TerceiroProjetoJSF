package com.algaworks.cursojsf2;

import javax.faces.bean.ManagedBean;
import javax.faces.component.html.HtmlCommandButton;
import javax.faces.component.html.HtmlInputText;

@ManagedBean
public class TesteBean {
	private HtmlInputText campo;
	private HtmlCommandButton botao;
	private String asdf;

	public void testar() {
		campo.setDisabled(false);
		// botao.setStyle("background-color:red; color:white;");
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

	public String getAsdf() {
		return asdf;
	}

	public void setAsdf(String asdf) {
		this.asdf = asdf;
	}

}
