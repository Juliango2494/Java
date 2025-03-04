import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String Arg[]) {
		Scanner input= new Scanner(System.in);
		System.out.println("Ingresa numero 'n' a imprimir");
		int n=input.nextInt();
		input.close();
		int x=0,y=0;
		while (x<=n) {
			System.out.println("Numero x:"+x);
			x++;
		}
		do {
			System.out.println("Numero y:"+y);
			y++;
		} while (y<=n);
		for (int i = 0; i <= n; i++) {
			System.out.println("Numero i:"+i);
			
		}
		
	};
	

}
