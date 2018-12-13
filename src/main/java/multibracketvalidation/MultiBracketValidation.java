package multibracketvalidation;

import StacksAndQueues.Stack;

public class MultiBracketValidation {

    protected static Stack open = new Stack();

    public static boolean multiBracketValidation(String s) {

        char[] array = s.toCharArray();

        for (char c : array){
            if (c == '(' || c == '{' || c == '[' || c == ')' || c == '}' || c == ']' ) {
                if (c == '(' || c == '{' || c == '[') {
                    open.push(c);
                } else if ((c == ')' && (char) open.peek().data == '(') ||
                        (c == '}' && (char) open.peek().data == '{') ||
                        (c == ']' && (char) open.peek().data == '[')) {
                    open.pop();
                } else {
                    return false;
                }
            }
        }
        if (open.peek() == null){
            return true;
        }
        return false;
    }
}
