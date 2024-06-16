package cursojava.thread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaCadastroUsuarios extends JDialog {
	
	//1º - Instanciar objeto JPanel - Painel de componentes
	private JPanel jPanel = new JPanel(new GridBagLayout());
	
	//4º - Criação dos campos
	//Nome
	private JLabel descricaoNome = new JLabel("Nome");//Descrição do campo
	private JTextField mostrarNome = new JTextField();
	
	//E-mail
	private JLabel descricaoEmail = new JLabel("Email");//Descrição do campo
	private JTextField mostrarEmail = new JTextField();
	
	//Login
	private JLabel descricaoLogin = new JLabel("Login");//Descrição do campo
	private JTextField mostrarLogin = new JTextField();

	//Senha
	private JLabel descricaoSenha = new JLabel("Senha");
	private JTextField mostrarSenha = new JTextField();
	
	//5º - Criação dos Botões
	private JButton jButton = new JButton("Gravar");
	private JButton jButton2 = new JButton("Cancelar");
	
	
	//2º - Configurações inicias da Tela
	public TelaCadastroUsuarios() {
		setTitle("Cadastro de Usuário");
		setSize(240,300);//Tamanho da Tela - Largura por Altura
		setLocationRelativeTo(null);//Centralizar Tela
		
		//GridBagConstraints é um Controlador de posicionamento dos componentes na Tela
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridx = 0;//eixo X
		gridBagConstraints.gridy = 0;//eixo Y
	    gridBagConstraints.gridwidth = 2;
	    gridBagConstraints.insets = new Insets(1, 10, 2, 2);
		gridBagConstraints.anchor = GridBagConstraints.WEST;//posicionamento da tela
		
	//4.1 - Criação dos campos
		//Nome
		descricaoNome.setPreferredSize(new Dimension(200,25));
		jPanel.add(descricaoNome,gridBagConstraints);
		
		mostrarNome.setPreferredSize(new Dimension(200,25));
		gridBagConstraints.gridy++;
	    jPanel.add(mostrarNome,gridBagConstraints);
	    
	  //E-mail
	    descricaoEmail.setPreferredSize(new Dimension(200,25));
	    gridBagConstraints.gridy++;
	    jPanel.add(descricaoEmail,gridBagConstraints);
	    
	    mostrarEmail.setPreferredSize(new Dimension(200,25));
	    gridBagConstraints.gridy++;
	    jPanel.add(mostrarEmail,gridBagConstraints);
	    
	    //Login
	    descricaoLogin.setPreferredSize(new Dimension(200,25));
	    gridBagConstraints.gridy++;
	    jPanel.add(descricaoLogin,gridBagConstraints);
	    
	    mostrarLogin.setPreferredSize(new Dimension(200,25));
	    gridBagConstraints.gridy++;
	    jPanel.add(mostrarLogin,gridBagConstraints);
	    
	    //Senha
	    descricaoSenha.setPreferredSize(new Dimension(200,25));
	    gridBagConstraints.gridy++;
	    jPanel.add(descricaoSenha,gridBagConstraints);
	    
	    mostrarSenha.setPreferredSize(new Dimension(200,25));
	    gridBagConstraints.gridy++;
	    jPanel.add(mostrarSenha,gridBagConstraints);
		
		
	    //5.1 - Criação dos botões
	    gridBagConstraints.gridwidth = 1;//posicionamento da largura para voltar a ser 1
	    
	    jButton.setPreferredSize(new Dimension(92,25));
	    gridBagConstraints.gridy++;
	    jPanel.add(jButton,gridBagConstraints);
	    
	    jButton2.setPreferredSize(new Dimension(92,25));
	    gridBagConstraints.gridx++;
	    jPanel.add(jButton2,gridBagConstraints);
	    
	    //6º - Ação nos botões
	    //Botão SALVAR
	    jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				jButton.setEnabled(false);
				jButton2.setEnabled(true);
				
			}
		});
	    
	    //Botão EXCLUIR
	    jButton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				jButton.setEnabled(true);
				jButton2.setEnabled(false);
				
			}
		});
	    
		
		add(jPanel,BorderLayout.WEST);
		//3º - Tornar Tela visível para o usuário
		setVisible(true);
	}
}
