import java.util.LinkedList;
import java.util.Queue;

public class StackAndQueuesQ5 {
    private Queue q1;
    private Queue q2;
    int length;
    public StackAndQueuesQ5(){
        this.q1=new LinkedList();
        this.q2=new LinkedList();
        this.length=0;
    }

    public void push(int a){
        q2.add(a);
        while (!q1.isEmpty()){
            q2.add(q1.poll());
        }
        length++;
        Queue Temp=q1;
        q1=q2;
        q2=Temp;
    }
    public int pop(){
        int a=(int)q1.poll();
        return a;
    }
    public int peek(){
        int a=(int)q1.peek();
        return a;
    }
    public static void main(String[] args) {
        StackAndQueuesQ5 stack=new StackAndQueuesQ5();
      for(int i=0;i<10;i++){
          stack.push(i);
      }
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}