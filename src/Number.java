import java.util.Random;

public class Number {

    int makeNoneZero(){
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
    int makeDigit(int digit){
        if( digit == 1)
            return makeNoneZero();
        else if( digit == 2)
            return makeNoneZero()*10 + makeAny();
        else
            return makeNoneZero()*100 + makeAny()*10 + makeAny();
    }

}
