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

public class TelaTimeThread extends JDialog {

	private JPanel jPanel = new JPanel(new GridBagLayout());/* Painel de componentes */

	// Criação dos campos
	private JLabel descricaoHora = new JLabel("Time Thread 1");// Descrição do campo
	private JTextField mostraTempo = new JTextField();// campo mostra tempo

	private JLabel descricaoHora2 = new JLabel("Time Thread 2");
	private JTextField mostraTempo2 = new JTextField();

	// Criação dos botões
	private JButton jButton = new JButton("Start");// Decrição do botão
	private JButton jButton2 = new JButton("Stop");

	// Thread para controlar 1º campo de data e hora
	private Runnable thread1 = new Runnable() {

		@Override
		public void run() {
			while (true) {/* Fica sempre rodando */
				//Para Thread1
				mostraTempo.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss").format(Calendar.getInstance().getTime()));
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}
	};
	
	private Runnable thread2 = new Runnable() {

		@Override
		public void run() {
			while (true) {/* Fica sempre rodando */
				//Para Thread2
				mostraTempo2.setText(new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").format(Calendar.getInstance().getTime()));
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}
	};
	
	//Instanciando o Objeto Thread nesse local para tudo abaixo conseguir acessar ele
	private Thread thread1Time;
	private Thread thread2Time;

	public TelaTimeThread() {/* Constructor executa o que tiver dentro no momento da abertura ou execução */
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
		descricaoHora.setPreferredSize(new Dimension(200, 25));
		jPanel.add(descricaoHora, griBagConstraints);

		mostraTempo.setPreferredSize(new Dimension(200, 25));
		mostraTempo.setEditable(false);// false para desabilitar a edição do campo
		griBagConstraints.gridy++; // andar uma linha no eixo Y
		jPanel.add(mostraTempo, griBagConstraints);

		descricaoHora2.setPreferredSize(new Dimension(200, 25));
		griBagConstraints.gridy++;
		jPanel.add(descricaoHora2, griBagConstraints);

		mostraTempo2.setPreferredSize(new Dimension(200, 25));// Largura por Altura
		mostraTempo2.setEditable(false);
		griBagConstraints.gridy++;
		jPanel.add(mostraTempo2, griBagConstraints);

		// Criação dos botões
		griBagConstraints.gridwidth = 1;// posicionamento da largura para voltou a ser 1

		jButton.setPreferredSize(new Dimension(92, 25));
		griBagConstraints.gridy++;
		jPanel.add(jButton, griBagConstraints);

		jButton2.setPreferredSize(new Dimension(92, 25));
		griBagConstraints.gridx++;// andar coluna no eixo X
		jPanel.add(jButton2, griBagConstraints);
		
		//Fazer ação do botão
		//Botão START
		jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {/*Executa o clique no botão*/

				thread1Time = new Thread(thread1);
				thread1Time.start();
				
				thread2Time = new Thread(thread2);
				thread2Time.start();
				
				jButton.setEnabled(false);
				jButton2.setEnabled(true);
			}
		} );
		
		
		//Botão STOP
		jButton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				thread1Time.stop();
				thread2Time.stop();
				
				jButton.setEnabled(true);
				jButton2.setEnabled(false);
			}
		});
		
        jButton2.setEnabled(false);//Botão desabilitado
		
		add(jPanel, BorderLayout.WEST);
		// Sempre será o último comando
		setVisible(true);/* Torna a tela visível para o usuário */
	}

}
