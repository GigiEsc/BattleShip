
package battle;

/**
 *
 * @author GigiEsc
 */
import java.util.Scanner; 
public class Battle {
   
 public static void main(String[] args) {
        // TODO code application logic here
    Scanner s = new Scanner (System.in);


//Vamos a iniciar con un pequeño titulo nuestro juego 
//Para dar a conocer las instrucciones de el. 
    System.out.println("Bienvenido a Batalla Naval");
    System.out.println("Tendras que derrotar a tu oponente ingresando coordenadas");
    System.out.println("Manos a la Obra, Capitan");
    System.out.println("                                             "); 
    
 
 
   //Creacion del Tablero 
//declaramos que tan grande sera nuestro tablero, 
    //En este caso sera 6 x 6 
  char tablero[][] = new char [9][9];
       for (int i=0; i<9; i++)
        for (int j=0; j<9; j++)
         tablero[i][j]='_';  
       
       //Incluimos un pequeño ciclo que imprima las lineas que tendra nuestro tablero
       
         for (int i=0; i<9; i++)
         {
             for (int j=0; j<9; j++)
             {
                 System.out.print(tablero[i][j]);
                 System.out.print(" ");
             }
             System.out.println(" ");
         }
        
  //Aqui se creo un ciclo, las veces que se muestra el tablero 
  //En nuestro juego, primero se declararon los tiros que el jugador posee 
  // para terminar luego de 9 tiros 
     int tiros = 0;
  
    
 do 
  {     
     
 //Aquile pediremos al usuario que ingrese las coordenadas
 //Para iniciar el ataque al oponente.     
 //Declaramos variables para fila y para columna y pedimos que la ingrese.   
   int col = 0;    
   int fila =0; 
   tiros+=1; 
   //Muestra el tiro actual del jugador
   
    System.out.println("                                             ");       
    System.out.println("Tu tiro actual es el"+ "  "+ tiros);    
    System.out.println("                                             "); 
   
    
    System.out.println("                                             ");    
    System.out.println("Ingrese donde quiere atacar, Capitan");
    System.out.println("Fila:");
    fila=s.nextInt();
    System.out.println("Columna");
    col=s.nextInt();
    
    
    
    
//En esta parte, lo que deseamos hacer es por cada ataque 
    //Que nos muestre donde se realizo y si cayo en un buque
    //Declaramos que cuando nuestro tablero tenga fila y columna ingresada por 
    //Usuario sea igual a un * para indicar que cayo un golpe
 
    tablero[fila][col]='*';
    
       for (int i=0; i<9; i++)
         {
             for (int j=0; j<9; j++)
             {
                 System.out.print(tablero[i][j]);
                 System.out.print(" ");
             }
             System.out.println(" ");
         }   
       
         
     //Aqui encontramos que si en algun caso nuestro usuario tira en la fila
     //Indicada se imprimira un mensaje diciendole que su tiro esta bien
     //Esto es solamente para indicar que los buques estan en esa area
     // Al final se le coloco un mensaje automatico, que si nuestro usuario no ingresa ninguno
     // de los casos que diga que su disparo cayo en el Agua. 
       
    //Buque 1: Ubicacion
     int buques =0; 
     switch (buques)
     {
         case 1:   
           if (fila==2 && col ==0)
           {
           System.out.println("                                             ");    
           System.out.println("                                             ");    
           System.out.print ("El disparo cayo en BUQUE!");
           System.out.println("                                             ");    
           System.out.println("                                             ");    
           } break; 
           
           
         case 2: 
          if (fila==2 && col ==1)
           {
           System.out.println("                                             ");    
           System.out.println("                                             ");    
           System.out.print ("El disparo cayo en BUQUE!");
           System.out.println("                                             ");    
           System.out.println("                                             ");    
           } break; 
         
    //Buque 2: Ubicacion   
           
         case 3:
           if (fila==5 && col ==6)
           {
           System.out.println("                                             ");    
           System.out.println("                                             ");    
           System.out.print ("El disparo cayo en BUQUE!");
           System.out.println("                                             ");    
           System.out.println("                                             ");    
           } break; 
           
           
         case 4:    
           if (fila==5 && col ==7)
           {
           System.out.println("                                             ");    
           System.out.println("                                             ");    
           System.out.print ("El disparo cayo en BUQUE!");
           System.out.println("                                             ");    
           System.out.println("                                             "); 
           
           } break;
             
         default:  
                 {
             System.out.println("                                             ");    
           System.out.println("                                             ");    
           System.out.print ("El disparo cayo en AGUA!");
           System.out.println("                                             ");    
           System.out.println("                                             "); 
         }
     }
         
 } 
 

 // Para que nuestro ciclo acabe, y el jugador no acierta, que termine luego de 
 // 9 tiros, y que envie un mensaje dejandole saber que se le acabaron los tiros. 
 
 while (tiros<9);
 {
     System.out.println ("Se te acabaron los tiros");
     System.out.println ("Fin del Juego");
 }  
 
}      
} 
  

            
       
 



