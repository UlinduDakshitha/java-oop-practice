
public class Test1 {
    String name;
    String address;
    boolean isSmoke;
    double salary;

    //instance block
    {
        name=null;
        address=null;
        isSmoke=false;
        salary=0.0;
        System.out.println("Instance block");
    }

    //static block

    static{
        System.out.println("Static block");
    }

    public Test1(String name, String address, boolean isSmoke, double salary) {
        this.name = name;
        this. address =  address;
        this. isSmoke =   isSmoke;
        this. salary =  salary;

    }
}