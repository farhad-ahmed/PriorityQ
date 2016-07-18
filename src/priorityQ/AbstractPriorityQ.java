package priorityQ;

public abstract class AbstractPriorityQ<E> {
	
	private int size; 
	private Element<E> head;
	private Element<E> tail;
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public Element<E> getHead() {
		return head;
	}
	public void setHead(Element<E> head) {
		this.head = head;
	}
	public Element<E> getTail() {
		return tail;
	}
	public void setTail(Element<E> tail) {
		this.tail = tail;
	}

	
	
	
	public abstract boolean offer(E element, int priority);
	public abstract E pool();
	
	
	class Element<E> implements Comparable<Integer>{
		private E value; 
		private int priority;
		private Element<E> nextElement;
		private Element<E> previousElement;
		
		Element(E value, int priority){
			this.value=value;
			this.priority=priority;
		}
		public E getValue() {
			return value;
		}

		public void setValue(E value) {
			this.value = value;
		}

		public int getPriority() {
			return priority;
		}

		public void setPriority(int priority) {
			this.priority = priority;
		}
		
		public Element<E> getNextElement() {
			return nextElement;
		}
		public void setNextElement(Element<E> nextElement) {
			this.nextElement = nextElement;
		}
		
		public Element<E> getPriviousElement() {
			return previousElement;
		}
		public void setPriviousElement(Element<E> previousElement) {
			this.previousElement = previousElement;
		}
		
		public int compareTo(Integer otherPriority){
			return Integer.compare(this.getPriority(), otherPriority);
			
		}
		

	}
}
