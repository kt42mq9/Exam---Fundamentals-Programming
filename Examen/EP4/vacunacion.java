import java.util.Scanner;
class vacunacion{
    String a_nombre;
    String a_fecha;
    String a_tipoVacuna;
    String a_tiemVacuna;
    vacunacion(){
        a_nombre="";
        a_fecha="";
        a_tipoVacuna="";
        a_tipoVacuna="";
    }
    void m_agregarDatos(){
        Scanner v_teclado=new Scanner(System.in);
        System.out.println("Nombre");
        a_nombre=v_teclado.nextLine();
        System.out.println("Fecha");
        a_fecha=v_teclado.nextLine();
        System.out.println("Tipo");
        a_tipoVacuna=v_teclado.nextLine();
        System.out.println("Duracion");
        a_tiemVacuna=v_teclado.nextLine();
    }
}