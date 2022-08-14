package practice_program;

public class if_else_if {
	  
		public static void main(String[] args) {    
		String address = "Delhi, India";    
		   String a1; 
		if(address.endsWith("India")) {    
		if(address.startsWith("mumbai")) {    
		System.out.println("Your city is Meerut");    
		}else if(address.contains("pune")) {    
		System.out.println("Your city is Noida");    
		}else {    
		System.out.println(address.split(",")[0]);    
		}    
		}else {    
		System.out.println("You are not living in India");    
		}    
		}    
		}    


