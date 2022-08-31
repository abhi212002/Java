////To push an element at the bottom of a stack
import java.util.*;
public class Main
{
    public static void ab(Stack<Integer> s,int n){
        if(s.isEmpty()){
            s.push(n);
            return;
        }
        int a=s.pop();
        ab(s,n);
        s.push(a);
    }
    
	public static void main(String[] args) {
	    Stack<Integer> s=new Stack();
	    s.push(1);
	    s.push(2);
	    s.push(3);
	    ab(s, 4);
	    
	    while(!s.isEmpty()){
	        System.out.println(s.pop());
	    }
	}
}
