
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);





        student s = new student();
        s.id = 3431;
        s.age = 17;
        s.name = "Edwin";
//        System.out.println("Name: "+ s.name+ "  Age "+s.age+ "   Id Number: " + s.id);


        Cars car1 = new Cars();
        Cars car2 = new Cars();
        Cars car3 = new Cars();
        Cars car4 = new Cars();
        Cars car5 = new Cars();

        Bikes bike1 = new Bikes();
        Bikes bike2 = new Bikes();
        Bikes bike3 = new Bikes();
        Bikes bike4 = new Bikes();
        Bikes bike5 = new Bikes();

        car1.name = "Lamborghini";
        car2.name = "Ferrari";
        car3.name = "Bugatti";
        car4.name = "Pagani";
        car5.name = "Porsche";

        car1.cost = "$203,000";
        car2.cost = "$252,000";
        car3.cost = "$3,000,000";
        car4.cost = "$1,400,000";
        car5.cost = "$293,000";

        bike1.name = "Harley Davidson";
        bike2.name = "Ducati";
        bike3.name = "Suzuki";
        bike4.name = "Ecosse";
        bike5.name = "Yamaha";

        bike1.cost = "$130,000";
        bike2.cost = "$232,000";
        bike3.cost = "$200,000";
        bike4.cost = "$300,000";
        bike5.cost = "$500,000";


        System.out.println("What do you want to buy?");
        System.out.println("1. Bikes");
        System.out.println("2. Cars");

        int choice;

        System.out.println("Enter your choice");
        choice = scanner.nextInt();

        if(choice==1){
            System.out.println("We have 5 models");
            System.out.println("1. Harley Davidson");
            System.out.println("2. Ducati");
            System.out.println("3. Suzuki");
            System.out.println("4. Pagani");
            System.out.println("5. Yamaha");
            System.out.println("Enter your choice: ");

            int selected;

            selected = scanner.nextInt();
            if(selected==1){
                System.out.println("The cost of Harley Davidson is :"+bike1.cost);
            } else if (selected==2) {
                System.out.println("The cost of Ducati is :"+bike2.cost);
            }
            else if (selected==3) {
                System.out.println("The cost of Suzuki is :"+bike3.cost);
            }
            else if (selected==4) {
                System.out.println("The cost of Pagani is :"+bike4.cost);
            }
            else if (selected==5) {
                System.out.println("The cost of Yamaha is :"+bike5.cost);
            }
            else {
                System.out.println("The bike does not exist");
            }
        }
        else if(choice==2){
            System.out.println("We have 5 models available");
            System.out.println("1. Lamborghini");
            System.out.println("2. Ferrar");
            System.out.println("3. Bugati");
            System.out.println("4. Eccose");
            System.out.println("5. Yamaha");
        }










    }



}