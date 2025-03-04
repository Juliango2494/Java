import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String Arg[]) {
		int flag=1;
		Scanner input= new Scanner(System.in);
		while (flag==1) {
			System.out.println("Ingresa un numero");
			int numero=input.nextInt();
			if (numero==0) {
				flag=0;
			}else {
				System.out.println("Tu numero: "+numero+"\n");
			}
		}
		System.out.println("Saliendo");
	};
}
