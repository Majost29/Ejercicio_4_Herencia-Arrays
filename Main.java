import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Hello mundo!");
    int opcion;
    boolean salir=false;
    Scanner Ejercicio3=new Scanner(System.in);
    //Menu de Opciones

    System.out.println("-----------------Menú de Opciones-------------");
    System.out.println("1.Ejercicio armario y madera");
    System.out.println("2.array");
    System.out.println("3.Salir");
    System.out.println("----------------------------------------------");
    System.out.println("");
    opcion= Ejercicio3.nextInt();

    switch(opcion){
      case 1:{
        System.out.println("Ingrese el costo del armario");
        int costo= Ejercico3.nextInt();
        ejercicio.close();
        
      }break;
      case 2:{
        
      }break;{
        case 3:{
        salir=true;
        }break;
      default:
        System.out.println("La opción ingresada no se encuentra dentro de los parámetros");
      }
    }
  }
}

// crear una carpeta que se llame clases en donde existira dos clases denominadas madera y armario donde armario tendra las propiedades de manera pero madera no tendra las propiedades de armario, luego en mi funcion principal ingresare un costo y me imprimira en consola las proipedades de armario y madera con respecto al precio 0
// ejercicio num 2 dado el valor de un array predefinido pedir al usuario qu eingrese un valor dentro del array sobrescribiendo el valor ya existe predefinido luego recuperar el valor perdido 