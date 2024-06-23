package cursojava.arquivos;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class LerJSON {

	public static void main(String[] args) throws IOException {

		// Lendo o arquivo
		FileReader fileReader = new FileReader(
				"C:\\Users\\lucianoviana\\git\\projetojava1\\primeiro_programa_java\\src\\cursojava\\arquivos\\filjson.json");

		// Pegando os dados do arquivo e colocando no JsonArray que é uma estrutura de
		// dados
		JsonArray jsArray = (JsonArray) JsonParser.parseReader(fileReader);// Separa todos os Json em posições separadas

		List<Usuario> listaUsuarios = new ArrayList<Usuario>();

		// Varrer o JsonArray
		for (JsonElement jsonElement : jsArray) {

			// Objeto do tipo usuario
			Usuario usuario = new Gson().fromJson(jsonElement, Usuario.class);
			listaUsuarios.add(usuario);
		}
		System.out.println("Leitura do arquivo JSON: " + listaUsuarios);
	}
}