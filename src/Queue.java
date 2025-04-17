public class Queue {
    public int[] array;
    public int front;
    public int rear;
    public int size;
    public Queue(int size){
        this.array=new int[size];
        this.front=0;
        this.rear=-1;
        this.size=size;
    }
    public void enqueue(int value){
        if(rear<size-1){
            array[++rear]=value;
            return;
        }else{
            System.out.println("Queue is full");
        }

    }
    public void dequeue(){
        if(rear==-1){
            System.out.println("Queue is empty");
            return;
        }
        if(front<=rear){
            ++front;

        }

    }
    public void readjust(){
        int j=0;
        for(int i=front;i<=rear;i++){
            array[j++]=array[i];
        }
        rear=j-1;
        front=0;

    }
    public void recover(){
        if(front==0){
            System.out.println("Cannot recover the queue is adjusted");
            return;
        }
        --front;
    }
    public void display(){
        if(rear==-1){
            System.out.println("Queue is empty");
            return;
        }
        for(int i=front;i<=rear;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Queue queue=new Queue(5);
        queue.enqueue(5);
        queue.enqueue(56);
        queue.display();
        queue.dequeue();
        queue.display();
        queue.recover();
        queue.display();
        queue.dequeue();
        queue.readjust();
        queue.display();
        queue.recover();
        queue.display();
    }
}
