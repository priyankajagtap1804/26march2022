package loop;

public class continue_loop {
	public static void main(String[] args) {  
		// TODO Auto-generated method stub  
		  
		for(int i = 0; i<= 2; i++) {  
		  
		for (int j = 1; j<=5; j++) {  
		  
		if(j == 4) {  
		  break;//Unlike break statement, the continue statement doesn't break the loop, whereas, it skips the specific part of the loop and jumps to the next iteration of the loop immediately.
		}  
		System.out.print(j);  
		
		}  
		System.out.println();
		}  
		}  

}
