import java.util.Scanner;
public class VetoresCeBA {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		//Declaração do vetor a
		int a[]= {4,6,7,1,0};
		//Declaração do vetor b
		int b[]= {7,1,3,1,2};
		//Declarando variável x
		int x;
		//Declarando variável c e inicializando ela
		int c=0;
		//For para repetir 5 vezes os comandos que separam numeros maiores que 4 no vetor a 
		for ( x=0 ;x<5; x++){ 
		//if que separa numeros maiores que 4 no vetor a
		if(a[x]>4)
	    //exibindo os numeros que sao maiores que 4
		System.out.printf("Os numeros do vetor a maiores que 4 sao: %d\n", a[x]);}
		//For para repetir 5 vezes os comandos que separam numeros maiores que 4 no vetor b
		for ( x=0 ;x<5; x++) {
		//if que separa numeros maiores que 4 no vetor a
		if ( b[x]>4)
		//exibindo numeros maiores que 4
		System.out.printf("Os numeros do vetor b maiores que 4 sao: %d\n\n", b[x]);}
		//For para repetir 5 vezes os comandos que separam numeros menores ou iguais a 5 no vetor a e b
		for (x=0;x<5;x++) { 
		//if que separa numeros menor ou igual a 5 no vetor a
		if (a[x]<=5)
		//exibindo numeros menores ou iguais a 5
		System.out.printf("Os numeros do vetor a menores ou iguais a 5 sao: %d\n", a[x]);
		//if que separa numeros menor ou igual a 5 no vetor b
		if (b[x]<=5)
		//exibindo numeros menores ou iguais a 5
		System.out.printf("Os numeros do vetor b menores ou iguais a 5 sao: %d\n", b[x]);
		//dando valor a c, com uma formula com os vetores a e b
		c=a[x]*b[x];}
		//exibindo valor de c
		System.out.printf("O valor de c e: %d", c);
		
		
		
		
		
		
			}
}
