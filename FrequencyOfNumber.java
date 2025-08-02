public class FrequencyOfNumber {
    public static void main(String[] args) {
        int n=220143;
        int count=0;
        while(n>0){
            int r=n%10;
            if(r==4){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}
