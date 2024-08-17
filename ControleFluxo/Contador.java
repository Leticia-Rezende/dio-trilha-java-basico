package ControleFluxo;
import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {

		Scanner Scanner = new Scanner(System.in);

		System.out.println("\nDigite o primeiro numero: ");
		int parametroUm = Scanner.nextInt();

		System.out.println("\nDigite o segundo numero: ");
		int parametroDois = Scanner.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch ( ParametrosInvalidosException exception) {
            System.out.println ("\nO segundo numero deve ser maior que o primeiro");
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if(parametroUm >= parametroDois)
        
        throw new ParametrosInvalidosException ("O segundo numero deve ser maior que o primeiro");

		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		
		int contagem = parametroDois - parametroUm;

            for(int indice = 0; indice < contagem; indice++){
                System.out.println("Imprimindo nº " + (indice+1));
            }
		//realizar o for para imprimir os números com base na variável contagem
	}
}
