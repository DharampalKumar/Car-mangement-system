package car_management_project;
import  java.util.*;
public class CarManager {
     List<Car> l=new ArrayList<>();
     public void  selectOption() {
         Scanner sc = new Scanner(System.in);
         do {
             System.out.println("Press 1 to Display All Cars");
             System.out.println("Press 2 to Display All Cars of a particular Barand");
             System.out.println("Press 3 to Display All Cars of a particular Year");
             int option = sc.nextInt();
             switch (option) {
                 case 1:
                     System.out.println("================== All Cars are below==================");
                     getAllCars(l);
                     break;
                 case 2:
                     System.out.println("All Cars of a particular Brand");
                     getCarOfBrand(l);
                     break;
                 case 3:
                     System.out.println("All Cars of a particular  year");
                     getCarFromYear(l);
                     break;

                 default:
                     System.out.println("this is not a valid option!");
                     selectOption();
             }
         } while (true);
     }
     public void getAllCars(List<Car> l){
         for (Car x:l){
             System.out.println(x);
         }
     }
     public void getCarOfBrand(List<Car>l){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the Brand:");
         String brand=sc.nextLine();
         for (Car x:l){
             if (x.brand.equalsIgnoreCase(brand))
                 System.out.println(x);
         }
     }
     public void getCarFromYear(List<Car>l){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the Year:");
         int year=sc.nextInt();
         for (Car x:l){
             if (x.year==year){
                 System.out.println(x);
             }
         }

     }
}
