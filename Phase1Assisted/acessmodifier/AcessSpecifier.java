package program.acessmodifier;

public class AcessSpecifier {
	
		  void display() 
		     { 
		         System.out.println("You are using defalut access specifier"); 
		     } 		

			public static void main(String[] args) {
				//default
				System.out.println("Dafault Access Specifier");
				AcessSpecifier obj = new AcessSpecifier(); 		  
		        obj.display(); 

			}
		}


