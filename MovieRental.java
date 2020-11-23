import java.util.Scanner; 
import java.util.*;  
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;   
import discount.calcDiscount;         // user package

class InvalidException extends Exception //prg 9
{
    InvalidException(String s)
    { super(s);
    }

}
abstract class discount																												
{
	abstract void offer();
}

interface storedetails{           // Interface in prog9
  void name();
}

public class movierental extends employee implements Runnable  //prg 10 threads
{  
      List<Double> pricearray = new ArrayList<Double>();
      List<String> list=new ArrayList<String>(); 
      static double  price ;
      protected String CashierName;
      Scanner console = new Scanner(System.in);
      int item, age;
      
   movierental(String username){
      CashierName = username;
   }
  public void cashier()
{
      int  item, quantity;    
      char choice;     
      int pl[]= {50,29,15,10,100,45,150,200,80};
      String n[]= {"Star Wars EP1","Star Wars EP2","Star Wars EP3","The secret life of Walter Mitty","Ratatouille","The Accountant","Top Gun","Goldeneye","Dunkirk"};
      Scanner console = new Scanner(System.in);

      do
      {
            try {
         // Get the value from the user.
                  System.out.print("Enter itemno: ");
                  item = console.nextInt();
                  if(item == 7){
                        System.out.print("Enter age: ");  
                        age = console.nextInt();
                  }
	            System.out.println("Enter Quantity: ");
	            quantity = console.nextInt();
	            double p = pl[item];
	            price = price + (quantity * p);
	            list.add(n[item]);
	            pricearray.add(quantity*p);
			} catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Array Index is Out of Bounds");
                        System.exit(1);
                        }    // prg exception
	
            System.out.print("Add next item?(Y for yes or N for no): ");
            choice = console.next().charAt(0);
       }
      while ((choice == 'y') || (choice == 'Y'));
     
}

 	private void details(){
	int OutletId = 710365;
	int CashierID = 156543;
	}

void generatebill(){
                System.out.println("Bill is printing....Please hold.............");
		System.out.println("--------------------------------------------");
		System.out.println("Purchased                          Price(Rs)");
      		System.out.println("--------------------------------------------");
     		for (int i = 0 ; i < list.size(); i++) {System.out.println( list.get(i)+"                                "+pricearray.get(i)) ;}
		System.out.println("Total                              "+price);
		
}

final void offer()                                                                 
{
  double discountpercentage = 12.0;
  calcDiscount dis =  new calcDiscount();   //prg 8 package
  if(price >=350.00){
  //double discountprice = price * (discountpercentage/100);
  Double discountprice = dis.calculate(price, discountpercentage)  	; 
  Double discountamt = price - discountprice;    
  System.out.println("discount availed                   "+discountpercentage+"%");
  System.out.println("Amount to pay                      "+discountamt);
  }
  
}

public void ordervalid(Double pay) throws InvalidException {   //prg 9 Exception
      if (pay == 0.0) {
        throw new InvalidException("Not valid !!");
      }
    }

public void agerestriction() throws InvalidException{
            if (age <= 13 )
            {
                  throw new InvalidException("Rated PG-13");
            }
}

public void run()                                 //prg10 threads
{

      try
      {
            for( int i = 0; i<=5 ; i++)
            {
            System.out.println("                                               Costco's : Entertainment at your doorstep");
            Thread.sleep(10000);
            }
      }catch(InterruptedException e)
      {
       System.out.println("my thread interrupted");
      }
}


public static void main(String args[])
{     
      movierental ob = new movierental(args[0]);
      outlet.Emp s1 = new outlet.Emp();
      employee eobj = new employee(); 
      Scanner sc = new Scanner (System.in);
      StringBuffer custname = new StringBuffer("Customer : ");    
      Thread thread = new Thread(ob);                                   //prg 10 threads
      thread.start();
      eobj.name();              
      outlet obj[]= new outlet[1];
      outlet.change();                                    
      s1.show();
     
      obj[0]= new outlet(args[0], 230761);           
      String st = args[0];
     boolean ans = empname.contains(st.toLowerCase());     // prog5 String Class method String.toLowerCase()
     if(ans)
     {
      obj[0].cashier();
      try {                                  // prg9 Exception
            obj[0].ordervalid(price);
          } catch (Exception m)
          {
            System.out.println(m);
            System.exit(1);
      }

      try {                                  // prg9 Exception
            obj[0].agerestriction();
          } catch (Exception m)
          {
            System.out.println(m);
            System.exit(1);
      }
      
      System.out.println("Customer : ");

      custname.append(sc.nextLine());          // prog5 append method for string buffer
      obj[0].display("cash");
      obj[0].generatebill();
      obj[0].offer();                               // prog7 calling abstract method
      System.out.println(custname);                 // prog5 printing appended string buffer
     }
     else{System.out.println("No employee");}
     
       
}

}

class outlet extends movierental{		       // Aggregation(Movierental can still exist without this outlet)
static String Outletname = "Costco";                       
static void change(){Outletname= "Costco's Park Street";}                 
static { System.out.println("     Hello     ");}            
int password;   					// declaring password in the class (prg6)                                            
outlet(String username, int password){
	super(username);                                // prg7 superkeyword
	this.password = password;			// this keyword (prg6)
}
outlet(String username, int password, int employeeID)       
{
	super(username);
	this.password= password;			// this keyword (prg6)
	int empID= employeeID;
}
DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
LocalDateTime now = LocalDateTime.now();

void display(){System.out.println(CashierName); 
System.out.println(dtf.format(now));}

void display(String mode)                                 
{
 System.out.println(Outletname+"\n"+ "Cashier: " + CashierName); 
 System.out.println(dtf.format(now));
 System.out.println("Paid by :     "+ mode);
}

static class Emp{                                           
    void show(){
     System.out.println("Welcome to Costco's.\nWe value your service. Have a good day!! ") ;
     System.out.println(" ");
               }
                }
}

class employee implements storedetails         //prog8 class employee implements interface storedetails  
{
  static List<String> empname= new ArrayList<String>(3);
  public void name(){
  empname.add("henry");
  empname.add("toby");
  empname.add("julia");
     }

}














