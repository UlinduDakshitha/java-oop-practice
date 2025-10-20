import java.util.Scanner;
public class Employee2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee[] employees = new Employee[5];


        for (int i = 0; i < 5; i++) {
            System.out.print("Enter your Nic");
            String employeeNic = sc.next();

            System.out.print("Enter your name");
            String employeeName = sc.next();

            System.out.print("Enter your age");
            int employeeAge = sc.nextInt();

            System.out.print("Enter your address");
            String employeeAddress = sc.next();

            System.out.print("Enter your salary");
            double employeeSalary = sc.nextDouble();

            Employee employee = new Employee();

            employee.nic = employeeNic;
            employee.name = employeeName;
            employee.age = employeeAge;
            employee.address = employeeAddress;
            employee.salary = employeeSalary;

            employees[i]=employee;

        }



        int newCount=moreThan(employees);
        System.out.println(newCount);

        double newMax=maxName(employees);
        System.out.println(newMax);

        Employee newNic=getNic(employees,sc);
        System.out.println(newNic);

        System.out.print("Enter percentage");
        double percantage=sc.nextInt();
        employees=incrementSalary(employees,percantage);

        //static variable
        Employee std1=new Employee();
        std1.age=23;

        Employee std2=new Employee();
        System.out.println(std2.age);// ---23 print




    }


    public static int moreThan(Employee[] ar) {
        int count = 0;
        for (int i = 0; i < 5; i++) {
            if(ar[i].salary>75000){
                count++;
            }
        }
        return count;
    }

    public static double maxName(Employee[] ar2){
        int index=0;
        double maxsalary=ar2[0].salary;

        for(int i=0;i<5;i++){
            if(ar2[i].salary>maxsalary){
                maxsalary= ar2[i].salary;
                index=i;
            }
        }
        return index;
    }

    public static Employee getNic(Employee[] ar3,Scanner sc){
        String nic=sc.next();
        int index2=0;

        for(int i=0;i<5;i++){
            if(ar3[i].nic==nic){
                index2=i;
            }
        }
        return ar3[index2];
    }
    public static Employee[] incrementSalary(Employee [] ar4,double percetageSalary){

        for (int i = 0; i < 5; i++) {
            ar4[i].salary+=ar4[i].salary*percetageSalary;
        }
        return ar4;
    }




}
