
import java.util.Scanner;
public class Exercicio27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o primeiro numero");
		int num1 = entrada.nextInt();
		System.out.println("Digite o segundo numero");
		int num2 = entrada.nextInt();
		System.out.println("Escolha a opera��o! 1-adi��o,2-subtra��o,3-multiplica��o,4-divis�o)");
		int opera��o = entrada.nextInt();
		int resultado = 0;
				
		if (opera��o==1) 
			  resultado = num1 +num2;
			
		else if(opera��o==2) 
			  resultado = num1 - num2;
		
		else if(opera��o==3)
			resultado = num1*num2;
		
		else
			resultado = num1/num2;
		
		System.out.println(resultado);
	
		if ((resultado%2)==0)
			System.out.println("Par");
		else 
			System.out.println("Impar");
		
		if (resultado>0)
			System.out.println("Positivo");
		else 
			System.out.println("Negativo");
		
		entrada.close();	
		
		entrada.close();
}
}