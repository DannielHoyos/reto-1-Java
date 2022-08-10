import java.util.Scanner;


public class Reto_1 {

   
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int d_casaGoku;
        int d_proximaEsfera;
        int t_viaje;
        String n_esfera = "";
        
        d_casaGoku = s.nextInt();
        d_proximaEsfera = (2 * d_casaGoku) + 4;
        t_viaje = (int)(((3 * d_casaGoku ) + 4) / 5);
        
        if(t_viaje>0 && t_viaje<=20){
            n_esfera = "uno";
        }
        else if(t_viaje>21 && t_viaje<=30){
            n_esfera = "dos";
        }
        else if(t_viaje>31 && t_viaje<=50){
            n_esfera = "tres";
        }
        else if(t_viaje>50 && t_viaje<=10000000){
            n_esfera = "cuatro";
        }
        
        System.out.println(d_casaGoku + " " + d_proximaEsfera + " " + t_viaje);
        System.out.println(n_esfera);
    
       }
     
           
       }