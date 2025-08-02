public class EvenAndOddPlacesum {
    public static void main(String[] args) {
        int n=736876;
        int sum1=0;
        int sum2=0;
       int pos=1;
        while(n>0){
                int digit=n%10;
                if(digit%2==0){
                    sum1=sum1+digit;
                }
                else{
                    sum2=sum2+digit;
                }
                n=n/10;
                pos++;
        }
        System.out.println("Sum of even places digits is "+sum1);
        System.out.println("Sum of odd places digits is "+sum2);
    }
}
