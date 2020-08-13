import java.util.Scanner; 
import java.util.*;  
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;   

public class MovieRentalbill
{     List<Integer> pricearray = new ArrayList<Integer>();
      List<String> list=new ArrayList<String>(); 
      int  price = 0;
      protected String Clerk = "Rackham";
  public void cashier()
{
      int  item, quantity;    
      char choice;     
      int pl[]= {50,29,15,10,100,45,150,200,80};
      String n[]= {"Star Wars EP1","Star Wars EP2","Star Wars EP3","Star Wars EP4","Star Wars EP5","Star Wars EP6","Rogue One","Solo","The Departed","Paranoia"};
      Scanner console = new Scanner(System.in);

      do
      {
         System.out.println("Browse from our collection:" + n);
	 // Get the value from the user.
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
	    //else{ System.out.println("Item does not exist!");
		  //System.exit(0);}
	 }	
	
         System.out.print("Add next item?(Y for yes or N for no): ");
         choice = console.next().charAt(0);
       }
      while ((choice == 'y') || (choice == 'Y'));
     
      
      System.out.println("Bill Generated");
      System.out.println("--------------------------------------------");
     
}

 	private void details(){
	int OutletId = 710365;
	int CashierID = 156543;
	}

void generatebill(){
		System.out.println("Purchased                          Price(Rs)");
      		System.out.println("--------------------------------------------");
     		for (int i = 0 ; i < list.size(); i++) {System.out.println( list.get(i)+"                                "+pricearray.get(i)) ;}
		System.out.println("Total                              "+price);
}


public static void main(String[] args)
{
      outlet c1= new outlet();
      c1.cashier();
      c1.display();
      c1.generatebill();
      //c1.details();
}

}

class outlet extends MovieRentalbill{
DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
LocalDateTime now = LocalDateTime.now();
void display(){System.out.println(Clerk); 
System.out.println(dtf.format(now));}

}


