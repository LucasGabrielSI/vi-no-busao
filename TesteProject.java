package VInoBusao;

import javax.swing.JOptionPane;

public class TesteProject {
	public static void main(String[]args) {
		Usuario  u1 = new Usuario();
		u1.login = JOptionPane.showInputDialog("Digite seu nome de usuário: ");
		System.out.println(u1.login);
		u1.senha = JOptionPane.showInputDialog("Digite sua senha: ");
		System.out.println(u1.senha);
		
		JOptionPane.showMessageDialog(null, "BEM VINDO, agora você irá escolher sua rota e horário: ");
		Onibus onb1 = new Onibus();
		
		onb1.rota = JOptionPane.showInputDialog("Em qual ROTA você está? ");
		System.out.println(onb1.rota);
		onb1.hora = JOptionPane.showInputDialog("Qual o horário da sua rota? ");
		System.out.println(onb1.hora);
		
		Usuario u2 = new Usuario();
		u2.onibus = new Onibus();
		
		u2.onibus = new Onibus();
		u2.usuariosOnline();
		
		Perfil p1 = new Perfil();
		
		int resposta;
		resposta = JOptionPane.showConfirmDialog(null, "Deseja adicionar mais informações ao seu perfil? ");
		if(resposta == JOptionPane.YES_OPTION) {
			p1.nome = JOptionPane.showInputDialog(null, "QUAL SEU NOME? ");
			System.out.println(p1.nome);
			p1.idade = JOptionPane.showInputDialog(null,"QUAL SUA IDADE ?" );
			System.out.println(p1.idade);
			p1.cidade= JOptionPane.showInputDialog(null,"QUAL SUA CIDADE?" );
			System.out.println(p1.cidade);
		}else {
			JOptionPane.showMessageDialog(null, "OK");
		}
		p1.listarUsuariosOnline();
	}}
