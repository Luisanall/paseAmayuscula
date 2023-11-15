package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println ( "Hello world!" );
        transfromMayusc lambda= ( List<String>paises) -> {
            List<String> lista = new ArrayList<String> ();
            for (String pais : paises) lista.add(pais.toUpperCase());
            return lista;
        };
        List<String> paisesAmayusculas = new ArrayList<String> ();
        paisesAmayusculas.add ( "argentina");
        paisesAmayusculas.add ( "brasil");
        paisesAmayusculas.add ( "venezuela");
        paisesAmayusculas.add ( "españa");
        paisesAmayusculas.add ( "colombia");
        paisesAmayusculas.add ( "uruguay");
        List<String> paseAmayuscula = lambda.transfor ( paisesAmayusculas );
        for (String pais : paseAmayuscula)
            System.out.println (pais);
    }

}