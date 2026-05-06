import java.util.Random;
public class random_num {
    public static void main(String[] args) {
      
        Random random = new Random();

        int number = random.nextInt();
        System.out.println("Random Number: " + number);


        int number1 = random.nextInt(1, 6);
        System.out.println("random number:" + number1); //random num between 1 to 6


        boolean isHeads = random.nextBoolean();
        
        if(isHeads){
            System.out.println("HEADS");
        }
        else{
            System.out.println("TAILS");
        }
    }
}
