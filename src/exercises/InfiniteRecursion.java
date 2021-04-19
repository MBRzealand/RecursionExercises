package exercises;

import java.util.logging.Level;
import java.util.logging.Logger;

public class InfiniteRecursion {

    private static final Logger LOGGER = Logger.getLogger( InfiniteRecursion.class.getName() );

    static void infiniteRecursion(int x){
        x=x+1;
        LOGGER.log(Level.INFO, "X is: %s".formatted(x), "");
        infiniteRecursion(x);
    }


    public static void main(String[] args) {

        infiniteRecursion(1);

    }
}
