package exercios;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		System.out.println("PrePos");
		prePos();
		System.out.println("Aritimético");
		aritmetico();
		System.out.println("Atribuição");
		atribuicao();
		System.out.println("Precedência");
		precedencia();

	}
	
	private static void prePos() {
		
		int k = 10;
		
		int i = ++k; //Préfixado, ele pega a variavel e a encrementa ou decrementa para depois atribuir
		int l = --k;
		int j = k++; //Pósfixado primeiro ele atribui, depois ele encrementa ou decrementa a variavel
		int m = k--;
		int x = k;
		
		System.out.println("i: " + i);
		System.out.println("l: " + l);
		System.out.println("j: " + j);
		System.out.println("m: " + m);
		System.out.println("x: " + x);

	}
	
	
	private static void aritmetico() {
		
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		int e = 50;
		
		int r1 = a+b; //Soma
		int r2 = c-a; //Subtração
		int r3 = d*b; //Multiplicação
		int r4 = e/a; //Divisão
		int r5 = c%b; //Resto da divisão
		
		System.out.println("a+b = " + r1);
		System.out.println("c-a = " + r2);
		System.out.println("d*b = " + r3);
		System.out.println("e/a = " + r4);
		System.out.println("c%b = " + r5);	
		
	}
	
	private static void atribuicao() {
		
		//Atribuição simples
		int i = 1500;
		short j = 15;
		long l = 500L;
		int k = 35;
		float f = 3.5F;
		double d = f;
		
		System.out.println("d: " + d);
		
		//Atribuição composta
		i += 5; //i = i+5
		j -= 3; //j = j-3
		d /= 2.7D; //d = d/2.7D
		l *= 3; //l = l*3
		k %=2; //k = k%2
		
		System.err.println("i: " + i);
		System.err.println("j: " + j);
		System.err.println("d: " + d);
		System.err.println("l: " + l);
		System.err.println("k: " + k);
		
		i = k = j; //Atribuição composta por atribuições simples
		
		System.out.println("k: " + k);
		System.out.println("i: " + i);
		
	}
	
	private static void precedencia() {
		
		int i = 10;
		int j = 20;
		int k = 30;
		
		int a = i++ + --j * k; //10 + 19 * 30 -> 10+570 -> 580
		System.out.println("i++ + --j * k = " + a);
		System.out.println("i = " + i);
		
		int b = k / --i % 3 + 1; // 30 / 10 %3 +1 -> 1
		System.out.println("k / --i % 3 + 1= " + b);
		System.out.println("i = " + i);
		
		//Em atribuição composta, a atribuição com soma prevalece sob a multiplicação
		int c = 2;
		c *= i += 5; //c= 2*i; i = i+5 -> c = 2*i; i =10+5 -> c = 2*15 -> c = 30
		System.out.println("c *= i += 5: " + c);
		
	}

}
