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
        long t = new Date().getTime();
        System.out.println(ob.getOutput(6,15));
        System.out.println();
        t-=new Date().getTime();
        ob.display();
        System.out.println("\ntime: "+t);
    }
}
