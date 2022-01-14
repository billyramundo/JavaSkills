public class Totality {
    public int sum(int[] a, String stype) {
        int esum = 0;
        int osum = 0;
        for (int k = 0; k < a.length; k += 2) {
            esum += a[k];
        }
        for (int k = 1; k < a.length; k += 2){
            osum += a[k];
        }
        if(stype.equals("odd")){
            return osum;
        }
        else if(stype.equals("even")){
            return esum;
        }
        return osum + esum;
    }
}
