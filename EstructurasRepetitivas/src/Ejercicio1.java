import javax.swing.JOptionPane;

public class Ejercicio1 {
	public static void main(String Arg[]) {
		int x=0;
		do {
			JOptionPane.showMessageDialog(null, "Valor de x: "+x);
			//System.out.println("Valor de x: "+x);
			x++;			
		} while (x<=10);
		int y=0;
		while (y<=10) {
			JOptionPane.showMessageDialog(null, "Valor de y: "+y);
			//System.out.println("Valor de y: "+y);
			y++;
		}
		for (int i = 0; i <= 10; i++) {
			JOptionPane.showMessageDialog(null, "Valor de i: "+i);
		}
	};

}
