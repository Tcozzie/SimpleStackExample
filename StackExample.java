/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stackexample;

/**
 *
 * @author tiegancozzie
 */
public class StackExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack();
       
        
        stack.pop();

        for(int i = 0; i< 8; i++){
            stack.push(i);
        }

       stack.push(98);
       stack.push(99);
       stack.print();

       System.out.println("peek " + stack.peek());

       System.out.println("Removing : " + stack.pop());
       System.out.println("Removing : " + stack.pop());
       stack.push(100);
       stack.print();
       System.out.println("@@@@@@Peaking " + stack.peek());
       System.out.println("******Removing " + stack.pop());
       System.out.println("******Removing " + stack.pop());
       stack.print();

       for(int i = 10; i< 20; i++){
           stack.push(i);
       }
       stack.print();

       while(!stack.isEmpty())
           System.out.println("******Removing " + stack.pop());
       stack.print();      
  
    }
    
    
}