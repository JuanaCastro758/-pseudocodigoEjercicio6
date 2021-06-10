import java.util.*;
public class Ejercicio6{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        int edad, mayor=0,menor=0,ig=0;
        int smayor=0,smenor=0,sigual=0;
        System.out.println("Ingresar 100 edades: ");
        for (int i=0;i<100;i++){
            edad=scanner.nextInt();
            if (edad>25){
                smayor+=edad;
                mayor++;
            }
            if (edad<25){
                smenor+=edad;
                menor++;
            }
            if (edad==25){
                sigual+=edad;
                ig++;
            }
        }
        float p1=smayor/mayor;
        float p2=smenor/menor;
        float p3=sigual/ig;
        System.out.println("promedio de las personas mayores a 25: "+p1);
        System.out.println("promedio de las personas menores a 25: "+p2);
        System.out.println("promedio de las personas iguales a 25: "+p3);
    }
}