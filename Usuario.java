package VInoBusao;

public class Usuario {
	String login;
	String senha;
	Onibus onibus;
	
	public void login(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}
	
	public void login() {
		
	}
	
	public void usuariosOnline() {
		 onibus.listarUsuariosOnline();
	}
}
