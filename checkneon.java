public class checkneon {
    int num;
    int digit;
    int sum=0;
    int sqr;

    public checkneon(int num){
        this.num=num;
    }
    void display(){
        sqr=num*num;
        while (sqr != 0){
            digit=sqr%10;
            sum=sum+digit;
            sqr=sqr/10;
        }
        if(sum==num)
            System.out.println(num+" is a neon number ");
        else System.out.println((num+" is not a neon number"));
    }
    public static void main(String[] arg){
        checkneon obj=new checkneon(9);
        obj.display();
    }
}
