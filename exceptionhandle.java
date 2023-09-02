import java.util.Scanner;

public class exceptionhandle {
    public static void main(String[] args){
        int[] roll=new int[10];
        roll[0]=1;
        roll[1]=2;
        roll[2]=3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the index:-");
        int index=sc.nextInt();

        System.out.println("Enter the number to divide:-");
        double divis=sc.nextInt();
        try{
            System.out.println("The index is"+roll[index]);
            System.out.println("The value after division is "+roll[index]/divis);
        }
        catch (ArithmeticException e )
        {
            System.out.println("Exception occured");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index out of index.");
        }
        catch (Exception e){
            System.out.println("Exception not mentioned in the list.");
        }
    }
}
