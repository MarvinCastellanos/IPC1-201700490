
package menu;
import java.util.Scanner;
import menu.*;

public class tableroMenu {

    private int op;
    private Scanner lector;
    private boolean status;
    principalMenu tablero;
    
    public tableroMenu() {
        lector = new Scanner(System.in);
        status = true;
        
    }
    
    public void muestraMenu(){
        System.out.println("Menu Tablero\n");
        System.out.println("1)Ingresar barcos");
        System.out.println("2)Cambiar cantidad de intentos");
        System.out.println("3)Iniciar juego");
        System.out.println("4)Visualizar tablero");
        System.out.println("5)Reiniciar tablero");
        System.out.println("6)Regresar");
        op = lector.nextInt();
        opcionesMenuT(op);
    }
    
    private void opcionesMenuT(int _op){
        do{
            switch(_op){
            case 1:System.out.println("Ingresar barcos");
                break;
            case 2:System.out.println("Cambiar cantidad de intentos");
                break;
            case 3:System.out.println("Iniciar Juego");
                break;
            case 4:System.out.println("Visualizar Tablero");
                break;
            case 5:System.out.println("Reiniciar Tablero");
                break;
            case 6:System.out.println("Regresar");
                break;
            default:System.out.println("Opcion invalida");
                break;
        }
            break;
        }while(status);
    }
    
}
