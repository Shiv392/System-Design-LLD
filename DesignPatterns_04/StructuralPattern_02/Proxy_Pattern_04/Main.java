package DesignPatterns_04.StructuralPattern_02.Proxy_Pattern_04;

public class Main {
    public static void main(String[] args) {
        ProxyImage_03 proxyImage_03 = new ProxyImage_03("Cat.png");

        proxyImage_03.display();
        proxyImage_03.display();
    }
}
