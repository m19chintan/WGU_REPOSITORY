import java.util.Scanner;  
class TestProgram1{  
 public static void main(String args[])
 {  
   //Sample Java Program
	Scanner stuscan=new Scanner(System.in);  
   stuscan=null;
   
   
   String newline = stuscan.nextLine();
   System.out.println("Enter your WGU ID");  
   int wguid=stuscan.nextInt();  
   System.out.println("Enter your first name");  
   String firstname=stuscan.next();  
   System.out.println("Enter your last name");  
   String lastname=stuscan.next(); 
   stuscan.close();  
   System.out.println(lastname+" "+firstname);  
	}
 }  