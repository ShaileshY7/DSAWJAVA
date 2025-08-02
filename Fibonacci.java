public class Fibonacci {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int n=1;
        while(n<=10){
         System.out.println(a);
            int c=a+b;
             a=b;
             b=c;
            n++;
        }
        
    }
}
