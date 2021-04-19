package exercises;

import java.util.logging.Level;
import java.util.logging.Logger;

public class FactorialRecursion {

    private static final Logger LOGGER = Logger.getLogger( FactorialRecursion.class.getName() );

    static int factorialRecursion(int x){
            int result;
            if(x==0 || x==1)
                return 1;

            result = factorialRecursion(x-1) * x;
            LOGGER.log(Level.INFO, "X is: %s".formatted(result), "");
            return result;

    }


    public static void main(String[] args) {

        factorialRecursion(5);

    }
}
