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
                    Moneda moneda1 = consulta.buscaMoneda("USD", "ARS");
                    System.out.println("Ingrese el valor que deseas convertir en [%s]".formatted(moneda1.base_code()));
                    var valor1 = Double.valueOf(lectura.nextLine());
                    var conversion1 = valor1*moneda1.conversion_rate();
                    System.out.println("El valor " + valor1 +" [" + moneda1.base_code() + "] " +
                            "corresponde al valor final de =>>> " + String.format("%.4s", conversion1) + " ["
                            + moneda1.target_code() + "]");
                    break;

                case 2: // ARS a USD
                    Moneda moneda2 = consulta.buscaMoneda("ARS", "USD");
                    System.out.println("Ingrese el valor que deseas convertir en [%s]".formatted(moneda2.base_code()));
                    var valor2 = Double.valueOf(lectura.nextLine());
                    var conversion2 = valor2*moneda2.conversion_rate();
                    System.out.println("El valor " + valor2 +" [" + moneda2.base_code() + "] " +
                            "corresponde al valor final de =>>> " + String.format("%.4s", conversion2) + " ["
                            + moneda2.target_code() + "]");
                    break;

                case 3: // USD a BRL
                    Moneda moneda3 = consulta.buscaMoneda("USD", "BRL");
                    System.out.println("Ingrese el valor que deseas convertir en [%s]".formatted(moneda3.base_code()));
                    var valor3 = Double.valueOf(lectura.nextLine());
                    var conversion3 = valor3*moneda3.conversion_rate();
                    System.out.println("El valor " + valor3 +" [" + moneda3.base_code() + "] " +
                            "corresponde al valor final de =>>> " + String.format("%.4s", conversion3) + " ["
                            + moneda3.target_code() + "]");
                    break;

                case 4: // BRL a USD
                    Moneda moneda4 = consulta.buscaMoneda("BRL", "USD");
                    System.out.println("Ingrese el valor que deseas convertir en [%s]".formatted(moneda4.base_code()));
                    var valor4 = Double.valueOf(lectura.nextLine());
                    var conversion4 = valor4*moneda4.conversion_rate();
                    System.out.println("El valor " + valor4 +" [" + moneda4.base_code() + "] " +
                            "corresponde al valor final de =>>> " + String.format("%.4s", conversion4) + " ["
                            + moneda4.target_code() + "]");
                    break;

                case 5: // USD a COP
                    Moneda moneda5 = consulta.buscaMoneda("USD", "COP");
                    System.out.println("Ingrese el valor que deseas convertir en [%s]".formatted(moneda5.base_code()));
                    var valor5 = Double.valueOf(lectura.nextLine());
                    var conversion5 = valor5*moneda5.conversion_rate();
                    System.out.println("El valor " + valor5 +" [" + moneda5.base_code() + "] " +
                            "corresponde al valor final de =>>> " + String.format("%.4s", conversion5) + " ["
                            + moneda5.target_code() + "]");
                    break;

                case 6: // COP a USD
                    Moneda moneda6 = consulta.buscaMoneda("COP", "USD");
                    System.out.println("Ingrese el valor que deseas convertir en [%s]".formatted(moneda6.base_code()));
                    var valor6 = Double.valueOf(lectura.nextLine());
                    var conversion6 = valor6*moneda6.conversion_rate();
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




        /*System.out.println("Escriba la moneda base: ");
        var base = lectura.nextLine();
        System.out.println("Escriba la moneda a convertir: ");
        var target = lectura.nextLine();
        Moneda moneda = consulta.buscaMoneda(base, target);
        System.out.println("Escriba el valor en la moneda que eligio");
        var valor = Integer.valueOf(lectura.nextLine());
        var calculo = valor*moneda.conversion_rate();
        System.out.println("Valor convertido es " + calculo + " " + moneda.target_code());*/
    }
}
