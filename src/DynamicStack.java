public class DynamicStack {
    int[] arr;
    int capacity;
    int head;
    public DynamicStack(int capacity){
        arr=new int[capacity];
        this.capacity=capacity;
        head=-1;
    }
    public void resize(){
        capacity*=2;
        int[] newStack=new int[capacity];
        for(int i=0;i<=head;i++){
            newStack[i]=arr[i];
        }
        arr=newStack;
    }
    public void push(int element){
        if(head==capacity-1){
            resize();
        }
        arr[++head]=element;
    }
    public void pop(){
        if(head==-1){
            System.out.println("Stack underflow");
            return;
        }
        head--;
    }
    public void display(){
        if (head==-1){
            System.out.println("Stack is empty");
            return;
        }
        for(int i=head;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        DynamicStack stack=new DynamicStack(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.display();
        stack.push(4);
        stack.push(6);
        stack.display();
    }
}
