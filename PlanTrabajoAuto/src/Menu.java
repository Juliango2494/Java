
import javax.swing.JOptionPane;

public class Menu {
	public static void main(String Arg[]) {
		int codMenuPpal=0;
		int cantTipFrij=0,cantTipSop=0,cantCarChulCer=0,cantCarChulPol=0,cantCarRes=0,cantCarCer=0,cantIntIta=0,cantIntNew=0;
		double precioFrijol=12000;
		double precioSopVerd=8000;
		double precioChuletaCer=26000;
		double precioChuletaPol=22000;
		double precioRes=34000;
		double precioCer=31000;
		double precioItalic=44000;
		double precioNewAmerica=41000;
		String nombre=JOptionPane.showInputDialog("Ingrese Su nombre");
		
		do {
			String menu="MENU RESTAURANTE\n\n";
			menu+="1. Plato Tipico\n";
			menu+="2. Plato a la Carta\n";
			menu+="3. Plato Internacional\n";
			menu+="4. Salir\n";
			menu+="Por favor seleccione una opcion\n";
			codMenuPpal=Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			switch (codMenuPpal) {
			case 1:
				int codMenuTipico=0;
				do {
					String menu1="MENU TIPICO\n\n";
					menu1+="1. Frijoles\n";
					menu1+="2. Sopa de Verduras\n";
					menu1+="3. Regresar\n";
					menu1+="Por favor seleccione una opcion\n";
					codMenuTipico=Integer.parseInt(JOptionPane.showInputDialog(menu1));
					
					switch (codMenuTipico) {
					case 1:
						JOptionPane.showMessageDialog(null, "Se ha solicitado un plato de Frijoles, el costo es de $"+precioFrijol);
						cantTipFrij+=1;
						break;
					case 2:
						JOptionPane.showMessageDialog(null, "Se ha solicitado un plato de Sopa de Verduras, el costo es de $"+precioSopVerd);
						cantTipSop+=1;
						break;
					case 3:
						JOptionPane.showMessageDialog(null, "SALIENDO MENU TIPICO");
						break;
					default:
						JOptionPane.showMessageDialog(null, "No corresponde a "+"un codigo valido","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
						break;
					}
					
				} while (codMenuTipico!=3);
				break;
			case 2:
				int codMenuCarta=0;
				do {
					String menu2="MENU A LA CARTA\n\n";
					menu2+="1. Chuleta de cerdo\n";
					menu2+="2. Chuleta de pollo\n";
					menu2+="3. Res a la plancha\n";
					menu2+="4. Cerdo a la plancha\n";
					menu2+="5. Regresar\n";
					menu2+="Por favor seleccione una opcion\n";
					codMenuCarta=Integer.parseInt(JOptionPane.showInputDialog(menu2));
					
					switch (codMenuCarta) {
					case 1:
						JOptionPane.showMessageDialog(null, "Se ha solicitado un plato de Chuleta de cerdo, el costo es de $"+precioChuletaCer);
						cantCarChulCer+=1;
						break;
					case 2:
						JOptionPane.showMessageDialog(null, "Se ha solicitado un plato de Chuleta de pollo, el costo es de $"+precioChuletaPol);
						cantCarChulPol+=1;
						break;
					case 3:
						JOptionPane.showMessageDialog(null, "Se ha solicitado un plato de Res a la plancha, el costo es de $"+precioRes);
						cantCarRes+=1;
						break;
					case 4:
						JOptionPane.showMessageDialog(null, "Se ha solicitado un plato de Cerdo a la plancha, el costo es de $"+precioCer);
						cantCarCer+=1;
						break;
					case 5:
						JOptionPane.showMessageDialog(null, "SALIENDO MENU CARTA");
						break;
					default:
						JOptionPane.showMessageDialog(null, "No corresponde a "+"un codigo valido","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
						break;
					}
					
				} while (codMenuCarta!=5);
				
				break;
			case 3:
				int codMenuInter=0;
				do {
					String menu3="MENU INTERNACIONAL\n\n";
					menu3+="1. Italic\n";
					menu3+="2. New America\n";
					menu3+="3. Regresar\n";
					menu3+="Por favor seleccione una opcion\n";
					codMenuInter=Integer.parseInt(JOptionPane.showInputDialog(menu3));
					
					switch (codMenuInter) {
					case 1:
						JOptionPane.showMessageDialog(null, "Se ha solicitado un plato Italic, el costo es de $"+precioItalic);
						cantIntIta+=1;
						break;
					case 2:
						JOptionPane.showMessageDialog(null, "Se ha solicitado un plato New America, el costo es de $"+precioNewAmerica);
						cantIntNew+=1;
						break;
					case 3:
						JOptionPane.showMessageDialog(null, "SALIENDO MENU INTERNACIONAL");
						break;
					default:
						JOptionPane.showMessageDialog(null, "No corresponde a "+"un codigo valido","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
						break;
					}
					
				} while (codMenuInter!=3);
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "SALIENDO MENU PRINCIPAL");
				String mensajeFact="RESUMEN DEL PEDIDO PARA:\n\n"+nombre+"\n";
				double total=cantTipFrij*precioFrijol+cantTipSop*precioSopVerd+cantCarChulCer*precioChuletaCer+cantCarChulPol*precioChuletaPol+cantCarRes*precioRes+cantCarCer*precioCer+cantIntIta*precioItalic+cantIntNew*precioNewAmerica;
				if (cantTipFrij>0) {
					mensajeFact+= "\n-"+cantTipFrij+" Plato Tipico Frijoles UND$"+precioFrijol+" ST $"+cantTipFrij*precioFrijol;					
				}
				if (cantTipSop>0) {
					mensajeFact+="\n-"+cantTipSop+" Plato Tipico Sopa de Verduras UND$"+precioSopVerd+" ST $"+cantTipSop*precioSopVerd;
				}
				if (cantCarChulCer>0) {
					mensajeFact+="\n-"+cantCarChulCer+" Plato Carta Chuleta de Cerdo UND$"+precioChuletaCer+" ST $"+cantCarChulCer*precioChuletaCer;
				}
				if (cantCarChulPol>0) {
					mensajeFact+="\n-"+cantCarChulPol+" Plato Carta Chuleta de Pollo UND$"+precioChuletaPol+" ST $"+cantCarChulPol*precioChuletaPol;
				}
				if (cantCarRes>0) {
					mensajeFact+="\n-"+cantCarRes+" Plato Carta Res a la plancha UND$"+precioRes+" ST $"+cantCarRes*precioRes;
				}
				if (cantCarCer>0) {
					mensajeFact+="\n-"+cantCarCer+" Plato Carta Cerdo a la plancha UND$"+precioCer+" ST $"+cantCarCer*precioCer;
				}
				if (cantIntIta>0) {
					mensajeFact+="\n-"+cantIntIta+" Plato Internacional Italic UND$"+precioItalic+" ST $"+cantIntIta*precioItalic;
				}
				if (cantIntNew>0) {
					mensajeFact+="\n-"+cantIntNew+" Plato Internacional NewAmerica $"+precioNewAmerica+" ST $"+cantIntNew*precioNewAmerica;
				}
				mensajeFact+="\n\nTOTAL A PAGAR:\n$"+total;
				JOptionPane.showMessageDialog(null, mensajeFact);
				break;
				
			default:
				JOptionPane.showMessageDialog(null, "No corresponde a un "+"codigo valido","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
				break;
			}
			
		} while (codMenuPpal!=4);
	};

}