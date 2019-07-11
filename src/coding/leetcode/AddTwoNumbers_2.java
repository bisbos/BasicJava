package coding.leetcode;

import dataStructures.linkedlistEx.Link;

/**

 You are given two non-empty linked lists representing two non-negative integers.
 The digits are stored in reverse order and each of their nodes contain a single digit.
 Add the two numbers and return it as a linked list.

 You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 Example:

 Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 Output: 7 -> 0 -> 8
 Explanation: 342 + 465 = 807.

 */
public class AddTwoNumbers_2 {

    Link head;

    public static void main(String[] args) {

        AddTwoNumbers_2 obj = new AddTwoNumbers_2();
        obj.generateLinkFromNumber(243);
        obj.display();

        AddTwoNumbers_2 obj1 = new AddTwoNumbers_2();
        obj1.generateLinkFromNumber(564);
        obj1.display();

        AddTwoNumbers_2 obj3 = new AddTwoNumbers_2();
        int result  = obj3.addNumbersinList(obj,obj1);
        System.out.println(result);

    }

    public void createList(int element){
        Link newLink = new Link(element);
        if (head==null){
            head = newLink;
        }else{
            Link current = head;
            Link previous = head;
            while (current!=null){
                previous = current;
                current = current.next;
            }
            current = newLink;
            previous.next = current;
        }
    }

    public void generateLinkFromNumber(int number){

        while(number>0){
            int reminder = number %10;
            createList(reminder);
            number = number/10;
        }
    }

    public void display(){
        Link link = head;
        while (link!=null){
            System.out.print(link.element);
            link = link.next;
        }
        System.out.println();
    }

    public int addNumbersinList(AddTwoNumbers_2 obj,AddTwoNumbers_2 obj1){

        Link current1 = obj.head;
        Link current2 = obj1.head;

        int element1=0,element2=0,carry=0,sum=0;

        while (current1!=null || current2!=null){
            if (current1!=null) {
                element1 = current1.element;
                current1 = current1.next;
            }
            if (current2!=null){
                element2 = current2.element;
                current2 = current2.next;
            }
            int reminder = (element1+element2)%10;
            sum = (sum*10)+reminder+carry;
            carry = (element1+element2)/10;
        }
        return sum;

    }
}
