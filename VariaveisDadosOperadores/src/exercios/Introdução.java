package exercios;

public class Introdu??o {
	public static void main(String[] args) {
		
		int i; //Vari?vel aceita
		//int i; //N?o pode ter vari?veis com o mesmo nome
		int I; //Java ? case sensitive ent?o i ? diferente de I
		//int 1a; //Vari?vel n?o pode come?ar com n?mero
		int _1a; //? permitido iniciar vari?vel com _ ou $, mas n?o ? indicado
		int $aq;
		
		//Definindo valor inicial para as vari?veis
		i = 5;
		I = 10;
		_1a = 20;
		$aq = 7;
		
		final int j = 10; 
		//j = 15; // "final" ? uma vari?vel constante que n?o pode ter o valor alterado.
		int asrn2428nd; //O compilador aceita, mas deve ser evitado usar numeros e letras misturados.
		//int asrn 2428nd; // O compilador n?o aceita espa?o na vari?vel.
		int asrn2428_nd = 10; //Tamb?m n?o ? indicado usar _ ou $ no meio de uma vari?vel, exceto com constantes, mas o compilador aceita.
		//int asrn%2428_nd = 10; //Com exce??o de _ e $, caracteres especiais n?o s?o aceitos.
		
		asrn2428nd = 100; //Voc? pode atribuir um valor ? vari?vel quando a declara ou em outras partes do programa.
		
		int quantidadeProduto = 50; //Essa segue as boas pr?ticas, usa nota??o camelo, e o nome ? expressivo.
		
		/*Nota??o camelo: quando uma v?riavel tem mais de uma palavra, as primeira palavra ? escrita em minisculo
		 * e as outras palavras devem come?ar em maisculo.
		 */
		//int QuantidadeProduto; //? aceita pelo compilador mais n?o segue a nota??o mais indicada.
		final int NUMERO_TENTATIVAS = 5; //Para constantes, o ideal ? escrever tudo em maisculo e separado por _.
		//final int numeroTentativas = 5; //N?o se usa nota??o camelo para constantes, mas o compilador aceita.
		int QUANTIDADE_OPCOES = 25; //N?o ? uma constante, por tanto o mais indicado ? usar nota??o camelo, mas n?o da erro.
		//int qtdProd; //? pouca expressiva, n?o ? indicada mas n?o da erro.
		
		//Mostrar as vari?veis na tela 
		System.out.println(i);
		System.out.println(I);
		System.out.println(_1a);
		System.out.println($aq);
		
		System.out.println(j);
		System.out.println(asrn2428nd);
		System.out.println(asrn2428_nd );
		
		System.out.println(quantidadeProduto);
		System.out.println(NUMERO_TENTATIVAS);
		System.out.println(QUANTIDADE_OPCOES);

		
	}

}
