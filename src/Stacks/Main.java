package Stacks;

public class Main {
    public static void main(String[] args) {
        String exampleString = "What the fudge.!";
        StringReverser reverser = new StringReverser();
        String reversedResult = reverser.reverse(exampleString);
        System.out.println(reversedResult);
    }
}
