import java.util.Scanner;

public class CalificacionSwitch {


        public static void main(String[] args) {

            Scanner IngreseCalificacion = new Scanner(System.in);
            System.out.println("Digite su Calificacion");
            int calificacion = IngreseCalificacion.nextInt();

            switch (calificacion){
                case 1, 2:{
                    System.out.println("Su calificación es: F");
                    break;
                }
                case 3, 4:{
                    System.out.println("Su calificación es: D");
                    break;
                }
                case 6, 5:{
                    System.out.println("Su calificación es: C");
                    break;
                }
                case 8, 7:{
                    System.out.println("Su calificación es: B");
                    break;
                }
                case 10, 9:{
                    System.out.println("Su calificación es: A");
                    break;
                }
                default:{
                    System.out.println("Número no válido, por favor verifique");
                }
            }

            }
        }


