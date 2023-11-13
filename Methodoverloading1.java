class Adder{
    static int add(int a,int b){
        return a+b;
    }
    static int add(int a,int b,int c){
        return  a+b+c;
    }
}


public class Methodoverloading1 {
    public  static  void  main(String args[]){
        System.out.println(Adder.add(34,21));
        System.out.println(Adder.add(3,21,-5));
    }
}
