
import java.util.Scanner;

public class Area {
    
    public static void main(String[]args){
        
       
        double a;
        double b;
        double c;
       
        
     
        
        double inside;
        double area;
       
       
                
        
        
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER THE VALUE OF ONE SIDE");
        a = input.nextDouble();
        System.out.print("ENTER VALUE OS SECOND SIDE");
        b = input.nextDouble();
        System.out.print("ENTER THE VALUE OF THE THIRD SIDE");
        c = input.nextDouble();
            double x ;
            
        
        double y ;
        
        double z;
        
      double j;
        j = (a + b + c)/2 ;
        x =  j - a;
        y = j - b; 
        z = j - c;
     
        
        inside = j*x*y*z;
        
        area = Math.sqrt(inside);
        
        System.out.println(area);
        
       
        
                
      
        
    }
    
}
