package dataStructures;

import java.util.Stack;

public class ConvertInfixToPostfix {

    Stack stack = new Stack();
    String output = new String();
    public static void main(String[] args) {

        String expression = "2*3+4*5";
        System.out.println(new ConvertInfixToPostfix().convertToPostFix(expression));

    }

    public String convertToPostFix(String expression){

        for (int i=0;i<expression.length();i++){
            char ch = expression.charAt(i);
            switch (ch) {
                case '+':
                case '-':
                    getOperator(ch, 1);
                    break;
                case '*':
                case '/':
                    getOperator(ch, 2);
                    break;
                case '(':
                    stack.push(ch);
                    break;
                case ')':
                    getParenthesis(ch);
                    break;
                default:
                    output = output + ch;
                    break;
            }
        }
            while (!stack.isEmpty()){
                output = output + stack.pop();

        }
        return output;
    }

    private void getOperator(char ch,int prec){
        while (!stack.isEmpty()){
            char opTop = (char) stack.pop();
            if (opTop=='('){
                stack.push(ch);
                break;
            }else {
                int opTopPrec=Integer.MIN_VALUE;
                if (opTop=='+'|| opTop=='-'){
                    opTopPrec =1;
                }
                if (opTop=='*'|| opTop=='/'){
                    opTopPrec =2;
                }

                if (opTopPrec>prec){
                    output = output+opTop;
                }else{
                    stack.push(opTop);
                    break;
                }
            }
        }
        stack.push(ch);

    }

    private void getParenthesis(char ch){
            while (!stack.isEmpty()){
                char chx = (char)stack.pop();
                if (chx =='('){
                   break;
                }else{
                    output = output+chx;
                }
            }
    }
}
