import java.util.Scanner;

public class ExcecaoPersonalizada{

	public static void main(String[] args){
			
			Scanner leitor = new Scanner(System.in);
	
			int numero = 0;
			
			System.out.println("Digite um numero: ");
			numero = leitor.nextInt();
			
			try{
				if(numero == 0){
					throw new NumeroIgualZero();
				} else if (numero % 2 == 0){
					throw new NumeroPar();
				} else {
					throw new NumeroImpar();
				}
			}catch(NumeroIgualZero e){
				e.getMessage();
			}catch(NumeroPar e){
				e.getMessage();
			} catch(NumeroImpar e){
				e.getMessage();
			}
			
		}
	
}

