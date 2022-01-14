public class PairDown {
    public int[] fold(int[] list) {
        int pc = (list.length + 1)/2;
        int[] ret = new int[pc];
        for(int k =0; k < list.length;k+=2){
            int o =0;
            if (k+1 < list.length){
                o = list[k+1];
            }
            ret[k/2] = list[k] + o;
        }
        return ret;
    }
}
