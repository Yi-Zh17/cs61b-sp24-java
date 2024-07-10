public class PrintIndexedExercise {

    public static void printIndexed(String name) {
        for(int index = 0; index < name.length(); ++index){
            // Print each character
            System.out.print(name.charAt(index));
            // Print index in reverse order
            System.out.print(name.length() - index - 1);
        }
    }
    public static void main(String[] args) {
        printIndexed("ZELDA");
    }
}
