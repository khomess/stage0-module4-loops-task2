package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int x = 0;
        int y = 0;
        if(multiplyByAndToInclusive>0){
            while (x<=multiplyByAndToInclusive) {
                y = x * multiplyByAndToInclusive;
                System.out.println(y);
                x++;
            }
        } else if(multiplyByAndToInclusive<0){
            while (x>=multiplyByAndToInclusive) {
                y = -x * multiplyByAndToInclusive;
                System.out.println(y);
                x--;
            }
        } else {

        }
    }
}
