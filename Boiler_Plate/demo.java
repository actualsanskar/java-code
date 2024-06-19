package Boiler_Plate;

class Checkpen{
    public String CheckingPen(int A){
        if( A >= 10 ){
            return  "You get a pen";
        } else{
            return "You get nothing.";
        }
    }

}

public class demo {
    public static void main(String[] args) {
        Checkpen pen = new Checkpen();
        String Result = pen.CheckingPen(20);
        System.out.println(Result);

    }
}
