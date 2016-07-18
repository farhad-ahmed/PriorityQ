package priorityQ;



public class PriorityQueue<E> extends AbstractPriorityQ<E>{
	
	PriorityQueue(){
		super();
	}

	@Override
	public boolean offer(E element,int priority) {
		Element<E> newElement = new Element<E>(element, priority);
		
		//initial queue is empty, add new element as head and tail as well
		if(this.getHead()==null){
			this.setHead(newElement);
			this.setTail(newElement);
			this.setSize(getSize()+1);
			//print();
			return true;
		}
		//head is already there 
		
		//the new element has higher priority than head 
		//add the new element at the top of current head 
		//promotion the new element as new head
		if(newElement.compareTo(this.getHead().getPriority())<0){
			newElement.setNextElement(this.getHead());
			newElement.setPriviousElement(null);
			this.getHead().setPriviousElement(newElement);
			//this.getHead().setNextElement(null);
			this.setHead(newElement);
			this.setSize(getSize()+1);
			//print();
			return true;
		}
		//the new element has lower priority than tail 
		//add the new element at the bottom of the queue
		//set new element as new tail of queue
		else if(newElement.compareTo(this.getTail().getPriority())>0){
			this.getTail().setNextElement(newElement);
			newElement.setPriviousElement(getTail());
			newElement.setNextElement(null);
			this.setTail(newElement);
			this.setSize(getSize()+1);
			//print();
			return true;
		}
		// the new element will be in between two existing elements 
		// cursor will point out the bottom element of the new item
		//no change in head or tail 
		// increase the size of the queue
		else{
			Element<E> cursor = this.getHead();
			while(newElement.compareTo(cursor.getPriority())>0){
				cursor=cursor.getNextElement();
			}
			newElement.setNextElement(cursor);
			newElement.setPriviousElement(cursor.getPriviousElement());
			cursor.getPriviousElement().setNextElement(newElement);
			cursor.setPriviousElement(newElement);
			this.setSize(this.getSize()+1);
			//print();
			return true;	
		}
		
	}

	@Override
	public E pool() {
		Element<E> currentHead = getHead();
		setHead(currentHead.getNextElement());
		setSize(getSize()-1);
		return currentHead.getValue();
		
	}
	public void print(){
		Element<E> cursor = this.getHead();
		while(cursor.getNextElement()!=null){
			System.out.print(cursor.getPriority()+"\t");
			cursor = cursor.getNextElement();
		}
		System.out.println(cursor.getPriority());
	}
	
	public boolean hasNextElement(){
		Element<E> cursor = this.getHead();
		if(cursor==null){
			return false;
		}
		return true;
	}

}
