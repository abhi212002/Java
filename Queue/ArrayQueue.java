import java.util.Arrays;

public class Main {
    static int F,R;
    static int a[]=new int[5];
    static int count;//to keep track of no of elements in queue
    public static void enqueue(int item){
        if(count==a.length){
            System.out.println("Queue is full");
            return;
        }
        a[R]=item;
        R=(R+1)%a.length;
        count++;
    }
    public static void dequeue(){
        a[F]=0;
        F=(F+1)%a.length;
        count--;
    }
    public static boolean isEmpty(){
        if(count==0 )
            return true;
        else
            return false;
    }
    public static boolean isFull(){
        if(count==a.length)
            return true;
        else
            return false;
    }
    //@Override
    public String toString(){
        return Arrays.toString(a);
    }
    public static void main(String args[]){
        Main q=new Main();
        q.enqueue(10);
        q.enqueue(30);
        q.enqueue(20);
        q.enqueue(40);
//        q.dequeue();
//        q.dequeue();
//        q.enqueue(20);
//        q.enqueue(60);
//        q.dequeue();

//      System.out.println(F +" "+R);
        System.out.println(q);
    }
}