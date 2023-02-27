package org.example.seminar4.cw;

public class Zadanie1 {
    public static void main(String[] args) {
        /**
         * Definition for singly-linked list.
         * public class ListNode {
         *     int val;
         *     ListNode next;
         *     ListNode() {}
         *     ListNode(int val) { this.val = val; }
         *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
         * }
         */
//        class Solution {
//            public ListNode reverseList(ListNode head) {
//                ListNode pred = null; // нет никакой ссылки
//                ListNode current = head; // начинаем с первого элемента
//                while (current != null) {
//                    ListNode nextElem = current.next;
//                    current.next = pred;
//                    pred = current;
//                    current = nextElem;
//                }
//                return pred;
//            }
//        }
    }
    // второй вариант, через фейковый элемент
    /*
    * class Solution {
public ListNode reverseList(ListNode head) {
ListNode current = head;
ListNode nextNode = null;
while(current != null){
ListNode node = new ListNode(current.val);
node.next = nextNode;
nextNode = node;
current = current.next;
}
return nextNode;
}*/

}
