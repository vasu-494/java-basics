package telusko;

class A
{
    public int add(int n1, int n2)
    {
        return n1 + n2;
    }
}

class B extends A
{
    public int add(int n1, int n2)
    {
        return (n1 + n2)*10;
    }
}

class C extends A
{

}

public class Method_Overriding 
{
    public static void main(String[] args) 
    {
        B obj1 = new B();
        int r1 = obj1.add(4,5); // will return (n1+n2)*10 => (4+5)*10 = 90
        System.out.println("Add with class B object = " + r1);

        C obj2 = new C();
        int r2 = obj2.add(4,5); // will return (n1+n2) => 4+5 = 9
        System.out.println("Add with class C object = " + r2);
    }    
}
