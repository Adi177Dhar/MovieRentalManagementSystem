import java.util.Scanner;
import java.util.*;

public class MovieRental
{
	void language()
{
      int  item, quantity;    
      int  price = 0;   
      char choice;     
      int pl[]= {50,29,15,10,100,45,150,200,80};
      String n[]= {"English","Hindi","Bengali","Malayalam","Tamil","Korean","Marathi","German","Thai"};
      List<Integer> pricearray = new ArrayList<Integer>();
      List<String> list=new ArrayList<String>(); 
      Scanner console = new Scanner(System.in);

      do
      {
         // Get the value from the user.
         System.out.print("Enter itemno: ");
         item = console.nextInt();
	 System.out.println("Enter Quantity: ");
	 quantity = console.nextInt();
         for(int i=0; i<9; i++)
	 {
	   if(item == i){
	    int p = pl[item];
	    price = price + (quantity * p);
	    list.add(n[item]);
	    pricearray.add(quantity*p);
			}
	    //else{ System.out.println("Language does not exist!");
		  //System.exit(0);}
	 }	
	
         System.out.println("Add next item?(Y for yes or N for no): ");
         choice = console.next().charAt(0);
       }
      while ((choice == 'y') || (choice == 'Y'));
     
      System.out.println("Total amount to be paid : "+ price);
      System.out.println("Bill Generated");
      System.out.println("Purchased                          Price(Rs)");
      System.out.println("--------------------------------------------");
      for (int i = 0 ; i < list.size(); i++) {System.out.println( list.get(i)+"                                "+pricearray.get(i)) ;}
}


public static void main(String[] args)
{
      MovieRental c1= new MovieRental();
      c1.language();
}

}