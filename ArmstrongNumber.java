public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 93084;
        int sum = 0;
        int n=num;
        int l=String.valueOf(n).length();
        while(n>0){
            int r=n%10;
            sum=sum+(int)Math.pow(r,l);
            n=n/10;
        }
        if(sum==num){
            System.out.println(num+" is an Armstrong number");
        }
        else{
            System.out.println(num+" is not an Armstrong number");
        }
    }
}
