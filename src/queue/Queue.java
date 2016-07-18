package queue;

public class Queue<E> extends QueueAbstract<E>{

	@Override
	public boolean offer(E element) {
		Element newElement = new Element(element);
		//adding first element into queue
		if(null==this.getHead()){
			this.setHead(newElement);
			//increase the size of the queue
			this.setSize(getSize()+1);
		}
		//adding the new element to the last element of the queue
		else{
			Element cursor = this.getHead();
			//pointing out the last element of the queue
			while(cursor.getNextElement()!=null){
				cursor = cursor.getNextElement();
			}
			//linking the new element behind the last element 
			cursor.setNextElement(newElement);
		}	
		return true;
	}

	@Override
	public E pool() {
		Element head = this.getHead();
		if(head==null){
			return null;
		}
		else{
			this.setHead(head.getNextElement());
			this.setSize(this.getSize()-1);
			return head.getElementValue();
		}
		
	}

	@Override
	public E peek() {
		Element head = this.getHead();
		if(head==null){
			return null;
		}
		else{
			return head.getElementValue();
		}
		
	}
	public void print(){
		Element cursor = super.getHead();
		for(int counter=0;counter<super.getSize();counter++){
			System.out.print(cursor.getElementValue()+"\t");
			cursor = cursor.getNextElement();
		}
	}

}
