package dataStructures.tree;

public class Tree {
    Node root;

    public void insert(int element){
        Node newNode = new Node(element);
        if (root==null){
            root = newNode;
        }else{
            Node current = root;
            Node parent;
            while (true){
                parent = current;
                if (element<current.element){
                    current = current.leftChild;
                    if (null==current){
                        parent.leftChild = newNode;
                        break;
                    }

                }else if (element>current.element){
                   parent = current;
                   current = current.rightChild;
                    if (null==current){
                        parent.rightChild = newNode;
                        break;
                    }
                }

            }
        }
    }

    public Node getSuccessorNode(Node nodeToDelete){
        Node successorParent = nodeToDelete;
        Node successor = nodeToDelete;
        Node current = nodeToDelete.rightChild;
        while (current!=null){
            successorParent = successor;
            successor = current;
            current = current.leftChild;
        }
        if (successor!=nodeToDelete.rightChild){

        }
        return successor;
    }

    public boolean deleteNode(int element){
        Node parent = root;
        Node current = root;
        boolean isLeftChild = false;
        while (element!=current.element){
            parent = current;
            if (element<current.element){
                current = current.leftChild;
                isLeftChild = true;
            }else {
                current = current.rightChild;
                isLeftChild = false;
            }
        }

        if (null==current){
            return false;
        }else{
            if (current.rightChild==null && current.leftChild==null){
                if (current==root){
                    root = null;
                }
                else if (isLeftChild){
                    parent.leftChild = null;
                }else {
                    parent.rightChild = null;
                }
            }else  if (current.rightChild==null){
                if (current==root){
                    root = current.leftChild;
                }
                if (isLeftChild){
                    parent.leftChild = current.leftChild;
                }else {
                    parent.rightChild = current.leftChild;
                }
            }else if (current.leftChild==null){
                if (current==root){
                    root = current.rightChild;
                }
                if (isLeftChild){
                    parent.leftChild = current.rightChild;
                }else {
                    parent.rightChild = current.rightChild;
                }
            }else{
                Node successor = getSuccessorNode(current);

            }
        }
        return true;
    }

    public void inOrderTraversal(Node current){
        if (null!=current){
            inOrderTraversal(current.leftChild);
            System.out.println(current.element);
            inOrderTraversal(current.rightChild);
        }
    }

    public void preOrderTraversal(Node current){
        if (null!=current){
            System.out.println(current.element);
            preOrderTraversal(current.leftChild);
            preOrderTraversal(current.rightChild);
        }
    }

    public void postOrderTraversal(Node current){
        if (null!=current){
            postOrderTraversal(current.leftChild);
            postOrderTraversal(current.rightChild);
            System.out.println(current.element);
        }
    }

    public int findMaximumValue(){
        return 0;
    }

    public int findMinimumValue(){
        return 0;
    }

 /*   public void deleteNode(int element){
        Link current = root;
        boolean isLeftChild = false;
        Link previous = root;
       while (current.element!=element){
           if (element<current.element){
               isLeftChild = true;
               previous = current;
               current = current.leftChild;
           }else {
               previous = current;
               current = current.rightChild;
           }
       }
       //If there are no child nodes
       if (current.rightChild==null && current.leftChild==null){
           if (current==root){
               root =null;
           }
           else if (isLeftChild){
               previous.leftChild = null;
           }else {
               previous.rightChild = null;
           }
       } // If there is a right child node or left child node, set parents left child node or right node to child's node
       else if (current.rightChild!=null){
           if (current==root){
               root =null;
           }else if (isLeftChild) {
               previous.leftChild = current.rightChild;
               current.rightChild = null;
           }else {
               previous.rightChild = current.rightChild;
               current.rightChild =null;
           }
       }else if (current.leftChild!=null){
           if (current==root){
               root =null;
           }else if (isLeftChild){
               previous.leftChild = current.leftChild;
               current.leftChild = null;
           }else {
               previous.rightChild = current.leftChild;
               current.leftChild = null;
           }
       }
    } */
}
