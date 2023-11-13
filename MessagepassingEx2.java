interface MessageSender{
    int message();
}
class ObjB implements MessageSender{
    private int varible;
    public ObjB(int value){
        varible=value;
    }

    public int message()
    {
        return varible+1;
    }

}

class A{
    public int sendMsg(MessageSender sender){
        int result=sender.message();
        return result;
    }
}

public class MessagepassingEx2 {
    public static void main(String args[]){
        ObjB aj=new ObjB(25);
        A ac=new A();
        int result=ac.sendMsg(aj);

        System.out.println("The receieved message is "+ result);
    }
}
