import java.util.Random;
public class DifferentMethods {
    Random random = new Random();
    public double mathFunction(double d){
        return d/10;
    }
    public double hardMathFunction(double d){
        return mathFunction(d)/10;
    }
    public boolean someIntsAreTrue(int i){
        switch (i){
            case 1: return true;
            case 2: return false;
            case 3: return true;
            case 4: return false;
            case 5: return true;
            default: return false;
        }
    }
    public String cutString(String s){
        if(s.length()>1){
            return s.substring(0,1);
        }else throw new ArrayIndexOutOfBoundsException("String length 1 or less symbols");
    }
}
