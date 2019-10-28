//In computer science, a double-ended queue (dequeue, often abbreviated to deque, pronounced deck) is an abstract data type that generalizes a queue, for which elements can be added to or removed from either the front (head) or back (tail).

// Deque interfaces can be implemented using various types of collections such as LinkedList or ArrayDeque classes.
import java.util.*;
public class javaDequeue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();
        int max = 0;
        HashSet hs = new HashSet();
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            hs.add(num);
            if(deque.size() == m+1){
                int num_out = (int) deque.remove();
                if(!deque.contains(num_out)){
                hs.remove(num_out);
                }
            }
            max = Math.max (hs.size(), max);
        }
        System.out.println(max);
    }
    
}