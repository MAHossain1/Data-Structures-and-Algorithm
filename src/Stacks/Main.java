package Stacks;

public class Main {
    public static void main(String[] args) {

        String balanceCheckExample = "{[( a + b )]}";

        RefactorExpression expression = new RefactorExpression();
        boolean result = expression.isBalanced(balanceCheckExample);
        System.out.println(result);


//        Expression expression = new Expression();
//        boolean result = expression.isBalanced(balanceCheckExample);
//        System.out.println(result);



        // Implement basic stack operations with error handling and array initialization
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack); // result: [10, 20, 30]
        System.out.println(stack.pop()); // result 30
        System.out.println(stack.peek()); // result: 20
        System.out.println(stack.isEmpty()); // result: false


        // String reverser
        String exampleString = "What the fudge.!";
        StringReverser reverser = new StringReverser();
        String reversedResult = reverser.reverse(exampleString);
        System.out.println(reversedResult);
    }
}
