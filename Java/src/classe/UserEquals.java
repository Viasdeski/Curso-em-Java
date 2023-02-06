package classe;

public class UserEquals {
	
	String nome;
	String email;
	
	//TEMOS QUE IMPLEMENTAR O EQUALS
	
	@Override
	public boolean equals(Object objeto) {
		
		UserEquals qualquerUser = (UserEquals) objeto;
		
		if(objeto instanceof UserEquals) {//VERIFICANDO SE A INSTANCIA É DO TIPO USER
			boolean nomeIgual = qualquerUser.nome.equals(this.nome);
			boolean emailIgual = qualquerUser.email.equals(this.email);
			
			return nomeIgual && emailIgual;
		}else{
			return false;	
		}
		
		
		/*if(objeto instanceof UserEqualsEHashCode) {
			UserEqualsEHashCode outro = (UserEqualsEHashCode) objeto; //(User..) CASTING
			return super.equals(objeto);
		}else{
			return false;
		}*/
		 
		
	}

}
