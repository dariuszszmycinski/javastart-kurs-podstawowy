package example2;

import java.util.PriorityQueue;
import java.util.Queue;

public class ClientService {
    public static void main(String[] args) {
        Queue<Client> clientQueue = new PriorityQueue<>();

        clientQueue.offer(new Client("Ela",3));
        clientQueue.offer(new Client("Asia",1));
        clientQueue.offer(new Client("Krysia",5));
        clientQueue.offer(new Client("Anita",2));

        System.out.println("Metoda peek() (1)"+clientQueue.peek());
        System.out.println("Metoda peek() (2)"+clientQueue.peek());

        System.out.println("Metoda poll() (1)"+clientQueue.poll());
        System.out.println("Metoda poll() (2)"+clientQueue.poll()+"\n");

        System.out.println("Stan kolejki: "+clientQueue);
        System.out.println("Peek "+clientQueue.peek());
        System.out.println("Stan kolejki: "+clientQueue);
        System.out.println("Poll "+clientQueue.poll());
        System.out.println("Stan kolejki: "+clientQueue);
    }

}
