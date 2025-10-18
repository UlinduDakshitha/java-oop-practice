import java.util.Scanner;
public class Hospital {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Patience[] patiences=new Patience[5];


        for(int i=0; i<5;i++){
            System.out.println("Enter name");
            String patientName=sc.next();

            System.out.println("enter age");
            int patientAge=sc.nextInt();

            System.out.println("enter addres");
            String patienceAddres=sc.next();

            Patience patience=new Patience();
            patience.name =patientName;
            patience.age=patientAge;
            patience.address=patienceAddres;
            checkAge(patiences);

        }


    }

    public static void checkAge(Patience[] ar){
        int count=0;
        for(int i=0;i<5;i++){
            if(ar[i].age>13&& ar[i].age<19)
                count++;

        }
        System.out.println(count);

    }
}

