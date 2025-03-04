import java.util.Scanner;

public class Nomina1 {
	public static void main(String Arg[]) {
		Scanner input=new Scanner(System.in);
		System.out.println("Ingresa tu salario");
		double salario = input.nextDouble();
		System.out.println("Ingresa tu estrato");
		double estrato = input.nextDouble();
		input.close();
		double desc=0;
		if (estrato>0&&estrato<=2) {
			desc=salario*0.02;
			System.out.println("Descuento de: $"+desc);
		}else if (estrato>=3&&estrato<=4) {
			desc=salario*0.04;
			System.out.println("Descuento de: $"+desc);
		}else if (estrato==5) {
			desc=salario*0.08;
			System.out.println("Descuento de: $"+desc);
		}else if (estrato==6) {
			desc=salario*0.1;
			System.out.println("Descuento de: $"+desc);
		}
	};

}
