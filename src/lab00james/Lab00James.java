package lab00james;
//PYM1501 ejerc jue/17/03/2016

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab00James {
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String nombre = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        nombre = br.readLine();
        //System.out.printf("Bienvenido : " + nombre);
        System.out.println("Bienvenido : " + nombre);
        boolean aa = (nombre.length()>0);
        System.out.println("boolean : " + aa);
        aa=!(aa);
        System.out.println("boolean negado : " + aa);
        
    }
}
