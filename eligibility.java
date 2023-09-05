public class eligibility {

    String name;
    int mm;
    int scm;
    int comp;
    eligibility(String name,int mm, int scm,int comp){
        this.name=name;
        this.mm=mm;
        this.scm=scm;
        this.comp=comp;
    }
    void check() {
        int all = mm + scm + comp;
        int avg = all / 3;
        System.out.println("Hey Archi, wait for the confirmation\n");
        if (all > 95) {
            System.out.println("Yeeeaa,Eligible for Computer Science");
        } else if (avg > 90) {
            System.out.println("Congratulation,Eligible for Bio-Science");
        } if(all>=80 && all<90) {
            System.out.println("Now,Eligible for hindi");
        }
    }
        public static void main(String[] args){
            eligibility obj=new eligibility("Archi",90,86,30);
            obj.check();

    }
    }

