package minha_sorveteria;

import javax.swing.JOptionPane;
import java.util.Date;

public class Facade {

	private static Facade uniqueInstance;
	protected Sorveteria sorveteria = null;
	protected Sorvete sorvete = null;
	protected Fabrica fabrica = null;

	private Facade() {

	}

	public static Facade getInstance() {
		if (uniqueInstance == null) {

			synchronized (Facade.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new Facade();
				}
			}
		}
		return uniqueInstance;
	}

	public void fazer_pedido() {

		String opcao = "";
		int opcao_fabrica = 0;
		boolean fim = false;
		double preco = 0.0;

		JOptionPane.showMessageDialog(null, "FA�A SEU SELF-SERVICE ONLINE! \n           Plataforma BondFaro");
		JOptionPane.showMessageDialog(null, "##########\t      Sorveteria BondFaro      \t##########\n");

		while (fim != true) {

			opcao = JOptionPane.showInputDialog(
					"Fa�a seu pedido\n\n1 Sorvete Baunilha\n2 Sorvete Aveia\n3 Sorvete Ma��\n4 Sorvete Morango\n5 Sair\nOp��o: ");

			if (opcao.equals("1")) {
				do {

					opcao_fabrica = Integer.parseInt(JOptionPane.showInputDialog(
							"Escolha o estilo do ingrediente:\n1 Jo�o Pessoa\n2 Campina Grande\n3 Mamanguape: "));

					if (opcao_fabrica == 1) {
						fabrica = new FabricaJoaoPessoa();
						sorvete = new SorveteBaunilha(fabrica);
						sorveteria = new Sorveteria(fabrica);
						sorvete = sorveteria.pedirSorvete("baunilha", "Jo�o Pessoa");
						JOptionPane.showMessageDialog(null, sorvete);

					} else if (opcao_fabrica == 2) {
						fabrica = new FabricaCampinaGrande();
						sorvete = new SorveteBaunilha(fabrica);
						sorveteria = new Sorveteria(fabrica);
						sorvete = sorveteria.pedirSorvete("baunilha", "Campina Grande");
						JOptionPane.showMessageDialog(null, sorvete);

					} else if (opcao_fabrica == 3) {
						fabrica = new FabricaMamanguape();
						sorvete = new SorveteBaunilha(fabrica);
						sorveteria = new Sorveteria(fabrica);
						sorvete = sorveteria.pedirSorvete("baunilha", "Mamanguape");
						JOptionPane.showMessageDialog(null, sorvete);

					} else {
						JOptionPane.showMessageDialog(null, "Op��o inv�lida!");
					}

				} while (!(opcao_fabrica == 1 || opcao_fabrica == 2 || opcao_fabrica == 3));

				preco += sorvete.preco();

			} else if (opcao.equals("2")) {

				do {

					opcao_fabrica = Integer.parseInt(JOptionPane.showInputDialog(
							"Escolha o estilo do ingrediente:\n1 Jo�o Pessoa\n2 Campina Grande\n3 Mamanguape: "));
					if (opcao_fabrica == 1) {
						fabrica = new FabricaJoaoPessoa();
						sorvete = new SorveteAveia(fabrica);
						sorveteria = new Sorveteria(fabrica);
						sorvete = sorveteria.pedirSorvete("aveia", "Jo�o Pessoa");
						JOptionPane.showMessageDialog(null, sorvete);

					} else if (opcao_fabrica == 2) {
						fabrica = new FabricaCampinaGrande();
						sorvete = new SorveteAveia(fabrica);
						sorveteria = new Sorveteria(fabrica);
						sorvete = sorveteria.pedirSorvete("aveia", "Campina Grande");
						JOptionPane.showMessageDialog(null, sorvete);

					} else if (opcao_fabrica == 3) {
						fabrica = new FabricaMamanguape();
						sorvete = new SorveteAveia(fabrica);
						sorveteria = new Sorveteria(fabrica);
						sorvete = sorveteria.pedirSorvete("aveia", "Mamanguape");
						JOptionPane.showMessageDialog(null, sorvete);

					} else {
						JOptionPane.showMessageDialog(null, "Op��o inv�lida!");
					}

				} while (!(opcao_fabrica == 1 || opcao_fabrica == 2 || opcao_fabrica == 3));

				preco += sorvete.preco();

			} else if (opcao.equals("3")) {

				do {

					opcao_fabrica = Integer.parseInt(JOptionPane.showInputDialog(
							"Escolha o estilo do ingrediente:\n1 Jo�o Pessoa\n2 Campina Grande\n3 Mamanguape: "));

					if (opcao_fabrica == 1) {
						fabrica = new FabricaJoaoPessoa();
						sorvete = new SorveteMaca(fabrica);
						sorveteria = new Sorveteria(fabrica);
						sorvete = sorveteria.pedirSorvete("ma��", "Jo�o Pessoa");
						JOptionPane.showMessageDialog(null, sorvete);

					} else if (opcao_fabrica == 2) {
						fabrica = new FabricaCampinaGrande();
						sorvete = new SorveteMaca(fabrica);
						sorveteria = new Sorveteria(fabrica);
						sorvete = sorveteria.pedirSorvete("ma��", "Campina Grande");
						JOptionPane.showMessageDialog(null, sorvete);

					} else if (opcao_fabrica == 3) {
						fabrica = new FabricaMamanguape();
						sorvete = new SorveteMaca(fabrica);
						sorveteria = new Sorveteria(fabrica);
						sorvete = sorveteria.pedirSorvete("ma��", "Mamanguape");
						JOptionPane.showMessageDialog(null, sorvete);

					} else {
						JOptionPane.showMessageDialog(null, "Op��o inv�lida!");
					}

				} while (!(opcao_fabrica == 1 || opcao_fabrica == 2 || opcao_fabrica == 3));

				preco += sorvete.preco();

			} else if (opcao.equals("4")) {

				do {

					opcao_fabrica = Integer.parseInt(JOptionPane.showInputDialog(
							"Escolha o estilo do ingrediente:\n1 Jo�o Pessoa\n2 Campina Grande\n3 Mamanguape: "));

					if (opcao_fabrica == 1) {
						fabrica = new FabricaJoaoPessoa();
						sorvete = new SorveteMorango(fabrica);
						sorveteria = new Sorveteria(fabrica);
						sorvete = sorveteria.pedirSorvete("morango", "Jo�o Pessoa");
						JOptionPane.showMessageDialog(null, sorvete);

					} else if (opcao_fabrica == 2) {
						fabrica = new FabricaCampinaGrande();
						sorvete = new SorveteMorango(fabrica);
						sorveteria = new Sorveteria(fabrica);
						sorvete = sorveteria.pedirSorvete("morango", "Campina Grande");
						JOptionPane.showMessageDialog(null, sorvete);

					} else if (opcao_fabrica == 3) {
						fabrica = new FabricaMamanguape();
						sorvete = new SorveteMorango(fabrica);
						sorveteria = new Sorveteria(fabrica);
						sorvete = sorveteria.pedirSorvete("morango", "Mamanguape");
						JOptionPane.showMessageDialog(null, sorvete);

					} else {
						JOptionPane.showMessageDialog(null, "Op��o inv�lida!");
					}

				} while (!(opcao_fabrica == 1 || opcao_fabrica == 2 || opcao_fabrica == 3));

				preco += sorvete.preco();

			} else if (opcao.equals("5")) {
				JOptionPane.showMessageDialog(null, "Saindo do menu...");
				if (preco != 0) {
					JOptionPane.showMessageDialog(null, "Pre�o final: " + preco
							+ " reais, pagos s� com cart�o de cr�dito\nData: " + new Date().toString());

				} else {
					JOptionPane.showMessageDialog(null, "Voc� desistiu do sorvete! Ahh t�o bom ele... Que pena!");
				}
				fim = true;

			} else {
				JOptionPane.showMessageDialog(null, "Op��o inv�lida!");
			}
		}
	}
}
