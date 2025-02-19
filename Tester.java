import java.util.ArrayList;

public class Tester {
    public Tester(int target){
        MAX_PROGRESS = target;
    }

    private int MAX_PROGRESS;
    private ArrayList<Integer> result = new ArrayList<Integer>();

    public void run(){
        System.out.println("Instance is running [" + MAX_PROGRESS +"]");
        for(int x = 0;x <= MAX_PROGRESS;x++){

            boolean isPrime = Primes.isPrime(x);
//            System.out.println("<" + x + "> Result: " + isPrime);
            if (isPrime) {
                result.add(x);
            }

            if (x == MAX_PROGRESS) {
                System.out.println("Done! Result: ");

                for (int i = 0; i < result.size(); i++) {
                    System.out.println(result.get(i));
                }

            }
        }
    }

}
