package polimorphism;

public class Animal {
	  
		void eat(){System.out.println("animal is eating...");}  
		}  
		class Dog extends Animal{  
		void eat(){System.out.println("dog is eating...");}  
		}  
		class BabyDog1 extends Dog{  
			void eat()
			{
				System.out.println(" babydog is eating");
			}
		
			public static void main(String args[]){  
				Animal a=new BabyDog1();
				a.eat(); 
		} 
		

}
