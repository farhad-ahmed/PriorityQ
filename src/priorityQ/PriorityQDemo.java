package priorityQ;

public class PriorityQDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		q.offer(11, 11);
		q.offer(7, 7);
		q.offer(10, 10);
		q.offer(12, 12);
		q.offer(15, 15);
		q.offer(6, 6);
		q.offer(9, 9);
		
		q.print();
		System.out.println("Size of the queue: "+q.getSize());
		while(q.hasNextElement()){
			System.out.print(q.pool()+"\t");
		}

	}

}
