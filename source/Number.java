import java.util.Random;

public class Number {

    int makeNoZero(){
        int num;
        long seed = System.currentTimeMillis();

        num = (int) (Math.random()* 10);

        if( num == 0)
            num = 8;
        System.out.println("makeNoz" + num );
        return num;
    }
    int makeAny(){
        int num;
        num = (int) (Math.random() *10);

        System.out.println("makeAny" + num );
        return num;
    }
    String makeDigit(int digit){
        if( digit == 1)
            return Integer.toString(makeNoZero());
        else if( digit == 2)
            return makeNoZero()+" "+makeAny();
        else
            return makeNoZero()+" "+makeAny()+" "+makeAny();
    }
}
