public class checkarmstrong{
    int originalnum;
    int temp;
    int rem;
    int result=0;

    public checkarmstrong(int temp){
        this.originalnum=temp;
    }
    void display(){
        temp=originalnum;
        while (originalnum != 0)
        {
            rem = originalnum % 10;
            result += Math.pow(rem, 3);
            originalnum /= 10;
            if(result == temp)
                System.out.println(temp + " is an Armstrong number.");
            else
                System.out.println(temp + " is not an Armstrong number.");
        }
    }

    public static void main(String[] args){
        checkarmstrong obj=new checkarmstrong(371);
        obj.display();
    }

}
