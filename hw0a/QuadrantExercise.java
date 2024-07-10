public class QuadrantExercise {

    static int quadrant(double x, double y) {
        if(x == 0.0 || y == 0.0) {
            return 0;
        } else if(x > 0.0 && y > 0.0){
            return 1;
        } else if (x < 0.0 && y > 0.0) {
            return 2;
        } else if (x < 0.0 && y < 0.0) {
            return 3;
        } else{
            return 4;
        }
    }
    
    public static void main(String[] args) {
        System.out.println(quadrant(1.3, 2.4));
        System.out.println(quadrant(-1.3, 4.6));
        System.out.println(quadrant(-3.6, -6.9));
        System.out.println(quadrant(5.7, -9.3));
    }
}
