import java.util.Scanner;

class StackNode {

    // Moved class fields to top. Changed underneath to oldNode
    public StackNode oldNode;
    public double data;

    public StackNode(double data, StackNode oldNode) {
        this.data = data;
        this.oldNode = oldNode;
    }
}

class RPN {

    // Moved class fields to top. Changed top to topNode
    private String command;
    private StackNode topNode;

    // Moved constructor above methods
    public RPN(String command) {
        topNode = null;
        this.command = command;
    }

    public void push(double new_data) {
        StackNode new_node = new StackNode(new_data, topNode);
        topNode = new_node;
    }

    public double pop( ) {
        double top_data = topNode.data;
        topNode = topNode.oldNode;
        return top_data;
    }

    public double get( ) {
        //Changed a and b to num1 and num2
        double num1, num2;
        int j;

        for(int CommandIndex = 0; CommandIndex < command.length( ); CommandIndex++) {
            // if it's a digit
            if(Character.isDigit(command.charAt(CommandIndex))) {
                double number;

            // get a string of the number
            String temp = "";

            for(j = 0; (j < 100) && (Character.isDigit(command.charAt(CommandIndex)) ||
                    (command.charAt(CommandIndex) == '.')); j++, CommandIndex++) {
                    temp = temp + (command.charAt(CommandIndex));
                }

            // convert to double and add to the stack
            number = Double.parseDouble(temp);
            push(number);
}
            else if(command.charAt(CommandIndex) == '+') {
                num2 = pop( );
                num1 = pop( );
                push(num1 + num2);
}
            else if(command.charAt(CommandIndex) == '-') {
                num2 = pop( );
                num1 = pop( );
                push(num1 - num2);
}
            else if(command.charAt(CommandIndex) == '*') {
                num2 = pop( );
                num1 = pop( );
                push(num1 * num2);
}
            else if(command.charAt(CommandIndex) == '/') {
                num2 = pop( );
                num1 = pop( );
                push(num1 / num2);
}
            else if(command.charAt(CommandIndex) == '^') {
                num2 = pop( );
                num1 = pop( );
                push(Math.pow(num1, num2));
}
            else if(command.charAt(CommandIndex) != ' ') {
                throw new IllegalArgumentException();
            }
        }
        double val = pop( );
        if(topNode != null) {
            throw new IllegalArgumentException( );
        }

        return val;
}

/* main method */
public static void main(String[] args) {
    while (true) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter RPN expression or \"quit\" :");
        String line = in.nextLine();

        if (line.equals("quit")) {
            break;
        } else {
            RPN calc = new RPN(line);
            System.out.printf("Answer is %.2f\n", calc.get());
        }
    }
}
}