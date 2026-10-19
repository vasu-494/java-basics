package inheritance_temp;

public class CarInheritance 
{
    public static void main(String[] args) 
    {
        TataCars car1 = new TataCars();
        TataCars car2 = new TataCars("Tata", "Punch"); 

        // print details of two Cars 
        System.out.println(car1.getCarBrand() + " : " + car1.getCarModel()); // Tata : Nexon
        System.out.println(car2.getCarBrand() + " : " + car2.getCarModel()); // Tata : Punch

        // access parent method of parent class - from Class Vehicle
        System.out.println("1st Vehicle Type: " + car1.car());
        System.out.println("2nd Vehicle Type: " + car2.car());

        // access parent method - from Class Cars
        System.out.println("1st Car Type : " + car1.hatchBack());
        System.out.println("2nd Car Type : " + car2.suv());

        
    }

}
