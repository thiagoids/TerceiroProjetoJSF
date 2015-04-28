package com.algaworks.cursojsf2;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class TesteMensagemBean {

    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void Cadastrar() {
        if ((this.email == null) || (this.email.length() < 10)) {
            this.adicionarMensagem("frmPrinc:mail", FacesMessage.SEVERITY_FATAL, "e-mail vazio", "preencha o e-mail");
        }
    }

    private void adicionarMensagem(String clienteId, Severity severity, String summary, String detail) {
        FacesContext context = FacesContext.getCurrentInstance();
        FacesMessage message = new FacesMessage(severity, summary, detail);

        context.addMessage(clienteId, message);
    }
}
