import java.util.Scanner;

class expresion{
    String a_expresion;
    float a_numeros[];
    String a_operaciones[];
    expresion(){
        Scanner v_teclado=new Scanner(System.in);
        a_expresion="";
        a_expresion=v_teclado.nextLine();
        int v_operaciones=m_operaciones();
        if(m_valiSignos() && m_valiCifras())
            System.out.println();
    }
    void calcular(){
        calculos v_objeCalc=new calculos();
        int v_cont;
        int v_Cantidad=0;
        float v_resultado;
        for(v_cont=0;v_cont<m_operaciones();v_cont++){
            switch(a_expresion.charAt(v_cont)){
                case '+':
                    v_objeCalc.m_suma(v_resultado, p_num2)
            }
        }
    }
    boolean m_valiCifras(){
        boolean v_bandera=true;
        int v_contCifras=0;
        int v_cont=0;
        while(v_cont<a_expresion.length()){
            int v_cifras=0;
            switch(a_expresion.charAt(v_cont)){
                case '+':
                case '-':
                case '*':
                case '/':
                try{
                    Float.parseFloat(String.valueOf(a_expresion.charAt(v_cont+1)));
                    v_cifras++;
                    Float.parseFloat(String.valueOf(a_expresion.charAt(v_cont+2)));
                    v_cifras++;
                    Float.parseFloat(String.valueOf(a_expresion.charAt(v_cont+3)));
                    v_cifras++;
                }catch(Exception v_error){}
                if(v_cifras==0 || v_cifras>2)
                    v_bandera=false;
                else{
                    if(v_cifras==1)
                        a_numeros[v_contCifras++]=Float.parseFloat(String.valueOf(a_expresion.charAt(v_cont+1)));
                    else
                       a_numeros[v_contCifras++]=Float.parseFloat((String.valueOf(a_expresion.charAt(v_cont+1)+String.valueOf(a_expresion.charAt(v_cont+2)))));
                }
            }
            v_cont++;
        }
        return v_bandera;
    }
    boolean m_valiSignos(){
        boolean v_bandera=true;
        int v_cont;
        int v_signos=0;
        for(v_cont=0;v_cont<a_expresion.length();v_cont++){
            v_signos=0;
            try{
            if("-".equals(String.valueOf(a_expresion.charAt(v_cont))))
                v_signos++;
            if("+".equals(String.valueOf(a_expresion.charAt(v_cont))))
                v_signos++;
            if("*".equals(String.valueOf(a_expresion.charAt(v_cont))))
                v_signos++;
            if("/".equals(String.valueOf(a_expresion.charAt(v_cont))))
                v_signos++;
            if("-".equals(String.valueOf(a_expresion.charAt(v_cont+1))))
                v_signos++;
            if("+".equals(String.valueOf(a_expresion.charAt(v_cont+1))))
                v_signos++;
            if("*".equals(String.valueOf(a_expresion.charAt(v_cont+1))))
                v_signos++;
            if("/".equals(String.valueOf(a_expresion.charAt(v_cont+1))))
                v_signos++;
            }catch(Exception v_error){}
            if(v_signos>1)
                v_bandera=false;
        }
        return v_bandera;
    }
    int m_operaciones(){
        int v_cont=0;
        int v_cantidades=0;
        while(v_cont<a_expresion.length()){
            switch(a_expresion.charAt(v_cont)){
                case '+':
                case '-':
                case '*':
                case '/':
                v_cantidades++;

            }
            v_cont++;
        }
        return v_cantidades;
    }
}

