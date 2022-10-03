package pizzapasta;

import java.util.Scanner;

/**
 * @author MEENAG
 *
 */
public class PizzaPasta
{
	public static void main(String[] args) 
	{
		Order customer=new Order();
		customer.welcomePage(customer);		
	}
}

class Order
{
	String orderItem = null;
	Scanner s=new Scanner(System.in);
	
	public void welcomePage(Order customer) 
	{
		System.out.println(" WELCOME TO THE SHOP! ☺ \n");
		System.out.println("What would you like to order?");
	    System.out.println("(1) I want Pizza \n(2) I want Pasta \n(3) I would like to finish ordering");
	    int item=s.nextInt();
	    switch(item)
		{
			case 1: 
				orderItem = "Pizza ";
				pizza();
				break;
			case 2: 
				orderItem = "Pasta ";
				pasta();
				break;
			case 3: 
				endPage();
			default: 
				System.out.println("Invalid.. Please select the correct option! ");
		}
	}
	
	public void pizza() 
	{	
		String pizzaSize = null,
			   crustType = null, 
			   pizzaType = null, 
			   pizzaTop = null;
		int price = 0;
		
// Pizza Type: Veg, Non-Veg or Vegan
	    
		System.out.println("Please select the Pizza Type:");
		System.out.println("(1) Veg \n(2) Non-Veg \n(3) Vegan ");
	    int type=s.nextInt();
	    switch(type)
		{
			case 1: 
				pizzaType= "Veg ";
				price = 20;
				break;
			case 2: 
				pizzaType = "Non-Veg ";
				price = 25;
				break;
			case 3: 
				pizzaType = "Vegan ";
				price = 15;
				break;
			default: System.out.println("Invalid.. Please select the correct option! ");
		}
		
		
// Pizza Size: Large, Medium & Small
		
		System.out.println("Please select the Pizza Size:");
		System.out.println("(1) Large \n(2) Medium \n(3) Small ");
	    int size=s.nextInt();
	    switch(size)
		{
			case 1: 
				pizzaSize = "Large " ;
				price = price * 3;
				break;
			case 2: 
				pizzaSize = "Medium " ;
				price = price * 2;
				break;
			case 3: 
				pizzaSize = "Small " ;
				price = price * 1;
				break;
			default: System.out.println("Invalid.. Please select the correct option! ");
		}
	    
// Pizza Crust Type: Thick or Thin
	    
	    System.out.println("Please select the Crust Type:");
		System.out.println("(1) Thick \n(2) Thin ");
	    int crust=s.nextInt();
	    switch(crust)
		{
			case 1: 
				crustType = "Thick Crusted " ;
				break;
			case 2: 
				crustType = "Thin Crusted " ;
				break;
			default: System.out.println("Invalid.. Please select the correct option! ");
		}
	    	    
// Toppings: Cheese, Mushroom, Tomato, Jalapeno, Spinach
	    
	    System.out.println("Don't miss the Toppings. Choose from below:");
		System.out.println("(1)Cheese - 1.00 USD \n(2)Mushroom - 1.00 USD \n(3)Tomato - 1.00 USD \n(4)Jalapeno - 1.00 USD \n(5)Spinach - 1.00 USD \n(6)No Toppings ");
	    int top=s.nextInt();
	    switch(top)
		{
			case 1: 
				pizzaTop= "Cheese ";
				price = price + 1;
				break;
			case 2: 
				pizzaTop = "Mushroom ";
				price = price + 1;
				break;
			case 3: 
				pizzaTop = "Tomato ";
				price = price + 1;
				break;
			case 4: 
				pizzaTop = "Jalapeno ";
				price = price + 1;
				break;
			case 5: 
				pizzaTop = "Spinach ";
				price = price + 1;
				break;
			case 6: 
				pizzaTop = "No Topping ";
				break;
			default: 
				System.out.println("Invalid.. Please select the correct option! ");
				pizzaTop = "No Topping ";
		}	
	    System.out.println("\nYour order costs " + price + " USD!\n");
	    System.out.println("Ordering " + pizzaSize + pizzaType + crustType + "Pizza with " + pizzaTop + "..."); 
	    System.out.println("Preparing Pizza Dough...");
	    System.out.println("Baking Pizza...");
	    System.out.println("...\nPlease wait while we prepare your Pizza Fresh and Hot!\n...");
	    System.out.println("Placing the pizza on dish...");
	    System.out.println("Order is ready! \nEnjoy your " + pizzaSize + pizzaType + crustType + "Pizza with " + pizzaTop + "...");  
	    System.out.println("...\nPlease make payment of " + price + " USD!\nPaying...\nPayment Done! \n....");
	    endPage();
	}
	
	private void pasta() 
	{		
		String flavor = null,
			   pastaType = null;
		int price = 0;
		
// Pasta Flavor: Red Sauce or White Sauce
	    
		System.out.println("Please select the Pasta Flavor:");
		System.out.println("(1) Red Sauce \n(2) White Sauce");
	    int f=s.nextInt();
	    switch(f)
		{
			case 1: 
				flavor = "Red Sauce ";
				price = 20;
				break;
			case 2: 
				flavor = "White Sauce ";
				price = 10;
				break;
			default: System.out.println("Invalid.. Please select the correct option! ");
		}
		
		
// Pasta Type: Penne, Ditalini or Tortelli
		
		System.out.println("Please select the Pizza Size:");
		System.out.println("(1) Penne\n(2) Ditalini\n(3) Tortelli");
	    int size=s.nextInt();
	    switch(size)
		{
			case 1: 
				pastaType = "Penne ";
				break;
			case 2: 
				pastaType = "Ditalini ";
				break;
			case 3: 
				pastaType = "Tortelli ";
				break;
			default: System.out.println("Invalid.. Please select the correct option! ");
		}
	    
	    System.out.println("\nYour order costs " + price + " USD!\n");
	    System.out.println("Ordering " + flavor + pastaType + "Pasta..."); 
	    System.out.println("Preparing Pasta...");
	    System.out.println("...\nPlease wait while we prepare your Pasta Fresh and Hot!\n...");
	    System.out.println("Placing the Pasta on dish...");
	    System.out.println("Order is ready! \nEnjoy your " + flavor + pastaType + "Pasta...");  
	    System.out.println("...\nPlease make payment of " + price + " USD!\nPaying...\nPayment Done! \n...");
	    endPage();			
	}
	
	private void endPage() 
	{
		System.out.println("THANK YOU!! WE'D LOVE YOUR VISIT AGAIN!!!");
		System.exit(1);
	}		
}