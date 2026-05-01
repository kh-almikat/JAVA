import java.util.Scanner;

public class if_else {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.print("You are a student? (true/false): ");
        boolean isStudent = input.nextBoolean();

        //group-1
        if(name.isEmpty()){
            System.out.println("You did not enter a name");
        }
        else {
            System.out.println("Hello " + name);
        }



        //group-2
        if(age >= 18){
            System.out.println(name + ", You are an adult");
        }
        else {
            System.out.println(name + ", You are a minor");
        }



        //group-3
        if(isStudent){
            System.out.println(name + ", You are a student");
        }
        else {
            System.out.println(name + ", You are not a student");
        }
        

        input.close();
    }
}