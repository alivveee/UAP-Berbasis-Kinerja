import java.util.*;

public class Healer extends Character{

    public double generateRandom(){
        double min = 0;
        double max = 10;
        double random = Math.floor(Math.random()*(max-min+1)+min);
        return random;
    }

    public boolean attack(){
        if (generateRandom() > 0 && generateRandom() <= 8.5){
            return true;
        }else {
            return false;
        }
    }

    public void heal(){
        setHP(getHP() + 25);
    }
}