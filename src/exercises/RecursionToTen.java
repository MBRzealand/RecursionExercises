package exercises;

import java.util.logging.Level;
import java.util.logging.Logger;

public class RecursionToTen {

    private static final Logger LOGGER = Logger.getLogger( RecursionToTen.class.getName() );

    static void recursionToTen(int x){
        if (x == 10) return;
        x+=1;
        LOGGER.log(Level.INFO, "X is: %s".formatted(x), "");
        recursionToTen(x);
    }


    public static void main(String[] args) {

        recursionToTen(0);

    }
}
