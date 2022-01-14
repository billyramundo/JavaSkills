public class AccessLevel {
    public String canAccess(int[] rights, int minPermission) {
        String ret = "";
        for (int k = 0; k < rights.length; k +=1){
            if (rights[k] < minPermission){
                ret = ret + "D";
            }
            else{
                ret = ret + "A";
            }
        }
        return ret;

    }
}
