package com.algaworks.cursojsf2;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class TestarMensagemBean {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void cadastrar() {
        if (this.nome.length() < 10) {
            this.adicionaMensagem("nome não definido", "nome");
        }
    }

    public void adicionaMensagem(String sum, String comp) {
        FacesContext context = FacesContext.getCurrentInstance();
        FacesMessage msg = new FacesMessage(sum);

        context.addMessage(comp, msg);
    }
}
