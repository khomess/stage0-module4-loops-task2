package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        double x;
        int y = 0;
        if(power>0){
            while(power>=y){
                x = Math.pow(2, y);
                System.out.println((int)x);
                y++;
            }
        } else if(power == 0){
            System.out.println(1);
        } else{
            System.out.println("too much power");
        }
    }
}
