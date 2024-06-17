package cursojava.thread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
//Swing é um framework para clirar as aplicações em Desktop
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTimeThread2 extends JDialog {

	private JPanel jPanel = new JPanel(new GridBagLayout());/* Painel de componentes */

	// Criação dos campos
	private JLabel descricaoNome = new JLabel("Nome");// Descrição do campo
	private JTextField mostraNome = new JTextField();// campo mostra tempo

	private JLabel descricaoEmail = new JLabel("E-mail");
	private JTextField mostraEmail = new JTextField();

	// Criação dos botões
	private JButton jButton = new JButton("Gerar...");// Decrição do botão
	private JButton jButton2 = new JButton("Stop");

	// Instanciado
	private ImplementacaoFilaThread fila = new ImplementacaoFilaThread();

	public TelaTimeThread2() {/* Constructor executa o que tiver dentro no momento da abertura ou execução */
		// início, configurações inicias da tela
		setTitle("Minha tela de time com Thread");
		setSize(new Dimension(250, 250));// Tamanho tela - Largura por Altura
		setLocationRelativeTo(null);// Centralizar tela
		setResizable(false);// Travar alteração na tela após executada
		/* Primeira parte concluida */

		// GridBagConstraints e um Controlador de posicionamento de componentes na tela
		GridBagConstraints griBagConstraints = new GridBagConstraints();
		griBagConstraints.gridx = 0;// eixo X
		griBagConstraints.gridy = 0;// eixo Y
		griBagConstraints.gridwidth = 2;// largura
		griBagConstraints.insets = new Insets(5, 10, 5, 5);
		griBagConstraints.anchor = GridBagConstraints.WEST;// posicionamento

		// Criação dos campos
		descricaoNome.setPreferredSize(new Dimension(200, 25));
		jPanel.add(descricaoNome, griBagConstraints);

		mostraNome.setPreferredSize(new Dimension(200, 25));
		griBagConstraints.gridy++; // andar uma linha no eixo Y
		jPanel.add(mostraNome, griBagConstraints);

		descricaoEmail.setPreferredSize(new Dimension(200, 25));
		griBagConstraints.gridy++;
		jPanel.add(descricaoEmail, griBagConstraints);

		mostraEmail.setPreferredSize(new Dimension(200, 25));// Largura por Altura
		griBagConstraints.gridy++;
		jPanel.add(mostraEmail, griBagConstraints);

		// Criação dos botões
		griBagConstraints.gridwidth = 1;// posicionamento da largura para voltou a ser 1

		jButton.setPreferredSize(new Dimension(92, 25));
		griBagConstraints.gridy++;
		jPanel.add(jButton, griBagConstraints);

		jButton2.setPreferredSize(new Dimension(92, 25));
		griBagConstraints.gridx++;// andar coluna no eixo X
		jPanel.add(jButton2, griBagConstraints);

		// Fazer ação do botão
		// Botão START
		jButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {/* Executa o clique no botão */

				if (fila == null) {
					fila = new ImplementacaoFilaThread();
					fila.start();
				}

				for (int qtd = 0; qtd < 100; qtd++) {/* Simulando 100 envios em massa */
					ObjetoFilaThread filaThread = new ObjetoFilaThread();
					filaThread.setNome(mostraNome.getText());
					filaThread.setEmail(mostraEmail.getText() + " - " + qtd);

					fila.add(filaThread);
				}
			}
		});

		// Botão STOP
		jButton2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				fila.stop();
				fila = null;
			}
		});

		fila.start();
		add(jPanel, BorderLayout.WEST);
		// Sempre será o último comando
		setVisible(true);/* Torna a tela visível para o usuário */
	}

}
