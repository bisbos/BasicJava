package dataStructures.tree;

import dataStructures.ConvertInfixToPostfix;

import java.util.Stack;
import java.util.regex.Pattern;

/***
 *    2 * 3 + 4 * 5
 *              +
 *       *              *
 *   2      3       4       5
 *
 *
 */
public class TreeArithmetic {

    private static Stack<Double> stack = new Stack<>();
    private static Pattern pattern = Pattern.compile("\\d+");

    Node root;

    public static void main(String[] args) {

       TreeArithmetic tree = new TreeArithmetic();
    /*   tree.root = new Node("+");
       tree.root.leftChild = new Node ("*");
       tree.root.rightChild = new Node(("*"));
       tree.root.leftChild.leftChild = new Node ("2");
       tree.root.leftChild.rightChild = new Node("3");
       tree.root.rightChild.leftChild = new Node("4");
       tree.root.rightChild.rightChild = new Node("5");
       tree.doCompute(tree.root); */
        String expression = "2*3+4*5";
        String postFixExpression = new ConvertInfixToPostfix().convertToPostFix(expression);
       Node root = constructTree(postFixExpression);
       doCompute(root);
       double result = stack.pop();
       System.out.println(result);
    }

    private static Node constructTree(String expression){
        char[] expressionArray = expression.toCharArray();
        Node t=null,t1,t2;
        Stack<Node> stack = new Stack<>();
        for (int i=0;i<expressionArray.length;i++){

            //if it is operand (number),create a new Node and push node to stack
            // if it is an operator, pop 2 values,
                if (! isOperator(String.valueOf(expressionArray[i]))){
                    t = new Node(String.valueOf(expressionArray[i]));
                    stack.push(t);
                }else{
                    t = new Node(String.valueOf(expressionArray[i]));
                    t1 = stack.pop();
                    t2 = stack.pop();

                    //Make them the right and left Node
                    t.leftChild = t1;
                    t.rightChild = t2;

                    stack.push(t);
                }
        }
        t= stack.pop();
        return t;
    }

    //Do Post Order traversal and compute results
    private static void doCompute(Node node){
        if (node !=null){
            doCompute(node.leftChild);
            doCompute(node.rightChild);

            //if it is operand (number), push it to stack
            // if it is an operator, pop 2 values, compute and push the result into stack
            if(!isOperator(node.value)){
                stack.push(Double.parseDouble(node.value));
            }else{
                double a = stack.pop();
                double b = stack.pop();
                double result = compute(node.value,a,b);
                stack.push(result);
            }
        }
    }

    //Method to check Sring is operator
    private static boolean isOperator(String in){
        if (! pattern.matcher(in).matches()){
            return true;
        }else {
            return false;
        }
    }

    //Method to do the operation
    private static double compute(String op,double a,double b){
        switch (op){
            case "+": return a+b;
            case "-": return a-b;
            case "*": return a*b;
            case "/": return a/b;
        }
        return -1;
    }
}
