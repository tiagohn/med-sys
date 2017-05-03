package business.model;

public class Usuario{
	private String name;
	private String password;
	
	public Usuario(String name, String password){
		this.name = name;
		this.password = password;
		
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPassword(String pw){
		this.password = pw;
	}
	
	public String getPassword(){
		return this.password;
	}
	
}
