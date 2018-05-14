package es.fpdual.eadmin.eadmin.vistas;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class HelloWorld {

	private String firstName = "usuario";
	private String lastName = "usuario";

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String showGreeting() {
		if (firstName.equals("usuario") && lastName.equals("usuario")) {
			return "Logado correctamente " + firstName + "!";
		} else {
			return "Credenciales no validas...";
		}
	}
	public String navega() {
		if (firstName.equals("usuario") && lastName.equals("usuario")) {
			return "menu.xhtml";
		} else {
			return "helloworld.xhtml";
		}
	}
	
}
