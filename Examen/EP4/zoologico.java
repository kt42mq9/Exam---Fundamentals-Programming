import java.util.Scanner;
class zoologico{
    animal a_animales;
    Scanner a_teclado;
    zoologico(){
        int v_contVacuna=0;
        a_teclado=new Scanner(System.in);
        a_animales=new animal();
        m_menu();
        switch(a_teclado.nextLine()){
            case "1":
                m_menuOpciones();
                int v_animal;
                switch(a_teclado.nextLine()){
                    case "1":
                        int v_cont=0;
                        System.out.println("Tenemos 10 palomas, elije una.");
                        v_animal=Integer.parseInt(a_teclado.nextLine());
                        for(v_cont=0;v_cont<2;v_cont++)
                            System.out.println(a_animales.a_aves.a_paloma[v_animal].a_vacuna[v_cont].a_nombre);
                    break;
                    case "2":
                    System.out.println("Tenemos 10 palomas, elije una.");
                    v_animal=Integer.parseInt(a_teclado.nextLine());
                    if(v_contVacuna<2){
                        a_animales.a_aves.a_paloma[v_animal].a_vacuna[v_contVacuna].m_agregarDatos();
                        v_contVacuna++;
                    }
                    break;
                    case "3":
                    System.out.println("Tenemos 10 palomas, elije una.");
                    v_animal=Integer.parseInt(a_teclado.nextLine());
                    System.out.println("Que vacuna deseas cambiar, solo hay 2.");
                    int v_opcion;
                    v_opcion=Integer.parseInt(a_teclado.nextLine());
                    if(v_opcion==1 || v_opcion==2)
                        a_animales.a_aves.a_paloma[v_animal].a_vacuna[v_opcion].m_agregarDatos();
                }
            break;
        }
    }
    void m_menuOpciones(){
        System.out.println("1) Listar vacunas");
        System.out.println("2) Registrar vacuna");
        System.out.println("3) Cambiar vacuna");
        System.out.print("Elije alguna opcion:");
    }
    void m_menu(){
        System.out.println("1) Paloma");
        System.out.print("Elige un animal: ");
    }
}