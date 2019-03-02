package CollectionsAssignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class SpecialStack {
    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> auxStack = new Stack<Integer>();
    final int MAXSIZE = 10;
    int minEle = 0;
    void pushEle(Integer n){
        int top;
        if(stack.size()<MAXSIZE){
            if(stack.isEmpty()){
                stack.push(n);
                auxStack.push(n);
                minEle = n;
            }
            else{
                stack.push(n);
                if(n<minEle){
                    minEle = n;
                }
                auxStack.push(minEle);
            }
        }
        else{
            System.out.println("Stack is full.");
        }
    }
    void popEle(){
        int popped;
        if(stack.size() == 0){
            System.out.println("The size is empty.");
        }
        else {
            popped = stack.pop();
            auxStack.pop();
            }
        
    }
    int getMin() {
        return auxStack.peek();
    }
    
    Boolean isEmptyStack(){
        return stack.isEmpty();
    }
}

public class Question7 {
    public static void main(String[] args) throws IOException {
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        int ch = 0;
        SpecialStack specialStack = new SpecialStack();
        while(ch != 5){
            System.out.print("1: Push\n2: Pop\n3: Minimum Element\n4: Is Empty\n5: Stop\n\nEnter your choice :: ");
            ch = Integer.parseInt(p.readLine());
            switch (ch){
                case 1:{
                    int n;
                    System.out.print("\n\nEnter a number :: ");
                    n = Integer.parseInt(p.readLine());
                    specialStack.pushEle(n);
                    break;
                }
                case 2:{
                    specialStack.popEle();
                    break;
                }
                case 3:{
                    System.out.println("Minimum Element is "+specialStack.getMin());
                    break;
                }
                case 4:{
                    System.out.println(specialStack.isEmptyStack());
                    break;
                }
                case 5:{
                    break;
                }
                default:{
                    System.out.println("\n\nPlease enter a valid option");
                }
            }
        }
    }
}
