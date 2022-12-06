import java.util.Scanner;
public class Pizza {


  public static void main(String[] args) {
    final double  SLICE = 4;
    Scanner scanner = new Scanner(System.in);

    int T = scanner.nextInt();
    
   for (int i = 1; i <= T; i++) {
	
	    int amigos = scanner.nextInt();
	    int fatias = scanner.nextInt();
	    
	    double x = amigos*fatias;
	    int y = (int) Math.ceil(x/SLICE);
	    
	    System.out.println(y);
	    
	    
   }

   
}
}
