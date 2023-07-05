package pooguiaextranif4;

import Service.NIFService;

public class POOGuiaExtraNif4 {

    public static void main(String[] args) {
        
        NIFService nif1 = new NIFService();
        
        NIF dni = nif1.crearNif();
        
       
        System.out.println("Letra: " +  nif1.calcularLetra(dni));
        System.out.println("");
        
        nif1.mostrarNif(dni);
        System.out.println("");
    }
    
}
