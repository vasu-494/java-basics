class Person
{
    private String name;
    private int age;

    // set the name
    public void setName(String name)
    {
        this.name = name; // this.name -> current object.name = me.name
    }

    // set the age 
    public void setAge(int age)
    {
        this.age = age; // this.age -> current object.age = me.age
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


public class This_Keyword 
{   
    public static void main(String[] args) 
    {
        Person me = new Person();

        // input the values of name and age
        me.setName("Vasu");
        me.setAge(24);

        // retrieve the age of name and age
        System.out.println("Name: " + me.getName());
        System.out.println("Age: " + me.getAge());
    }
    
}
