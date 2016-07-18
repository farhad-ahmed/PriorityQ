package queue;

public class DemoQueue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Queue<Integer> q = new Queue<Integer>();
		q.offer(12);
		q.offer(18);
		q.offer(1986);
		System.out.println("Size after adding three items: "+q.getSize());
		q.print();
		System.out.println("\n============================================");
		System.out.println("pooling queue");
		while(q.getSize()!=0){
			System.out.println(q.pool());
		}
		System.out.println("Final size after dequeue: "+q.getSize());
		System.out.println("=============================================");

	}

}
