package com.algaworks.cursojsf2;

import javax.faces.bean.ManagedBean;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;

@ManagedBean
public class RegistroCliqueListener implements ActionListener {

	@Override
	public void processAction(ActionEvent event)
			throws AbortProcessingException {
		System.out.println(event.getComponent().getId());
	}

}
