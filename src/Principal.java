import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {

        while (true){

            System.out.println("****************************************************");
            String menu = """
                *** Sea bienvenido/a al Conversor de Moneda ***
                1 - Dólar =>> Peso argentino
                2 - Peso argentino =>> Dólar
                3 - Dólar =>> Real brasileño
                4 - Real brasileño =>> Dólar
                5 - Dólar =>> Peso colombiano
                6 - Peso colombiano =>> Dólar
                7 - Salir
                *** Elija una opción válida:
                \n***********************************************""";

            System.out.println(menu);
            Scanner teclado = new Scanner(System.in);
            var opcion = teclado.nextInt();

            Scanner lectura = new Scanner(System.in);
            ConsultaMoneda consulta = new ConsultaMoneda();

            switch (opcion){

                case 1: // USD a ARS
                    System.out.println("Ingrese el valor que deseas convertir en [USD]");
                    var valor1 = Double.valueOf(lectura.nextLine());
                    Moneda moneda1 = consulta.buscaMoneda("USD", "ARS", valor1);
                    var conversion1 = moneda1.conversion_result();
                    System.out.println("El valor " + valor1 +" [" + moneda1.base_code() + "] " +
                            "corresponde al valor final de =>>> " + String.format("%.4s", conversion1) + " ["
                            + moneda1.target_code() + "]");
                    break;

                case 2: // ARS a USD
                    System.out.println("Ingrese el valor que deseas convertir en [ARS]");
                    var valor2 = Double.valueOf(lectura.nextLine());
                    Moneda moneda2 = consulta.buscaMoneda("ARS", "USD",valor2);
                    var conversion2 = moneda2.conversion_result();
                    System.out.println("El valor " + valor2 +" [" + moneda2.base_code() + "] " +
                            "corresponde al valor final de =>>> " + String.format("%.4s", conversion2) + " ["
                            + moneda2.target_code() + "]");
                    break;

                case 3: // USD a BRL
                    System.out.println("Ingrese el valor que deseas convertir en [USD]");
                    var valor3 = Double.valueOf(lectura.nextLine());
                    Moneda moneda3 = consulta.buscaMoneda("USD", "BRL",valor3);
                    var conversion3 = moneda3.conversion_result();
                    System.out.println("El valor " + valor3 +" [" + moneda3.base_code() + "] " +
                            "corresponde al valor final de =>>> " + String.format("%.4s", conversion3) + " ["
                            + moneda3.target_code() + "]");
                    break;

                case 4: // BRL a USD
                    System.out.println("Ingrese el valor que deseas convertir en [BRL]");
                    var valor4 = Double.valueOf(lectura.nextLine());
                    Moneda moneda4 = consulta.buscaMoneda("BRL", "USD",valor4);
                    var conversion4 = moneda4.conversion_result();
                    System.out.println("El valor " + valor4 +" [" + moneda4.base_code() + "] " +
                            "corresponde al valor final de =>>> " + String.format("%.4s", conversion4) + " ["
                            + moneda4.target_code() + "]");
                    break;

                case 5: // USD a COP
                    System.out.println("Ingrese el valor que deseas convertir en [USD]");
                    var valor5 = Double.valueOf(lectura.nextLine());
                    Moneda moneda5 = consulta.buscaMoneda("USD", "COP",valor5);
                    var conversion5 = moneda5.conversion_result();
                    System.out.println("El valor " + valor5 +" [" + moneda5.base_code() + "] " +
                            "corresponde al valor final de =>>> " + String.format("%.4s", conversion5) + " ["
                            + moneda5.target_code() + "]");
                    break;

                case 6: // COP a USD
                    System.out.println("Ingrese el valor que deseas convertir en [COP]");
                    var valor6 = Double.valueOf(lectura.nextLine());
                    Moneda moneda6 = consulta.buscaMoneda("COP", "USD",valor6);
                    var conversion6 = moneda6.conversion_result();
                    System.out.println("El valor " + valor6 +" [" + moneda6.base_code() + "] " +
                            "corresponde al valor final de =>>> " + String.format("%.4s", conversion6) + " ["
                            + moneda6.target_code() + "]");
                    break;

                case 7: // salir
                    System.out.println("Saliendo, Gracias por utilizar nuestros servicio");
                    break;

                default:
                    System.out.println("La opción no es valida");
            }

            if (opcion == 7){
                break;
            }
        }
    }
}
