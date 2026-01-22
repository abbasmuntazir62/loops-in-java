import java.util.*;
public class studentmarkmenu {
public static void main(String[]args) {
    Scanner sc = new Scanner (System.in);
    int marks = sc.nextInt();
    int choice=sc.nextInt();
  
    do {
      System.out.println("enetr 1 to continue or 0 to stop");
    
     if (choice == 1) {
      System.out.println("enter the mark from 0 to 100");
      
      if (marks >=90 && marks <=100) {
        System.out.println("this is good");

      } else if ( marks >= 60 && marks <=89) {
        System.out.println("this is also good");
       } else if (marks >=0 && marks <= 59) {
        System.out.println("this is also well");
      } else  {
        System.out.println("invalid mark");
      }
    }
      } while (choice !=0);
        System.out.println("program ended");
      }
    }
          
  