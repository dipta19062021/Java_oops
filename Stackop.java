import java.util.*;

class stackint {
    public int[] arr1;
    public char[] arr2;
    public String[] arr3;
    // public int c;
    public int c1;
    public int c2;
    public int c3;
    public int top;
    public int topc;
    public int tops;
    int x;
    char y;
    String s;

    public stackint(int size) {
        arr1 = new int[size];
        c1 = size;
        top = -1;
        arr2 = new char[size];
        c2 = size;
        topc = -1;
        arr3 = new String[size];
        c3 = size;
        tops = -1;

    }

    // public boolean isFull(){
    // return top==c1-1;
    // }
    // public boolean isEmpty(){
    // return top==-1;
    // }
    void push(int x) {
        if (top == c1 - 1) {
            System.out.println("Stack overflow");
        }
        // System.exit(1);
        arr1[++top] = x;
        System.out.println("Pushed: " + x);
    }

    public int pop() {
        if (top == -1) {
            System.out.println("stack is empty");
        }
        return arr1[top--];
    }

    // public int getsize() {
    //     return top + 1;
    // }

    public void printintstack() {
        for (int i = 0; i <= top; i++) {
            System.out.println(arr1[i] + " ");
        }
    }

    // for char

    public void push(char y) {
        if (topc == c1 - 1) {
            System.out.println("stack overflow");
        }
        // System.exit(1);
        arr2[++topc] = y;
        System.out.println("Pushed charrecter:"+ y);
    }

    public int popc(int topc) {
        if (topc == -1) {
            System.out.println("stack is empty");
        }
        return arr2[topc--];
    }

    // public int getsize(char top1) {
    //     return top1 + 1;
    // }

    public void printcharstack() {
        for (int i = 0; i <= topc; i++) {
            System.out.println(arr2[i] + " ");
        }
    }

    // string operation

    public void push(String s) {
        if (tops == c2-1) {
            System.out.println("stack overflow");
        }
        // System.exit(1);
        arr3[++tops] = s;
        System.out.println("Pushed charrecter:"+ s);
    }

    public int pops(int tops) {
        if (tops == -1) {
            System.out.println("stack is empty");
        }
        return arr1[topc--];
    }

    // public boolean isFull(int tops) {
    //     return tops == c2 - 1;
    // }

    // public boolean isEmpty(int tops) {
    //     return tops == -1;
    // }

    // public int getsize(int tops) {
    //     return tops + 1;
    // }

    public void printstring() {
        for (int i = 0; i <= tops; i++) {
            System.out.println(arr3[i] + " ");
        }
    }
}

public class Stackop {
    public static void main(String[] args) {
        stackint sc = new stackint(5);
        stackint sc1 = new stackint(5);
        stackint sc2 = new stackint(5);
        sc2.push("sir");
        sc1.push('a');
        sc.push(43);
        sc2.push("hi");
        sc.push(3);
        // System.out.println(sc.pop());
        sc1.push('k');
        sc.printintstack();
        sc1.printcharstack();
        sc2.printstring();
    }

}
