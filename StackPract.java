import java.util.Scanner;


class MyStack{
    int arr[],size,top;

    MyStack(int n){
        size = n;
        arr = new int[size];
        top = -1;
    }

    boolean isempty(){
        return top==-1;
    }

    void push(int data){
        if (top==size-1) {
            System.out.println("Stack overflow");
            return;
        }
        else{
            top++;
            arr[top]=data;
            System.out.println(data+" pushed into stack.");
        }
    }

    void pop(){
        if (isempty()) {
            System.out.println("Stack underflow");
        }
        else{
            System.out.println("Popped element is:  "+arr[top]);
            top--;
        }
    }

    void stacktop(){
          if (isempty()) {
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Top element: "+arr[top]);
        }
    }

    void display(){
        if (isempty()) {
            System.out.println("Stack is empty");
        }
        else{
            for(int i=top;i>=0;i--){
                System.out.println(arr[i]);
            }
        }
    }
}


public class StackPract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of stack: ");
        int n = sc.nextInt();
        
        MyStack s = new MyStack(n);

        int choice;

        do {
            System.out.println("Enter a choice for stack: ");
            System.out.println("1. Push\n2. Pop\n3. Stacktop\n4. Display\n5. Exit");
            choice=sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter element: ");
                    int data = sc.nextInt();
                    s.push(data);
                    break;
            
                case 2:
                    s.pop();
                    break;

                case 3:
                    s.stacktop();
                    break;

                case 4:
                    s.display();
                    break;
                
                case 5:
                    System.out.println("Exiting.....");
                    break;

                default:
                    System.out.println("!!Invalid choice\n Choose from 1 to 5");
                    break;
            }

        } while (choice!=5);

        sc.close();
    }
}
