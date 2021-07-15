import java.util.Scanner;

public class ejercicio1 {	

	public static void main(String[]args) {
		// TODO Auto-generated method stub
    
	
		Scanner numeros= new Scanner(System.in);

		System.out.println("Escribe un numero 1/3 ");
		int n =numeros.nextInt();
		System.out.println("Escribe un numero 2/3 ");
		int m =numeros.nextInt();
		System.out.println("Escribe un numero 3/3 ");        
        int o =numeros.nextInt();
		
						
		
		 if ( n> m && n>o ){		    
		 System.out.println("El numero mayor es " +n+ ","+m+","+o);
		 }
		 if ( m>n && n>o ){		    
			 System.out.println("El numero mayor es " +m+ ","+n+","+o);
			 }
		 if ( o> m && m>n ){		    
			 System.out.println("El numero mayor es " +o+ ","+m+","+n);
			 }
		 if ( o>n && n>m ){		    
			 System.out.println("El numero mayor es " +o+ ","+n+","+m);
			 }
		
	} 

	}
	
