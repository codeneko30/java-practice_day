
// ছোট মান (Min-Heap)

import java.util.PriorityQueue;

import java.util.Collections;

class numberQueueExample {
    public static void main(String[] args) {

        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        numbers.add(70);
        numbers.add(10);
        numbers.add(15);
        numbers.add(90);

        System.out.println(numbers);

        // poll
        System.out.println(numbers.poll());
        //size()
        System.out.println(numbers.size());
        System.out.println(numbers.poll());
        // peek()
         System.out.println(numbers.peek());
        


    }
}





class numbersExample {
    public static void main(String[] args) {

        PriorityQueue<Integer> numbers =
                new PriorityQueue<>(Collections.reverseOrder());

        numbers.add(7);
        numbers.add(2);
        numbers.add(9);
        numbers.add(15);

        System.out.println(numbers.poll());
        System.out.println(numbers.poll());
        
    }
}

