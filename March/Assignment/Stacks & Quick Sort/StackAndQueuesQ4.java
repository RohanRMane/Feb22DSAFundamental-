
import java.util.Stack;

public class StackAndQueuesQ4 {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<>();
        String s="Rohan hvschs ksbkadk ";
        String arr[]=s.split(" ");
        for(int i=0;i< arr.length;i++){
            stack.push(arr[i]);
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }
}