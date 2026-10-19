package Inheritance;

class TataCars extends Cars
{
    private String brand;
    private String model;

    public TataCars()
    {
        brand = "Tata";
        model = "Nexon";
    }

    public TataCars(String brand, String model)
    {
        this.brand = brand ;
        this.model = model;
    }

    public String getCarBrand()
    {
        return brand;
    }

    public String getCarModel()
    {
        return model;
    }
}

