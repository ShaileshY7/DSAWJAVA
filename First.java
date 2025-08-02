public class First {
    public static void main(String[] args) {
       int a=12345;
       int r;
       int ans=0;

       
       while (a>0) {
          r=a%10;
         ans=ans+r;
          a=a/10;
       }
       System.out.println(ans);

    }
}
