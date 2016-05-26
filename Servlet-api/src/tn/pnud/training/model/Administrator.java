package tn.pnud.training.model;

import java.io.Serializable;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class Administrator implements Serializable, HttpSessionBindingListener {
	
	private String cin;
	private String firstname;
	private String lastname;

	public Administrator() {
		this.cin = " 123456789";
	}

	public Administrator(String cin, String firstname, String lastname) {
		super();
		this.cin = cin;
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cin == null) ? 0 : cin.hashCode());
		result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Administrator other = (Administrator) obj;
		if (cin == null) {
			if (other.cin != null)
				return false;
		} else if (!cin.equals(other.cin))
			return false;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		return true;
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void valueBound(HttpSessionBindingEvent event) {
		Administrator administrator = (Administrator)event.getValue();
		if(administrator.getFirstname().equals("Adel"))
		System.out.println("Un administrateur a été ajouté à cette session http");
		System.out.println("L'administrateur s'appelle : "+ administrator.getFirstname() + " " +administrator.getLastname());
		
	}

	@Override
	public void valueUnbound(HttpSessionBindingEvent event) {
		Administrator administrator = (Administrator)event.getValue();
		System.out.println("Un administrateur a été supprimé à cette session http");
		//System.out.println("L'administrateur s'appelle : "+ administrator.getFirstname() + " " +administrator.getLastname());
		
	}

}
