public class Primes {
    private Primes(){

    }

    public static boolean isPrime(int n) {
        return Logic(n);
    }

    private static boolean Logic(int n){

        if(n < 2) return false;

        double d = Math.sqrt(n);
        for(int i = 2; i <= d; i++){
            if(n % i == 0) return false;
        }

        return true;

    }
}
