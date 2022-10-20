package school.mjc.stage0.conditions.task1;

public class PositiveNumberDeterminer {
    public static void isPositive(int numberToBeDetermined) {
        if (numberToBeDetermined > 0){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static void main(String[] args){
        isPositive(-5);

    }
}
