public class Task {
    public static void main(String[] args) {
        System.out.println("task1");
        System.out.println(convert(5));
        System.out.println(convert(3) );
        System.out.println(convert(8));
        System.err.println("----------------------");
        System.out.println("task2");
        System.out.println(fitCalc(15,1));
        System.out.println(fitCalc(24,2));
        System.out.println(fitCalc(41,3));
        System.err.println("----------------------");
        System.out.println("task3");
        System.out.println(containers(3,4,2));
        System.out.println(containers(5,0,2));
        System.out.println(containers(4, 1, 4));
        System.err.println("----------------------");
        System.out.println("task4");
        System.out.println(triangleType(5, 5, 5));
        System.out.println(triangleType(5, 4, 5));
        System.out.println(triangleType(3, 4, 5));
        System.out.println(triangleType(5, 1, 1));
        System.err.println("----------------------");
        System.out.println("task5");
        System.out.println(ternaryEvaluation(8, 4));
        System.out.println(ternaryEvaluation(1, 11));
        System.out.println(ternaryEvaluation(5, 9));
        System.err.println("----------------------");
        System.out.println("task6");
        System.out.println(howManyItems(22, 1.4, 2) );
        System.out.println(howManyItems(45, 1.8, 1.9));
        System.out.println(howManyItems(100, 2, 2) );
        System.err.println("----------------------");
        System.out.println("task7");
        System.out.println(factorial(3));
        System.out.println(factorial(5));
        System.out.println(factorial(7));
        System.err.println("----------------------");
        System.out.println("task8");
        System.out.println(gcd(48, 18));
        System.out.println(gcd(52, 8));
        System.out.println(gcd(259, 28));
        System.err.println("----------------------");
        System.out.println("task9");
        System.out.println(ticketSaler(70, 1500));
        System.out.println(ticketSaler(24, 950));
        System.out.println(ticketSaler(53, 1250) );
        System.err.println("----------------------");
        System.out.println("task10");
        System.out.println(tables(5, 2));
        System.out.println(tables(31, 20));
        System.out.println(tables(123, 58));
    }

    public static double convert(float n) {
        return 3.78541 * n;
    }

    public static int fitCalc(int x, int y) {
        return x*y;
    }

    public static int containers(int x, int y, int z) {
        return x*20 + y*50 + z*100;
    }

    public static String triangleType(int x, int y, int z) {
        if (x+y == z || x+z <= y || z+y <= x) {
            return "not a triangle";
        }

        if (x==y && x==z){
            return "isosceles";
        }
                
        if (x==y || y==z || x==z) {
            return "equilateral";
        }

        return "different-sided";
    }

    public static int ternaryEvaluation(int x, int y) {
        return (x > y) ? x : y;
    }

    public static int howManyItems(double x, double y, double z) {
        int howMany = 0;
        if (x > y*z){
            howMany = (int) ((x/2) / (y*z));
        }
        return howMany;
    }

    public static int factorial(int x) {
        int factorial = 1;
        for(int i = 2; i<=x; i++){
            factorial *= i;
        }
        return factorial;
    }

    public static int gcd(int x, int y){
        while(x!=0 && y!=0){
            if (x>y) x=x%y;
            else y=y%x;
        }
        return x+y;
    }

    public static int ticketSaler(int x, int y) {
        return (int)((x*y)*0.72);
    }

    public static int tables(int x, int y){
        int missingPlaces = (x+1)/2;
        return (missingPlaces>y) ? missingPlaces - y : 0;
    }
}


