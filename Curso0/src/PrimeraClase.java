import java.util.*;
public class PrimeraClase {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        keyboard.useLocale(Locale.US);
        System.out.println("Selecciona una opción:\n1: Crear perfil\n2: Crear\n3: Crear\n4: Crear");
        int seleccion= keyboard.nextInt();

        //hacemos el bucle
        while(seleccion>=4) {
            System.out.println("Selecciona una opción:\n1: Crear perfil\n2: Crear\n3: Crear\n4: Crear");
            seleccion= keyboard.nextInt();
        }
            switch(seleccion){
                case 1:
                    System.out.println("Hola");
                    break;
                case 2:
                    System.out.println("Hola2");
                    break;
                case 3:
                    System.out.println("Hola3");
                    break;
            }

    }
}
