package cursojava.thread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

//Swing é um framework para clirar as aplicações em Desktop
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTimeThread extends JDialog {
	
	private JPanel jPanel = new JPanel(new GridBagLayout());/*Painel de componentes*/
	
	private JLabel descricaoHora = new JLabel("Time Thread 1");
	private JTextField mostraTempo = new JTextField();
	
	private JLabel descricaoHora2 = new JLabel("Time Thread 2");
	private JTextField mostraTempo2 = new JTextField();
	
	public TelaTimeThread() {/*Constructor executa o que tiver dentro no momento da abertura ou execução*/
		//início, configurações inicias da tela
		setTitle("Minha tela de time com Thread");
		setSize(new Dimension(250, 250));//Tamanho tela - Largura por Altura
		setLocationRelativeTo(null);//Centralizar tela
		setResizable(false);//Travar alteração na tela após executada
		/*Primeira parte concluida*/
		
		
		//GridBagConstraints e um Controlador de posicionamento de componentes na tela
		GridBagConstraints griBagConstraints = new GridBagConstraints();
		griBagConstraints.gridx = 0;
		griBagConstraints.gridy = 0;
		
		descricaoHora.setPreferredSize(new Dimension(200, 25));
		jPanel.add(descricaoHora, griBagConstraints);
		
		mostraTempo.setPreferredSize(new Dimension(200, 25));
		griBagConstraints.gridy ++; //andou uma linha Y
		jPanel.add(mostraTempo, griBagConstraints);
		
		
		descricaoHora2.setPreferredSize(new Dimension(200, 25));
		griBagConstraints.gridy ++;
		jPanel.add(descricaoHora2, griBagConstraints);
		
		mostraTempo2.setPreferredSize(new Dimension(200, 25));//Largura por Altura
		griBagConstraints.gridy ++;
		jPanel.add(mostraTempo2, griBagConstraints);
		
		
		add(jPanel, BorderLayout.WEST);
		//Sempre será o último comando
		setVisible(true);/*Torna a tela visivel para o usuário*/
	}
	

}
