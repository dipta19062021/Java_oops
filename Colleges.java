public class Colleges {
    String collegeId;
    Colleges(String collegeId){
        this.collegeId = collegeId;
    }
    public static void main(String[] args) {
// TODO Auto-generated method stub
        Colleges clg = new Colleges("RCC"); //this can't create colleges constructor now.
        System.out.println("College name is "+ clg.collegeId);
    }


}
