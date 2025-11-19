package Day12Training;

import java.util.ArrayList;

class Stack<T>{
    ArrayList<T>data= new ArrayList<>();
    int top=-1;

    public void push(T element){}
    public T peek(){
        return data.get(top);
    }
    public  void poll(T element){
        return ;
    }// delete and return the top element




}

public class StackTest {
    public static void main(String[] args) {
       java.util.Stack s = new java.util.Stack();
        s.push(Integer.valueOf(10));
        s.push(Integer.valueOf(20));
        s.push(Integer.valueOf(30));
        s.push(Integer.valueOf(50));

    for (int i = 0;i<s.size();i++)
        System.out.println(s.peek());


    }
}
