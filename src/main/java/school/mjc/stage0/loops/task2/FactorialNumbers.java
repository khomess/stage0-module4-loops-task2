package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int x = 1;
        int y = 1;
        if(printToInclusive>0){
            System.out.println(1);
            while(printToInclusive>=y){
                x = x * y;
                System.out.println(x);
                y++;
            }
        } else {
            System.out.println(1);
        }
    }
}
