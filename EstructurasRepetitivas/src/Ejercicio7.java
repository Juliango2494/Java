import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String Arg[]) {
		int flag=1;
		Scanner input= new Scanner(System.in);
		while (flag!=0) {
			System.out.println("Calcular promedio de 3 notas");
			System.out.println("Ingresa nota1: ");
			int not1=input.nextInt();
			System.out.println("Ingresa nota2: ");
			int not2=input.nextInt();
			System.out.println("Ingresa nota3: ");
			int not3=input.nextInt();
			double prom=(not1+not2+not3)/3;
			System.out.println("Su promedio es: "+prom);
			System.out.println("\nDESEA CONTINUAR?\n1-continuar\n0-Salir");
			int menu=input.nextInt();
			if (menu==0) {
				flag=0;
			}
			
		}
		System.out.println("\nSALIENDO...");
		input.close();
	};
}
