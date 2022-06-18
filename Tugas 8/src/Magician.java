import java.lang.*;
import java.util.*;

public class Magician extends Character{

    public double generateRandom(){
        double min = 0;
        double max = 10;
        double random = Math.floor(Math.random()*(max-min+1)+min);
        return random;
    }

    public boolean attack(){
        if (generateRandom() > 0 && generateRandom() <= 3.5){
            return true;
        }else {
            return false;
        }
    }
}