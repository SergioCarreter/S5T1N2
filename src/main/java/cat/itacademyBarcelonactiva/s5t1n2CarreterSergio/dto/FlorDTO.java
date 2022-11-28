package cat.itacademyBarcelonactiva.s5t1n2CarreterSergio.dto;

import cat.itacademyBarcelonactiva.s5t1n2CarreterSergio.domain.Flor;

import java.util.Arrays;
import java.util.List;

// 1b

public class FlorDTO extends Flor {

    private static String[] p =  {"Alemania", "Austria", "Belgica", "Bulgaria", "Chequia", "Chipre", "Croacia", "Dinamarca",
            "Eslovaquia", "Eslovenia", "España", "Estonia", "Finlandia", "Francia", "Grecia", "Hungria", "Irlanda", "Italia",
            "Letonia", "Lituania", "Luxemburgo", "Malta", "Paises Bajos", "Polonia", "Portugal", "Rumania", "Suecia" };
    private static List<String> paises= Arrays.asList(p);

    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public static boolean esUE( String s){
        return paises.contains(s);
    }

}
