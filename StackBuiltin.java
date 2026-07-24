import java.util.*;


public class StackBuiltin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack <Integer> stack = new Stack<>();        

        int choice;

        do {
            System.out.println("Enter a choice for stack: ");
            System.out.println("1. Push\n2. Pop\n3. Stacktop\n4. Display\n5. Exit");
            choice=sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter element: ");
                    int data = sc.nextInt();
                    stack.push(data);
                    break;
            
                case 2:
                    if (stack.empty()) {
                        System.out.println("Stack underflow");
                    }
                    else{
                    System.out.println("Popped element: "+stack.pop());
                    }
                break;

                case 3:
                    if (stack.empty()) {
                        System.out.println("Stack underflow");
                    }
                    else{
                        System.out.println("Top element of stack: "+stack.peek());
                    }
                    break;

                case 4:
                    if (stack.empty()) {
                        System.out.println("Stack underflow");
                    }
                    else{
                        System.out.println(stack);
                    }
                    break;

                default:
                    System.out.println("Invalid choice!!!");
                    break;
            }
        } while (choice!=5);
        sc.close();
    }
}
