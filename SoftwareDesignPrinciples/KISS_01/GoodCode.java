package SoftwareDesignPrinciples.KISS_01;

public class GoodCode {
    public int add(int a, int b) {
        return a+b;
    }

    public static void main(String[]args){
        GoodCode goodCode = new GoodCode();
        System.out.println(goodCode.add(5, 10));
    }
}

//simple, readable & maintainable code.