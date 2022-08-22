/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stackexample;

/**
 *
 * @author tiegancozzie
 */
public class ArrayStack {
    
    private int stack[];
    private int top;
    
    ArrayStack(){
        stack =new int[2];
        top=-1;
    }
    public boolean full(){
        return top==stack.length-1;
    }
    
    public void push(int temp){
        if(full()){
            int second[]=new int[stack.length*2];
            for(var i=0;i<stack.length;i++){
                second[i]=stack[i];
            }
            stack=second;
            System.out.println("Stack doubled to "+stack.length);
        }
        top++;
        stack[top]=temp;
    }
    
    public int pop(){
        if(!isEmpty()){
            int temp=stack[top];
            top--;
            return temp;
        }else{
            System.out.println("Stack is empty");
            return -1;
        }
    }
    
    public boolean isEmpty(){
        if(top==-1){
            return true;
        }
        return false;
    }

    public int peek(){
        return stack[top];
    }
    
    public void print(){
        for(var i=0;i<top+1;i++){
            System.out.println(stack[i]);
        }
        System.out.println("Length: "+ stack.length);
        System.out.println("********************");
    }
    
}
