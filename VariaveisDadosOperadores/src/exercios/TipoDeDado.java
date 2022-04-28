package exercios;

public class TipoDeDado {

	public static void main(String[] args) {
		
		//Numeros inteiros de -128 até 127
		byte b1 = 10;
		byte b2 = 20;
		
		//Numeros inteiros de -32768 até 32767
		short s1 = 20000;
		//short s2 = 40000; //Passou de 32767.
		
		//Numeros inteiros de -2147483648 até 2147483647
		//int i1 = -10000000000; //Passou de -2147483648
		int i2 = 28500;
		
		/*Numeros inteiros de -9223372036854775808 até 9223372036854775807. Se não colocar um l ou L 
		 * no final do numero declarado, o compilador entende que ele é um inteiro e da erro.
		 */
		long l1 = 1000000000000000000L;
		long l2 = 2004005000500055000L;
		
		/*Numeros racionais de + ou - 3.40282347E+38F. Se não colocar um f ou F no final o compilador entende 
		 * que ele é um double e da erro.
		 */
		//float f1 = 4.5;
		float f2 = 10.68F;
		
		//Numeros racionais de + ou - 1.79769313486231570E+308. No double e opcional colocar o d ou D.
		double d1 = 85.69;
		double d2 = 99.04D;
		
		// Caracteres de 16-bit unicode, e usa aspas simples.
		char c1 = 'A';
		//char c2 = 'Tx'; //Para mais de uma letra usar String.
		char c3 = '\u0057'; //Esse é um Unicode Character, um código que representa uma letra
		
		//Não é um dado primitivo é um objeto que a linguagem Java disponibiliza para trabalhar com textos. Usa aspas duplas.
		String st1 = "Variaveis";
		String st2 = "Dados";
		String st3 = "Vamos ver se aceita VAMOS &*&$''$ 758495236";
		
		/*Existe um tipo de dado mais especifico para se armazenar uma data, mas ele não será mostrado nessa aula 
		 * por ser composto
		 */
		//String dt1 = "27/04/2022"; //Não é indicado trabalhar datas com String, pois não da para fazer operações.
		
		//Tipo de dado lógico. Não te como executar operações.
		boolean bo1 = true;
		boolean bo2 = false;
		
		//Mostra os dados na tela.
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(s1);
		System.out.println(i2);
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(f2);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(c1);
		System.out.println(c3);
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		System.out.println(bo1);
		System.out.println(bo2);			

	}

}
