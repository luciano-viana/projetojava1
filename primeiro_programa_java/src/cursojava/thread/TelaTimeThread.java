package cursojava.thread;

import java.awt.Dimension;

//Swing é um framework para clirar as aplicações em Desktop
import javax.swing.JDialog;

public class TelaTimeThread extends JDialog {
	
	public TelaTimeThread() {/*Constructor executa o que tiver dentro no momento da abertura ou execução*/
		//início, configurações inicias da tela
		setTitle("Minha tela de time com Thread");
		setSize(new Dimension(400, 400));//Tamanho tela
		setLocationRelativeTo(null);//Centralizar tela
		setResizable(false);//Travar alteração na tela após executada
		/*Primeira parte concluida*/
		
		
		//Sempre será o últmo comando
		setVisible(true);/*Torna a tela visivel para o usuário*/
	}
	

}
