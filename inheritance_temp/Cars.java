package inheritance_temp;

public class Cars extends Vehicle
{
    private String carType;

    public String sedan()
    {
        carType = "Sedan";
        return carType;
    }

    public String hatchBack()
    {
        carType = "Hatch Back";
        return carType;
    }

    public String suv()
    {
        carType = "SUV";
        return carType;
    }
}
