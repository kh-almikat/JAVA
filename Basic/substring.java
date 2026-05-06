import java.util.Scanner;

public class substring {
    public static void main(String[] args) {

        // .substring() = A method used to extract a portion of a string
        //    variable_name.substring(start, end)

        Scanner scanner = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.print("Enter your email: ");

        email = scanner.nextLine(); //main string input

        if (email.contains("@")) 
        {
            username = email.substring(0, email.indexOf("@")); //substring

            domain = email.substring(email.indexOf("@") + 1); //substring

            System.out.println(username);
            System.out.println(domain);
        }
        else 
        {
            System.out.println("Emails must contain @");
        }

        scanner.close();
    }
}