public class Gravity {
    public static double falling(double time, double velo){
        double dist = velo * time + (0.5 * 9.8 * time * time);
        return dist;
    }
    public static void main(String[] args){
        double cat = falling(3,2);
        System.out.println(cat);

    }
}
