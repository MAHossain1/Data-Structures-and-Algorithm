package Stacks;

public class Main {
    public static void main(String[] args) {


        // Implement basic stack operations with error handling and array initialization
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());


        // String reverser
        String exampleString = "What the fudge.!";
        StringReverser reverser = new StringReverser();
        String reversedResult = reverser.reverse(exampleString);
        System.out.println(reversedResult);
    }
}
