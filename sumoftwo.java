public class sumoftwo{
    int a;
    int b;
    int s;

    public sumoftwo(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public void display()
    {
        int s=a+b;
        System.out.println("The sum of two numbers are "+s );
    }

    public static void main(String[] args){
        sumoftwo obj=new sumoftwo(16 ,3);
        obj.display();

    }
}
