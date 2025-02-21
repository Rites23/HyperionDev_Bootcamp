import java.util.Arrays;
import java.util.PriorityQueue;

public class priorityQueues {

    public static void main(String[] args) {
        // The below creates Two priority queues
        PriorityQueue <String> queue1 = new PriorityQueue <>
                (Arrays.asList("George", "Jim", "John", "Blake", "Kevin", "Michael"));

        PriorityQueue <String> queue2 = new PriorityQueue <>
                (Arrays.asList("George", "Katie", "Kevin", "Michelle", "Ryan"));

        // The below displays the two sets, union, difference and intersection
        System.out.println("Queue 1: " + queue1);
        System.out.println("Queue 2: " + queue2);
        System.out.println("union: " + findUnion(queue1, queue2));
        System.out.println("difference: " + findDifference(queue1, queue2));
        System.out.println("intersection: " + findIntersection(queue1, queue2));

    }

    // Method that returns the union of the two sets
    // We add the two queues and duplicates are removed from the two queues
    // Returns the new set
    public static <A> PriorityQueue<A> findUnion(PriorityQueue<A> p1, PriorityQueue<A> p2) {
        PriorityQueue<A> union = new PriorityQueue<>(p1);
        union.addAll(p2);
        return union;
    }

    // Method that returns the difference of the two sets
    // Names found in Queue 2 and not found in Queue 1 are removed - thus the difference
    // Returns Queue2
    public static <A> PriorityQueue <A> findDifference(PriorityQueue<A> p1, PriorityQueue<A> p2){
        PriorityQueue<A> difference = new PriorityQueue<>(p1);
        difference.removeAll(p2);
        return  difference;
    }

    // Method that returns the intersection of the two sets
    // If item (A) in Queue 2 is also found in Queue 1, item is added to new list
    // Returns new list with duplicate items
    public static <A> PriorityQueue <A> findIntersection(PriorityQueue<A> p1, PriorityQueue<A> p2){
        PriorityQueue<A> intersection = new PriorityQueue<>(p1);
        intersection.retainAll(p2);
        return  intersection;
    }

}

