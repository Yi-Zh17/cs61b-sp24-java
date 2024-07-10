public class StarTriangle {
    public static void main(String[] args) {
        // Print "*" for num number of times
        for(int num = 1; num < 6; ++num){
            // Use a intermediate variable to count number of *s printed
            for(int times = num; times > 0; --times){
                System.out.print("*");
            }
            // Make a new line
            System.out.println();
        }
    }
}
