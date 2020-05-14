package EP3;
import java.util.Scanner;
class ecuacion{
    float a_valores[][];
    int a_multiplicador;
    float a_multiplicados[][];
    ecuacion(){
        a_multiplicados=new float[2][3];
        a_valores=new float[2][3];
        m_ingrDatos(0);
        m_ingrDatos(1);
        m_multValores();
        float v_valorY;
        v_valorY=m_resoPrimEcuacion();
        System.out.println(v_valorY);
        float v_valorX;
        v_valorX=m_resoSegundaEcuacion(v_valorY);
        System.out.println(v_valorX);
    }
    void m_ingrDatos(int p_ecuacion){
        Scanner v_teclado=new Scanner(System.in);
        int v_cont;
        for(v_cont=0;v_cont<3;v_cont++)
            a_valores[p_ecuacion][v_cont]=v_teclado.nextFloat();
    }
    void m_multValores(){
        float v_num1=a_valores[0][0];
        float v_num2=a_valores[1][0];
        int v_cont=0;
        if(v_num1>0 && v_num2>0)
            v_num1*=-1;
        else if(v_num1<0 && v_num2<0)
            v_num1*=-1;
        while(v_cont<3){
            a_multiplicados[0][v_cont]=v_num2*a_valores[0][v_cont];
            a_multiplicados[1][v_cont]=v_num1*a_valores[1][v_cont];
            v_cont++;
        }
    }
    float m_resoPrimEcuacion(){
        float v_resulY,v_resultado;
        v_resulY=a_multiplicados[0][1]+a_multiplicados[1][1];
        v_resultado=a_multiplicados[0][2]+a_multiplicados[1][2];
        return v_resultado/v_resulY;
    }
    float m_resoSegundaEcuacion(float p_Y){
        float v_resultado=0;
        v_resultado=(a_valores[0][2]+(-a_valores[0][1]*p_Y))/a_valores[0][0];
        return v_resultado;
    }
}