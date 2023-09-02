
import java.util.scanner;

public class Main
{
	public static void main(String[] args) {
		int numero;
		
		scanner leer = new Scanner(System.in);
		
		System.out.System.out.println("Ingrese un numero");
		numero = leer.nextInt();
		
		if(numero > 0 && numero%2 !=0) {
		    System.out.println("true");   
		}

	    
	}
}
