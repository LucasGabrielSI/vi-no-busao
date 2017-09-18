package VInoBusao;

public class Usuario {
	String login;
	String senha;
	Onibus onibus;
	
	public void usuario(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}
	
	public void usuario() {
		
	}
	
	public void usuariosOnline() {
		 onibus.listarUsuariosOnline();
	}
}
