public class math {
   public static void main(String[] args) {

       System.out.println(Math.PI); //prints the value of pi
       System.out.println(Math.E); //prints the value of e

      

       double result = Math.pow(3, 4);
       double result1 = Math.abs(-5);
       double result2 = Math.sqrt(16);
       double result3 = Math.round(3.14); //rounds to the nearest number-3
       double result4 = Math.ceil(3.14); //rounds up to the nearest number-4
       double result5 = Math.floor(3.14); //rounds down to the nearest num-3
       double result6 = Math.max(10, 20);
       double result7 = Math.min(10, 20);

       System.out.println("pow: " + result);
       System.out.println("abs: " + result1);
       System.out.println("sqrt: " + result2);
       System.out.println("round: " + result3);
       System.out.println("ceil: " + result4);
       System.out.println("floor: " + result5);
       System.out.println("max: " + result6);
       System.out.println("min: " + result7);

   }
}