package program.acessmodifier;

public class PriAcessSpecifier {
	
		   private void display() 
		    { 
		        System.out.println("You are using private access specifier"); 
		    } 

			public static void main(String[] args) {
				//private
				System.out.println("Private Access Specifier");
				PriAcessSpecifier  obj = new PriAcessSpecifier(); 
		       
			}
		}


