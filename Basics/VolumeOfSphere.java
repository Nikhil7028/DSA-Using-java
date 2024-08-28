package Basics;


//calculate of volume of sphere      (4/3) · π · r3
public class VolumeOfSphere
{
    public static void main(String[] args)
    {
        float pi=3.14f;
        double r=4.5;

        double volume;
        
        
        volume=4*pi*r*r*r/3;

        System.out.println("Volume of sphere : "+volume);

        
    }
    
}
