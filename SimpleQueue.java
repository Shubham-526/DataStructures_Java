public class Queue{
	
	private int first;
	private int last;
	private int capacity;
	private int arr[];
	
	public Queue(int size){
		
		arr= new int[size];
		capacity=size;
		front=-1;
		rear=-1;
	}
	
	protected boolean isFull(){
		
		return rear==capacity-1;
	}
	protected boolean isEmpty(){
		return front==-1&&rear==-1;
	}
	public void enqueue(int x){
		
		if(isFull()){
			
			System.out.println("Overflow\nProgram terminated");
			System.exit(1);
			
		}
		System.out.println("Inserting"+ x);
		if(front==-1)
			front++;
		arr[++rear]=x;
	}
	
	public int dequeue(){
		
		if(isEmpty()){
			
			System.out.println("Queue is empty");
			System.exit(1);
		}
		if(rear==front){
			int x=arr[front];
			front=-1;
			rear=-1;
			return x;
		}
		
		return arr[front++];
	}
	
	
}