package com.login.controller;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	
	public String verificarIngreso(Usuario user) {
		String nombre = user.getNombre();
		String contrasenia = user.getContrasenia();
		if(!Usuarios.getUsuarios().containsKey(nombre)){
			return "registro";
		} else {if(Usuarios.getUsuarios().get(nombre).equals(contrasenia)) {
			return "ingreso";}
		}
		return "error";
	}
		
	
	public String crearUsuario(Usuario user) {
		Usuarios.getUsuarios().put(user.getNombre(), user.getContrasenia());
		return "login";
	}
	
	
}
