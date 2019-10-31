package com.login.controller;
import java.util.HashMap;

public class Usuarios {
	
	private static HashMap<String, String> usuarios;
	static {
		usuarios = new HashMap<String,String>();
		usuarios.put("octavio", "123");
		usuarios.put("chile","ciudadela");
	}
	
	public static HashMap<String, String> getUsuarios() {
		return usuarios;
	}

	public static void setUsuarios(HashMap<String, String> usuarios) {
		Usuarios.usuarios = usuarios;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
