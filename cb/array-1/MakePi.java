/*
Return an int array length 3 containing
the first 3 digits of pi, {3, 1, 4}.
*/
public class MakePi {
    public static int[] makePi() {
        int[] x = {3,1,4};
        return x;
    }
    
    public static void main(String[] args) {
        System.out.println(ArrayToString.stringify(makePi())+"...expecting 3, 1, 4");
    }
}
