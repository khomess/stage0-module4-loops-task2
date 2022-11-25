package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int x = 2;
        if(printToInclusive > 0){
            if(x >= 0 && printToInclusive > x){
                while(printToInclusive > x){
                    if((x == 2) || (x == 3) || (x == 5) ||((x % 2 != 0) && (x % 3 != 0) && (x % 5 != 0))){
                        System.out.println(x);
                        x++;
                    } else{
                        x++;
                    }
                }
            }
        }
    }
}
