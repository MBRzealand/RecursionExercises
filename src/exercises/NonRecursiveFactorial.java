package exercises;

import java.util.logging.Level;
import java.util.logging.Logger;

public class NonRecursiveFactorial {

    private static final Logger LOGGER = Logger.getLogger( NonRecursiveFactorial.class.getName() );

    static int factorial(int x){

        int result = 1;

        if(x==0 || x==1) {
            LOGGER.log(Level.INFO, "result is: %s".formatted(result), "");
            return result;
        } else if (x>1){
            for (int factor = 2; factor <= x; factor++) {
                result *= factor;
            }
        } else {
            throw new IllegalArgumentException("Only defined for positive integers");
        }

        LOGGER.log(Level.INFO, "result is: %s".formatted(result), "");
        return result;
    }



    public static void main(String[] args) {
        factorial(8);
    }


}
