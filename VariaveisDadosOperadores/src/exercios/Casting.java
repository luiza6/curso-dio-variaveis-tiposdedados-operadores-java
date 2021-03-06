package exercios;

import javax.swing.plaf.synth.SynthStyleFactory;

public class Casting {

	public static void main(String[] args) {
		
		//Converte um short em um byte (downcast), ocorre a perca de dados
		byte b1;
		short s1 = 100;
		b1 = (byte) s1; //Downcast tem que ser explicito, tem que informar para qual tipo de variavel est? convertendo
		
		//Colocamos um inteiro dentro de um longo (upcast)
		long l1;
		int i1 = 10;
		l1 = i1; //upcast n?o precisa se preocupar em informar o tipo de variavel, j? que ser? para uma maior e n?o ter? percas.
		
		//Convertemos um long em um inteiro (downcast), ter? perca de dados 
		int i2;
		long l2 = 1000000000000000000L;
		i2 = (int) l2;
		
		//Convertemos um long em um inteiro (downcast), mas n?o ter? perca de dados, pois esse valor cabe no inteiro 
		int i3;
		long l3 = 10000L;
		i3 = (int) l3;
		
		//Colocamos um float dentro de um double (upcast)
		double d1;
		float f1 = 10.5F;
		d1 = f1;
		
		//Convertemos um double em um float (downcast), mas n?o ter? perca de dados, pois esse valor cabe no float
		float f2;
		float f3;
		double d2 = 10000.58D;
		
		//Convertemos um double em um float (downcast), ter? perca de dados
		f2 = (float) d2;
		double d3 = 10000.588888888888888888888888888888888888888888888888888888888888888888888888D;
		f3 = (float) d3;
		
		//Convertemos um float em um inteiro (downcast), ter? perca de dados
		int i4;
		float f4 = 11.5697F;
		i4 = (int) f4;
		
		System.out.println("b1: " + b1);
		System.out.println("l1: " + l1);
		System.out.println("i2: " + i2);
		System.out.println("i3: " + i3);
		System.out.println("d1: " + d1);
		System.out.println("f2: " + f2);
		System.out.println("f3: " + f3);
		System.out.println("i4: " + i4);
		
		//Um downcast extremo, vemos que ocorreu a convers?o mas teve perca de dados
		b1 = (byte) d3;
		System.out.println("b1: " + b1);
		
	}

}
