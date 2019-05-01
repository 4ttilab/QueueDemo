package queuedemo;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {
        Queue<String> qu = new PriorityQueue<>(); 
        qu.add("B Gizi");   //így tudok hozzáadni elemet a sorhoz
        System.out.println(qu);
        qu.add("C Gyula");
        System.out.println(qu);
        qu.add("A Frodó");
        System.out.println(qu);
        System.out.println(qu.element());   //megnézhetem, ki az első a sorban
        qu.poll();  //az elsőt kiveszem
        System.out.println(qu);
        qu.offer("D Csókos Jani");  //így is hozzá tudok adni elemet a sorhoz
        System.out.println(qu);
        System.out.println(qu.peek());   //így is megnézhetem, ki az első a sorban
        qu.add("B Béla"); 
        System.out.println(qu);
        System.out.println(qu.peek());
        qu.poll();
        System.out.println(qu);
        qu.poll();
        System.out.println(qu);
        qu.poll();
        System.out.println(qu); //
        qu.poll();
        System.out.println(qu);
    }
}
