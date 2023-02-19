import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String tipo = " ";
        String color = " ";
        int llantas = 0;
        int bagones = 0;
        double combustible = 0.0;
        double velocidad = 0.0;
        Tren tren = new Tren(tipo,llantas,combustible,bagones,color,velocidad);
        Scanner sc = new Scanner(System.in);

        int opc;
        do {
            System.out.println("Menu\n 1.- Agregar\n 2.- Editar\n 3.- Mostrar\n 4.- Salir");
            System.out.println("Ingresa una opcion: ");
            opc = sc.nextInt();

            switch(opc) {

                case 1:

                    int opc2;
                    do{
                        System.out.println("Agregar datos");
                        System.out.println("1.- vehiculo \n2.- Color \n3.- Llantas \n4.- Bagones \n" +
                                "5.- combustible \n6.- Velocidad \n7.- Salir");
                        opc2 = sc.nextInt();

                        switch (opc2) {

                            case 1:
                                System.out.println("Ingresa el tipo de vehiculo: ");
                                tipo = sc.nextLine();
                                tipo= sc.nextLine();
                                tren.setTipo(tipo);
                                break;
                            case 2:
                                System.out.println("Ingresa el color del vehiculo: ");
                                color = sc.nextLine();
                                color = sc.nextLine();
                                tren.setColor(color);
                                break;
                            case 3:
                                System.out.println("Ingresa la cantidad de llantas: ");
                                llantas = sc.nextInt();
                                llantas = sc.nextInt();
                                tren.setLlantas(llantas);
                                break;
                            case 4:
                                System.out.println("Ingresa el numero de bagones del tren: ");
                                bagones = sc.nextInt();
                                tren.setBagones(bagones);
                                break;
                            case 5:
                                System.out.println("Ingresa el combustible max: ");
                                combustible = sc.nextDouble();
                                tren.setCombustible(combustible);
                                break;
                            case 6:
                                System.out.println("Ingresa la velocidad: ");
                                velocidad = sc.nextDouble();
                                tren.setVelocidad(velocidad);
                                break;
                        }}while(opc2 != 7);
                    break;

                case 2:

                    int opc3;
                    do{
                        System.out.println("Cual dato quieres editar?");
                        opc3 = sc.nextInt();

                        switch (opc3) {

                            case 1:
                                System.out.println("Ingresa el tipo de vehiculo: ");
                                tipo = sc.nextLine();
                                tipo= sc.nextLine();
                                tren.setTipo(tipo);
                                break;
                            case 2:
                                System.out.println("Ingresa el color del vehiculo: ");
                                color = sc.nextLine();
                                color = sc.nextLine();
                                tren.setColor(color);
                                break;
                            case 3:
                                System.out.println("Ingresa la cantidad de llantas: ");
                                llantas = sc.nextInt();
                                llantas = sc.nextInt();
                                tren.setLlantas(llantas);
                                break;
                            case 4:
                                System.out.println("Ingresa el numero de bagones del tren: ");
                                bagones = sc.nextInt();
                                tren.setBagones(bagones);
                                break;
                            case 5:
                                System.out.println("Ingresa el combustible max: ");
                                combustible = sc.nextDouble();
                                tren.setCombustible(combustible);
                                break;
                            case 6:
                                System.out.println("Ingresa la velocidad: ");
                                velocidad = sc.nextDouble();
                                tren.setVelocidad(velocidad);
                                break;
                        }}while(opc3 != 7);

                    break;

                case 3:
                    System.out.println("Vehiculo: "+tren.getTipo());
                    System.out.println("Color: "+tren.getColor());
                    System.out.println("Bagones: "+tren.getBagones());
                    System.out.println("Llantas: "+tren.getLlantas());
                    System.out.println("Combustible: "+tren.getCombustible()+"L");
                    System.out.println("Velocidad: "+tren.getVelocidad()+"Km/h");
                    break;

            }
        } while (opc != 4);


    }
}