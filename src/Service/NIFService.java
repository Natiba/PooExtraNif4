package Service;

import java.util.Scanner;
import pooguiaextranif4.NIF;

public class NIFService {

    Scanner sc = new Scanner(System.in);

    public NIF crearNif() {

        NIF dni = new NIF();

        System.out.println("Ingrese número de DNI, por favor");

        dni.setDni(sc.nextLong());
        
        return dni;

    }

    public char calcularLetra(NIF dni) {

        char[] letras = {'T', 'R', 'W','A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K','E'};
        
        int restoDni = (int) (dni.getDni() % 23);
        System.out.println("resto dni: " + restoDni);
        
        dni.setLetra(letras[restoDni]);
        
        return dni.getLetra();
        
    }

    public void mostrarNif(NIF dni) {

       //String dniCompleto = dni.getDni().concat("-" + dni.getLetra());
        System.out.println("Dni: " + dni.getDni() + "-" + dni.getLetra());
        
    }

}

// Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
//corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
//resultado del calculo.
// Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra
//en mayúscula; por ejemplo: 00395469-F).
//La letra correspondiente al dígito verificador se calculará a traves de un método que
//funciona de la siguiente manera: Para calcular la letra se toma el resto de dividir el
//número de DNI por 23 (el resultado debe ser un número entre 0 y 22). El método debe
//buscar en un array (vector) de caracteres la posición que corresponda al resto de la
//división para obtener la letra correspondiente. La tabla de caracteres es la siguiente:
