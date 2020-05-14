package EP1;

import java.util.Scanner;

class principal{
    public static void main(String[] args) {
        datos v_datos=new datos();
    }
}
class datos{
    String a_datos;
    datos(){
        int v_enteros, v_flotantes, v_cadenas;
        v_enteros=v_flotantes=v_cadenas=0;
        enteros v_objeEntero=new enteros();
        flotantes v_objeFlotante=new flotantes();
        Scanner v_teclado=new Scanner(System.in);
        boolean v_bandera;
        a_datos="";
        v_bandera=true;
        String v_opcion="0";
        do{
            System.out.println("ingresar 1 para continuar, otra tecla para terminar");
            v_opcion=v_teclado.nextLine();
            if(v_opcion.equals("1")){
                a_datos=v_teclado.nextLine();
                if(v_objeFlotante.m_validar(a_datos))
                    v_flotantes++;
                else if(v_objeEntero.m_validar(a_datos))
                    v_enteros++;
                else if(a_datos!="")
                    v_cadenas++;
            }
            else
                v_bandera=false;
        }
        while(v_bandera);
        System.out.println(v_cadenas);
        System.out.println(v_enteros);
        System.out.println(v_flotantes);
    }
}
class enteros{
    enteros(){
    }
    boolean m_validar(String p_valor){
        boolean v_bandera=true;
        int v_prueba;
        v_prueba=1;
        try{
            v_prueba=Integer.parseInt(p_valor);
        }catch(Exception v_error){v_bandera=false;}
        return v_bandera;
    }
}
class flotantes{
    flotantes(){
        
    }
    boolean m_validar(String p_valor){
        boolean v_bandera=false;
        int v_prueba;
        v_prueba=0;
        try{
            while(v_prueba<p_valor.length()){
                if(".".equals(String.valueOf(p_valor.charAt(v_prueba))))
                    v_bandera=true;
                v_prueba++;
            }
        }catch(Exception v_error){v_bandera=false;}
        return v_bandera;
    }
}