import java.util.Scanner;  
class TestProgram1{  
 public static void main(String args[])
 {  
   Scanner sc=new Scanner(System.in);  
   sc=null;
   Scanner sc1= new Scanner(System.in);
   sc1=null;
   String newline = sc1.nextLine();
   System.out.println("Enter your WGU ID");  
   int wguid=sc.nextInt();  
   System.out.println("Enter your first name");  
   String firstname=sc.next();  
   System.out.println("Enter your last name");  
   String lastname=sc.next(); 
   sc.close();  
   System.out.println(lastname);  
	}
 }  