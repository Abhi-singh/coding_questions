import java.util.Date;
import java.util.Scanner;

public class Main {
    static public void main(String[] args){
        int [][] sol = {

                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                {0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                {0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1},
                {0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,1},
                {0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1},
                {0,1,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1},
                {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,9,0,0,1},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}

        };
        Code ob = new Code(sol);
        System.out.println(ob.getOutput(6,15));
        System.out.println();
        ob.display();
    }
}
