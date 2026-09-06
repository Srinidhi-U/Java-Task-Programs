public class Primesum {
    public static void main(String[] args) {
        int count=0;
        for(int num=2; count<10; num++) {
            int factors=0;
            for(int i=1; i<=num; i++) {
                if(num%i==0) {
                    factors++;
                }
            }
            if(factors==2) {
                System.out.println(num);
                count++;
            }
        }
    }
}
