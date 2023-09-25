/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayqueue;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class ArrayQueue {

    
    public static void main(String[] args) throws Exception{
        int choice;
        int x, k;
        Scanner sc = new Scanner(System.in);
        MyArrayQueue q = new MyArrayQueue();
        Integer X;
        while (true) {            
            System.out.println();
            System.out.println("1. Enqueue");
            System.out.println("2. View first");
            System.out.println("3. Dequeue");
            System.out.println("4. Display all elements of a queue");
            System.out.println("0. Exit");
            System.out.println("Please choose 0 --> 4");
            choice = sc.nextInt();
            if(choice == 0){
                break;
            } switch (choice){
                case 1:
                    System.out.println("Enter the value to be enqueued: ");
                    x = sc.nextInt();
                    X = new Integer(x);
                    q.enqueue(X);
                    break;
                case 2:
                    System.out.println("The element at the front is: " + q.front());
                    break;
                case 3:
                    System.out.println("The element dequeued is: " + q.dequeue());
                    break;
                case 4:
                    q.displayAll();
                    break;
            }
            
            
        }
    }
    
}
