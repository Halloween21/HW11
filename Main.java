public class Main{
    public static void main (String [] args){
        int a=5;
        System.out.println(fak(5));
    }

    public static int fak(int i) {
        if (i==0 || i==1){
            return 1;
        }
        else {
            return fak(i-1) + fak (i-2);
        }
    }
}