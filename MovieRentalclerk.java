import java.util.Scanner;
import java.util.*;

public class MovieRentalclerk
{
	void Clerk()
{
      int  item, quantity;    
      int  price = 0;   
      char choice;     
      int pl[]= {50,29,15,10,100,45,150,200,80,140};
      String n[]= {"Star Wars EP1","Star Wars EP2","Star Wars EP3","Star Wars EP4","Star Wars EP5","Star Wars EP6","Rogue One","Solo","The Departed","Paranoia"};
      List<Integer> pricearray = new ArrayList<Integer>();
      List<String> list=new ArrayList<String>(); 
      Scanner console = new Scanner(System.in);

      do
      {
         // Getting the value from the user.
         System.out.print("Enter itemno: ");
         item = console.nextInt();
	 System.out.println("Enter Quantity: ");
	 quantity = console.nextInt();
         for(int i=0; i<10; i++)
	 {
	   if(item == i){
	    int p = pl[item];
	    price = price + (quantity * p);
	    list.add(n[item]);
	    pricearray.add(quantity*p);
			}
	    //else{ System.out.println("Item does not exist in our inventory!");
		  //System.exit(0);}
	 }	
	
         System.out.println("Add next item?(Y for yes or N for no): ");
         choice = console.next().charAt(0);
       }
      while ((choice == 'y') || (choice == 'Y'));
     
      System.out.println("Total amount to be paid : "+ price);
      System.out.println("Bill Generated");
      System.out.println("Purchased                                 Price(Rs)");
      System.out.println("--------------------------------------------");
      for (int i = 0 ; i < list.size(); i++) {System.out.println( list.get(i)+"                                "+pricearray.get(i)) ;}
}


public static void main(String[] args)
{
      MovieRentalclerk c1= new MovieRentalclerk();
      c1.Clerk();
}

}