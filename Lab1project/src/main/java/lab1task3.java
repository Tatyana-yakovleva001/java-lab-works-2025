import java.lang.Math;


public class lab1task3 {
    public static void main(String[] args) {

        double[] points = {-1, -0,5,  0, 0 , 0.5, 1, 2, 3, 4, 5};

        System.out.println("x           Y(x)           F(x)");
        System.out.println("------------------------------");

        double[] xValues = {-2, -1, 0, 1, 2, 3, 4, 6};

        for(double x : xValues){
            double y = Y(x);
            double f = F(x);
            System.out.printf("%-7.1f %-18.6f %-18.6f%n", x, y, f);
        }
    }


    public static double Y ( double x){
        if(x <= 0){
            return( 1 -x * x + Math.tan(8 + x)) / (1 +Math.pow(3, x));

        } else if (x <= 3) {
            return Math.exp(2 * x - 1);
        }
        else{
            return Math.atan(2 * x + 1);
        }
    }

    public static double F(double x){
        if(x <= 0){
            return x * x - Math.sin(4 * x);

        } else if (x <= 3){
            return Math.exp( -x);


        } else {
            return Math.sqrt(x);
        }

    }


}
