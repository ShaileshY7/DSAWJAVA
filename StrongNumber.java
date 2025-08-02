public class StrongNumber{
    public static void main(String[] args) {
      int n=40585;
      int sum=0;
      int temp=n;
      while(temp>0){
        int rem=temp%10;
        sum=sum+factorial(rem);
        temp=temp/10;
      }
      if(sum==n){
        System.out.println(n+" is a strong number");
      }
      else{
        System.out.println(n+" is not a strong number");
      }
    }
    static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }

}