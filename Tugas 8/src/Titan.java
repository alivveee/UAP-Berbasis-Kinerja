import java.util.Random;

public class Titan extends Character{
    public double generateRandom(){
        double min = 0;
        double max = 10;
        double random = Math.floor(Math.random()*(max-min+1)+min);
        return random;
    }

    public boolean attack(){
        if (generateRandom() > 0 && generateRandom() <= 4){
            return true;
        }else {
            return false;
        }
    }
}