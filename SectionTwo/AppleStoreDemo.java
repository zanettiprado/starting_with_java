public class AppleStoreDemo {
    public static void main(String[] args) {
        int numOfApples = 0;
        int numOfCustomers = 0;
        double profit = 0;
        double price = 0.40;

        numOfApples += 500;
        numOfApples -= 4;
        numOfCustomers ++;
        profit = (4 * price);
        numOfApples -= 20;
        numOfCustomers ++;
        profit = (24 * price);
        numOfApples -= 200;
        numOfCustomers ++;
        profit = (224 * price);
        


        System.out.println(numOfApples);
        System.out.println(numOfCustomers);
        System.out.println(profit);  


        // Instructions for this workbook are on Learn the Part (see the Udemy Video: Workbook 2.3 to access the link).

        // System.out.println("You picked 500 apples from an apple orchard");
        
        // System.out.println("Time for business! You're selling each apple for 40 cents");

        // System.out.println("One customer walked in. He bought 4 apples!");

        // System.out.println("Another customer walked in. He bought 20 apples!");

        // System.out.println("Another customer walked in. She bought 200 apples!");
        

        System.out.println("Wow! So far, you made: " + profit);
        System.out.println(numOfCustomers + " customers love your apples.");
        System.out.println("You have " + numOfApples + " apples left.");

        // Compare your result to what's on Learn the Part.  
        
    }

}
