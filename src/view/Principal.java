package view;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		ListaCurso lista = new ListaCurso();
		int op = 0;
		int posicao=0;
		
		while(op!=9) {	
			op= Integer.parseInt(JOptionPane.showInputDialog("Digite 1: adiciona no início" + "\nDigite 2: adiciona no final"
												+ "\nDigite 3: adiciona qualquer posição" + "\nDigite 4: remove do início"
												+ "\nDigite 5: remove do final"+"\nDigite 6: removo qualquer posição"
												+ "\nDigite 7: para mostrar a lista"+ "\nDigite 9: para sair"));
			switch (op) {
			case 1:
				lista.addInicio(lista.cadastra());
				break;
			case 2:
				lista.addFinal(lista.cadastra());
				break;
			case 3:
				posicao=Integer.parseInt(JOptionPane.showInputDialog("Digite a posição"));
				lista.addQualquer(lista.cadastra(),posicao);
				break;
			case 4:
				JOptionPane.showMessageDialog(null,"Removido -> " + lista.removeInicio());
				break;
			case 5:
				JOptionPane.showMessageDialog(null,"Removido -> " + lista.removeFinal());
				break;
			case 6:
				posicao=Integer.parseInt(JOptionPane.showInputDialog("Digite a posição"));
				JOptionPane.showMessageDialog(null,"Removido -> " + lista.removeQualquer(posicao));
				break;
			case 7:
				JOptionPane.showMessageDialog(null,lista.percorre());
				break;

			case 9:
				JOptionPane.showMessageDialog(null, "Saindo");
				break;
				
			default:
				break;
				
			}
		}	
		
	}
}

