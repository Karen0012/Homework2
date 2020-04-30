public class problem11 {
    public static void main(String[] args) {
        boolean doseSignificantWork= true, makesBreakthrough=false, nobelPrizeCandiate;



        if (doseSignificantWork) {
            if (makesBreakthrough)
                nobelPrizeCandiate = true;
            else nobelPrizeCandiate = false;
        } else if (!doseSignificantWork)
            nobelPrizeCandiate = false;





        if (doseSignificantWork & makesBreakthrough){
            nobelPrizeCandiate = true;
        }else nobelPrizeCandiate = false;


    }
}
