public class SwapDandP {
    public static void main(String[] args) {
         int n=32145;
         int pos=0;
         int sum=0;
         while(n!=0){
            int digit=n%10;
            pos++;
            int pow=(int)Math.pow(10,digit-1);
            sum=sum+pos*pow;
            n=n/10;
         }
         System.out.println(sum);
        

    }
}
