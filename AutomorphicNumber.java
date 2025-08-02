public class AutomorphicNumber {
    public static void main(String[] args) {
        int num = 9376;
        int rem=0;
        int length=String.valueOf(num).length();
        while ((num>0)) {
             int s=num*num;
             rem=s%(int)Math.pow(10,length);
             break;
        }
        if (rem==num) {
            System.out.println(num+" is an Automorphic Number");
        }
        else{
            System.out.println(num+" is not an Automorphic Number");
        }
    }
}
