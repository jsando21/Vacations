import java.util.*;

public class vacation2
{
   public static void main(String [] args)
   {
      System.out.println("What is your budget?");
      Scanner b = new Scanner(System.in);
         int budget = b.nextInt();
      System.out.println("What is your destination?");
         String no = b.nextLine();
         String destination = b.nextLine();
      System.out.println("Are you choosing the Inclusive package or the Piecemeal package?");
         char p = b.next().charAt(0);
         
            
      if(p =='P' || p == 'p')
      {
         int hotel =250;
         int meal = 100;
         int airfare = 200;
         int cost = hotel + meal + airfare;
         
         System.out.println("Destination: " + destination);
         System.out.println("Budget: $" + budget);
         System.out.println("Hotel: $" + hotel);
         System.out.println("Meal: $" + meal);
         System.out.println("Airfare: $" + airfare);
         System.out.println("Total Cost: $" + cost);
         
         if(budget<cost)
            System.out.println("You cannot afford this vacation");
         else 
            System.out.println("You can afford this vacation");
      }
      if(p == 'I' || p == 'i')
      {
         int rating = 5;
         int price = 800;
         String Brand = "Clubmed";
         
         System.out.println("Destination: " + destination);
         System.out.println("Budget: $" + budget);
         System.out.println("Brand: " + Brand);
         System.out.println("Rating: " + rating);
         System.out.println("Price: $" + price);
      
         if(budget<price)
            System.out.println("You cannot afford this vacation");
         else 
            System.out.println("You can afford this vacation");
      }     
   }
}