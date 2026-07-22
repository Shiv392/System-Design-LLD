package DesignPatterns_04.StructuralPattern_02.Proxy_Pattern_04;

public class RealImage_02 implements ImageInterface_01 {
    private String fileName;

    public RealImage_02(String _fileName){
        fileName = _fileName;
        loadFromDisk();
    }

    public void loadFromDisk(){
        System.out.println("Loading from disk........");
    }

    @Override
    public void display(){
        System.out.println("Displaying image....");
    }
}
