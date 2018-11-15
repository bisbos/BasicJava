package dataStructures.tree;

import java.util.regex.Pattern;

/**
 *             +
 *        *         -
 *
 * 5         4   100  20
 */
public class TreeEvaluateExpression {

    Node root;
    Pattern pattern = Pattern.compile("\\d+");

    public static void main(String[] args) {

        TreeEvaluateExpression tree = new TreeEvaluateExpression();
        tree.root = new Node("+");
        tree.root.leftChild = new Node("*");
        tree.root.leftChild.leftChild = new Node("5");
        tree.root.leftChild.rightChild = new Node("4");
        tree.root.rightChild = new Node("-");
        tree.root.rightChild.leftChild = new Node("100");
        tree.root.rightChild.rightChild = new Node("20");

        System.out.println(tree.evaluate(tree.root));

    }

    public Integer evaluate(Node node){
        if (node==null)
            return 0;
        if (node.leftChild==null&& node.rightChild==null)
            return Integer.parseInt(node.value);

        Integer val1 = evaluate(node.leftChild);
        Integer val2  = evaluate(node.rightChild);

        if (node.value=="+"){
            return val1 + val2;
        }
        else if (node.value=="-"){
            return val1 - val2;
        }
        else if (node.value=="*"){
            return val1 * val2;
        }
       else {
            return val1 / val2;
        }



    }

    private boolean isOperator(String value){
        if (pattern.matcher(value).matches()){
            return false;
        }
        return true;
    }
}
