package logicas;
import java.util.Scanner;
import logicas.Figura;
import javax.swing.JOptionPane;
/**
 *
 * @author Estudiantes
 */
public class Logicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int op=0;
        float x1,y1,x2,y2,distancia,diferenciaalt,diferenciabas;
        while(op<=4)
	{ 
         Scanner sc=new Scanner (System.in);
         System.out.println("ingrese el valor de X del primer punto");
         x1=(sc.nextFloat());
         System.out.println("ingrese el valor de Y del primer punto");
         y1=(sc.nextFloat());
         System.out.println("ingrese el valor de X del segundo punto");
         x2=(sc.nextFloat());
         System.out.println("ingrese el valor de Y del segundo punto");
         y2=(sc.nextFloat());
         distancia=(float)(float)Math.sqrt((float)Math.pow((x1-x2),2)+(float)Math.pow((y1-y2),2));
         diferenciaalt=x2-x1;
         diferenciabas=y2-y1;
         System.out.println("1.Cuadrado");
         System.out.println("2.Circulo");
         System.out.println("3.Triangulo");
         System.out.println("4.Rectangulo");
         System.out.println("¿A QUE FIGURA DESEA CALCULAR EL AREA Y EL PERIMETRO?  (NUMERO)");
         System.out.println(diferenciaalt);
                 System.out.println(diferenciabas);
         op=sc.nextInt();
           switch(op){
               case 1:
                    Cuadrados f = new Cuadrados();
                    f.setDistanciap(distancia);
                    f.calcularArea();
                    f.calcularPerimetro();
                    System.out.println("El area del cuadrado es"+f.getArea());
                    System.out.println("El perimetro del cuadrado es"+f.getPerimetro());
                    break;
                
               case 2:  
                    Circulos t = new Circulos();
                    t.setDistanciap(distancia);
                    t.calcularArea();
                    t.calcularPerimetro();
                    System.out.println("El area del circulo es"+t.getArea());
                    System.out.println("El perimetro del circulo es"+t.getPerimetro());
                    break;
                    
               case 3:  
                    Triangulos g = new Triangulos();
                    g.setDistanciap(distancia);
                    g.setDiferenciaaltp(diferenciaalt);
                    g.setDiferenciabasp(diferenciabas);
                    g.calcularArea();
                    g.calcularPerimetro();
                    System.out.println("El area del triangulo es"+g.getArea());
                    System.out.println("El perimetro del triangulo es"+g.getPerimetro());
                    break;
                    
               case 4:  
                    Rectangulos r = new Rectangulos();
                    r.setDistanciap(distancia);
                    r.setDiferenciaaltp(diferenciaalt);
                    r.setDiferenciabasp(diferenciabas);
                    r.calcularArea();
                    r.calcularPerimetro();
                    System.out.println("El area del rectangulo es"+r.getArea());
                    System.out.println("El perimetro del rectangulo es"+r.getPerimetro());
                    break;    
           }
            
         }
    }
    
}
