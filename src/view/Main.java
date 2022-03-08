package view;

import java.util.Scanner;

import javax.swing.JOptionPane;

import controller.RedesController;

public class Main {

	public static void main(String[] args) {
		
		RedesController redesController = new RedesController();
		String sistemaOperacional = System.getProperty("os.name");
		JOptionPane.showMessageDialog(null, sistemaOperacional);
		int opc = 0;
		Scanner entrada = new Scanner(System.in);
		
		while (opc != 9) {
			Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opcao para iniciar: \n 1 - Método IP \n 2 - Método Ping  \n 9 - Encerrar"));
			opc = entrada.nextInt();
			switch (opc) {
			case 1:
				redesController.ip(sistemaOperacional);
				
			break;
			
			case 2:
				redesController.ping(sistemaOperacional);
			break;
			case 9:
				JOptionPane.showMessageDialog(null,"Finalizado!");
			break;
			default:
				JOptionPane.showMessageDialog(null,"Opcao invalida");
			break;
			}
			
		}
		
	}

}
