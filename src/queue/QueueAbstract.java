package queue;

public abstract class QueueAbstract<E> {
	
	private Element head;
	private int size;
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Element getHead() {
		return head;
	}

	public void setHead(Element head) {
		this.head = head;
	}

	public class Element{
		
		private E elementValue; 
		private Element nextElement;
		
		 Element(E value){
			elementValue=value;
			nextElement=null;
		}
		
		public E getElementValue() {
			return elementValue;
		}
		public void setElementValue(E elementValue) {
			this.elementValue = elementValue;
		}
		
		public Element getNextElement() {
			return nextElement;
		}
		public void setNextElement(Element nextElement) {
			this.nextElement = nextElement;
			size++;
		}
			
	}
	
	/*
	 * inserts the specified element into this queue 
	 * if it is possible to do so immediately without violating capacity restrictions. 
	 * When using a capacity-restricted queue, this method is generally preferable to add(E),
	 * which can fail to insert an element only by throwing an exception.
	 */
	public abstract boolean offer(E element);
	
	/*
	 * Retrieves and removes the head of this queue, 
	 * or returns null if this queue is empty.
	 */
	public abstract E pool();
	
	/*
	 * Retrieves, but does not remove, the head of this queue, 
	 * or returns null if this queue is empty.
	 */
	public abstract E peek();
	

}
