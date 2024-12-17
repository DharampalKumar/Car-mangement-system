package car_management_project;

public class Driver {
    public static void main(String[] args) {
        CarManager cm=new CarManager();
        Car c1=new Car("TATA",2020,469878.56,"Petrol","safari");
        cm.l.add(c1);
        cm.l.add(new Car( "Maruti",2021,400666.56,"Petrol","maruti800"));
        cm.l.add(new Car("Kia",2021,122666.56,"Petrol","seltos"));
        cm.l.add(new Car("honda",2021,142666.56,"Petrol","city"));
        cm.l.add(new Car("TATA",2021,122666.56,"Petrol","nexon"));
        cm.l.add(new Car("TATA",2021,452666.56,"diesel","nexon"));
        cm.l.add(new Car("Maruti",2021,122666.56,"cng","swift"));
        cm.selectOption();
    }
}
