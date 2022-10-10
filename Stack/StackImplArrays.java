import java.util.*;
public class Main {
    int[] items=new int[5];
    int count=0;
    public void push(int item){
        if(count==items.length){
            int temp[]=new int[items.length*2];
            for(int i=0;i<items.length;i++){
                temp[i]=items[i];
            }
            items=temp;
        }
        items[count++]=item;
    }
    public void pop(){
        if(isEmpty()){
            System.out.println("Stack empty. can't delete ");
            return;
        }
        count--;
    }
    public void peek(){
        if(!isEmpty())
        System.out.println(items[count-1]);
        else System.out.println("empty stack!");
    }
    private boolean isEmpty(){return count==0;}
    
    public void printS(){
        for(int i=0;i<=count;i++){
            System.out.println(items[i]);
        }
    }

    public static void main(String args[]){
//        count=0
//        10 20 0 0 0
        Main obj=new Main();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.push(50);
        obj.push(60);
        obj.pop();
        obj.push(70);
        obj.peek();
        obj.printS();
    }
}
