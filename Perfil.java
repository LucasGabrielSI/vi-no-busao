package VInoBusao;

import javax.swing.JOptionPane;

public class Perfil extends Onibus {
	String nome;
	String idade;
	String cidade;
	
	public void listarUsuariosOnline() {
		JOptionPane.showMessageDialog(null, "PERFIL DE USU�RIO\r\n Nome: " + nome + "\r\n Idade: " + idade + "\n\r Cidade : " + cidade + "\n\r" + "\n\r USU�RIOS ADICIONADOS POR VOC� :\r\n " + " Artur bruno \r\n" + " Diego teixeira \r\n");
		System.out.println(" Artur bruno \r\n" + " Rayane correa \r\n");
	}
}
