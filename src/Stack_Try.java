import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Stack;

public class Stack_Try {
    //push add an element on the top of the stack
    public static void push_stack (Stack<Integer> stack)
    { System.out.println("PUSH");
       for(int i = 0 ; i <3; i++)
       {
           stack.push(i);
       }
    }
    //pop remove the element from the top of the stack
      public static void pop_stack(Stack<Integer> stack)
      {
          System.out.println("Pop");
          System.out.println(stack.pop());
      }
    //peek returns the element on the top but does not remove it
    public static void display_firstElement(Stack<Integer> stack)
    {
        System.out.println(stack.peek());
    }
    //search determine whether an object exists in the stack or not if found it returns the position else it returns -1
    public static void search_element(Stack<Integer> stack , Object o)
    {
        Integer found = stack.search(o);
        if(found!= -1) System.out.println("Element found on the position "+found);
        else System.out.println("Element not found");
    }
    //empty returns true if there is nothing on the top of the stack else it returns false
    public static void is_Empty(Stack<Integer> stack)
    {
        if(stack.empty()) System.out.println("the top is empty");
        else
            System.out.println("the top is not empty");
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        push_stack(stack);
        pop_stack(stack);
        display_firstElement(stack);
        search_element(stack,0);
        search_element(stack,10);
        is_Empty(stack);
    }


}
