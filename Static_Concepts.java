class Person
{
    int age;
    String name;
    static String phone;
    static String gender = "Female";

    public static void person_gender(Person p)
    {
        p.name = "Vasundhara";
        System.out.println(gender);
    }

    // it is always executed only once - when we create an object for the class
    // without a class object, this can be accessed - 
    static 
    {
        System.out.println("This is static block!");
    }
}

public class Static_Concepts 
{
    public static void main(String[] args) 
    {
        Person p1 = new Person();
        p1.name = "vasu";
        Person.phone = "Smartphone";  // static variables are always same. So same value will be assigned for p1 and p2 for phone variable!
        
        System.out.println(Person.phone); // p1.phone is replaced by Person.phone

        Person p2 = new Person(); // p2.phone is also replaced by Person.phone
        System.out.println(Person.phone); // outputs null because, only p1 has modified the phone value and not p2

        // instead of accessing a method with object, static method can be accessed via Class.method_name();
        Person.person_gender(p2);
        System.out.println(p2.name);

        Person.person_gender(p1);
        System.out.println(p1.name);; // also prints Vasundhara instead of vasu, because in the previous step, I am modifying it - in a static method!
    }
    
}
