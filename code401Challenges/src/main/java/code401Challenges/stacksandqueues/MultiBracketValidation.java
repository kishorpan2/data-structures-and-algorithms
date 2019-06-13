package code401Challenges.stacksandqueues;

public class MultiBracketValidation {

    protected static Stack stack = new Stack();

    public static boolean multiBracketValidation(String s){

        char[] array = s.toCharArray();

        for (char c : array){

            if (c == '(' || c =='{' || c=='[' || c ==')' || c=='}' || c==']'){
                if(c== '(' || c== '{'|| c=='['){
                    stack.push(c);

                }else if((c==')' && (char) stack.peek().value == '(') ||
                        (c == '}'&& (char) stack.peek().value =='{') ||
                        (c == ']' && (char) stack.peek().value =='[')){
                    stack.pop();

                } else{
                    return false;
                }
            }
        }
        if (stack.peek() == null){
            return true;
        }
        return false;
    }

}
