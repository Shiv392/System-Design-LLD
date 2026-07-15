

public class BadCode {

    public int add(int a, int b) {
        if (a >= 0 && b >= 0) {
            return Math.addExact(a, b);
        } else if (a < 0 && b >= 0) {
            return Math.addExact(a, b);
        } else if (a >= 0 && b < 0) {
            return Math.addExact(a, b);
        }

        return Math.addExact(a, b);
    }
    public static void main(String[]args){
        BadCode badCode = new BadCode();
        System.out.println(badCode.add(5, 10));
    }
}
