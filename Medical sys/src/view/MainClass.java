package view;

import business.control.ControleUsuario;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ControleUsuario.start("Jos�", "12345");
		System.out.println(ControleUsuario.nomeUsuario());
		
	}

}
