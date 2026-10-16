class Human
{
    private String name;
    private int age;

    // set the name
    public void setName(String n)
    {
        name = n;
    }

    // set the age 
    public void setAge(int a)
    {
        age = a;
    }

    // retrieve the name
    public String getName()
    {
        return name;
    }

    // retrieve the age
    public int getAge()
    {
        return age;
    }
}


public class Encapsulation 
{
    public static void main(String[] args) 
    {
        Human me = new Human();

        // input the values of name and age
        me.setName("Vasu");
        me.setAge(24);

        // retrieve the age of name and age
        System.out.println("Name: " + me.getName());
        System.out.println("Age: " + me.getAge());

    }   
}
