public class Lcm {
    public static void main(String[] args) {
        int a=12;
        int b=18;
        int big=a>=b?a:b;
        while(true){
            if(big%a==0 && big%b==0){
                System.out.println("LCM of "+ a +" and "+ b +" is "+ big);
                break;
            }
            big++;
        }
    }
    
}


