package com.cip.prog;

public class practica4 {
	//Método que devuelve un número aleatorio entre dos numeros
	public static int generaNumeroAleatorio(){
        
	       int num=(int)(Math.random()*6)+1;
	       return num;
	   }
	
	public static void main(String[] args) {
		
		System.out.println("El jugador 1 hace su tirada");
		int dado1_j1=generaNumeroAleatorio();
		System.out.println("Dado 1:"+ dado1_j1);
		
		int dado2_j1=generaNumeroAleatorio();
		System.out.println("Dado 2:"+ dado2_j1);
		
		System.out.println("El jugador 2 hace su tirada");
		int dado1_j2=generaNumeroAleatorio();
		System.out.println("Dado 1:"+ dado1_j2);
		
		int dado2_j2=generaNumeroAleatorio();
		System.out.println("Dado 2:"+ dado2_j2);
		
		int resultado_j1=dado1_j1+dado2_j1;
		int resultado_j2=dado1_j2+dado2_j2;
		
		//Otro uso
		//double mayor=Math.max(resultado_j1, resultado_j2);
		
		if(resultado_j1>resultado_j2) {
			System.out.println("La tirada más alta es "+resultado_j1 +".\nEl ganador es el jugador 1.");
		}else if(resultado_j1==resultado_j2){
			System.out.println("¡Empate!");
		}else {
			System.out.println("La tirada más alta es "+resultado_j2+".\nEl ganador es el jugador 2.");
		}
		int media=(dado1_j1+dado2_j1+dado1_j2+dado2_j2)/4;
		System.out.println("La media de los 4 dados es "+media);
		
		

	}

}
