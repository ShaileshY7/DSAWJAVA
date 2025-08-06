public class AutomorphicNumber {
    public static void main(String[] args) {
              int num = 5;
              int length=String.valueOf(num).length();
              int s=num*num;
              int rem=s%(int)Math.pow(10,length);
       
          
       
         if (rem==num) {
            System.out.println(num+" is an Automorphic Number");
         }
         else{
            System.out.println(num+" is not an Automorphic Number");
         }
    }
}
