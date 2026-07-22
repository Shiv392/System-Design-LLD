package DesignPatterns_04.StructuralPattern_02.Proxy_Pattern_04;

public class ProxyImage_03 implements ImageInterface_01{
    private String fileName;
    private RealImage_02 realImage;

    public ProxyImage_03(String _fileName){
        fileName = _fileName;
    }

    @Override
    public void display(){
        if(realImage == null){
            realImage = new RealImage_02(fileName);
        }

        realImage.display();
    }
}
