package cursojava.arquivos;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/*JSON "formatação utilizada para estruturar dados" são dados estruturados de um Objeto onde esses dados ficam em um formato texto com uma 
 * estrutura padrão onde é identificado os atributos, os objetos e a lista, de acordo com o objeto e seus atributos ele pode ser convertido
 * em texto para transportar para a web,é muito comum em integrações e API que sempre retorna JSON "é a forma de ligar dados em diferentes 
 * linguagens, diferentes sistemas fazendo integrações de forma transparente, no final o que importa é os dados e não a linguagem.
 */

public class EscreverJSON {

	public static void main(String[] args) throws IOException {

		//1º - Criar Objetos e passar os dados
		Usuario usuario1 = new Usuario();
		usuario1.setNome("Luciano Viana");
		usuario1.setCpf("745.632.040-30");
		usuario1.setLogin("Viana");
		usuario1.setSenha("@321");

		Usuario usuario2 = new Usuario();
		usuario2.setNome("Jussânia");
		usuario2.setCpf("199.221.510-30");
		usuario2.setLogin("Juju");
		usuario2.setSenha("@24");

		//2º - Colocar na Lista
		List<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios.add(usuario1);
		usuarios.add(usuario2);

		//3º - Converter a lista para JSON
		// Gson Utilizado para organizar o código
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String jsonUser = gson.toJson(usuarios);
		
		
		System.out.println(jsonUser);

		//4º - Escrever no arquivo
		FileWriter fileWriter = new FileWriter(
				"C:\\Users\\lucianoviana\\git\\projetojava1\\primeiro_programa_java\\src\\cursojava\\arquivos\\filjson.json");

		/*
		 * Se tiver problema com acentuação no arquivo implementar linha abaixo
		 * OutputStreamWriter escrever_no_arquivo = new OutputStreamWriter(new
		 * FileOutputStream(fileWriter),"UTF-8");
		 */

		fileWriter.write(jsonUser);
		fileWriter.flush();
		fileWriter.close();
	}

}
