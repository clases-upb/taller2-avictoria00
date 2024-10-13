/*
 * Este es el segundo taller de lógica de programación. En este taller deben comenzar a prácticar hacer las validaciones
 * de los datos que va a recibir la función usando los condicionales if. 
 * 
 * Como en el anterior, tenga en cuenta la siguiente rúbrica para cada ejercicio la cual, 
 * se basa en los mandamientos del programador. El taller es una herramienta para comenzar a preparar la evaluación 
 * donde los descuentos si van a ser tenidos en cuenta. 
 * Con este taller, usted irá aprendiendo a aplicar buenas prácticas en la programación.
 * 
 * La siguiente rúbrica se descuenta en cada ejercicio y es acumulativa:
 * Descuento por quemar valores en el código y no usar constantes: -0.5
 * Descuento por no implementar control de errores con trycatch: -0.8
 * Descuento por no escribir el código ordenado, identado: -0.4
 * 
 * RÉTESE, PÓNGASE A PRUEBA!!!
 * 
 */
package taller2;

public class App {

    public static void main(String[] args) {
        try {
    
        } 
        
        catch (Exception e) {
            System.out.println(e);
        }


    }


    /*
     * 1. Diseñe un algoritmo e implemente la función Calcular_saldo que reciba
     * tres enteros: la base de dinero en la taquilla, el total de recaudos y
     * el total de retiros, y retorne un entero que represente el saldo final
     * en la taquilla.
     * 
     * Valide que la base sea igual a 2.000.000. Si no es así, retorne -1.
     * 
     * saldo_taquilla = base + total recaudos - total_retiros
     * Si hay algún error, retorne -1.
     */
  public static int Calcular_saldo(int base_taq, int total_rec, int total_ret) {
        try {
            final int total_base = 2000000;
            if (base_taq != total_base) {
                return -1;
            } 
            else {
                int saldo_final = base_taq + total_rec - total_ret;
                return saldo_final;
            }

        } catch (Exception e) {
            return -1;
        }
    }
  }
    
    /*
     * 2. Diseñe un algoritmo e implemente la función Calcular_tip que reciba
     * un float representando el valor del consumo de un cliente, y devuelva
     * un string que contenga el valor de la propina (10%), el impuesto al
     * consumo (8%) y el valor total a pagar.
     * 
     * MUY IMPORTANTE:
     * 
     * El formato del string debe ser: valor comida: $### - valor propina $### -
     * valor impoconsumo $### - total a pagar $###.
     * 
     * Si hay algún error, retorne "Error en la función Calcular_tip".
     * 
     * Ademas de esto, primero valide que el valor del consumo sea mayor a 0. Si no
     * es así, retorne "Error calculando consumo".
     * 
     */
public static String Calcular_tip(float valor_con) {
  try {
            if (valor_con == 0) {
                return "erorr calulando consumo";
            } 
            else {
                float valor_prop = valor_con * 0.10f,
                        valor_imp = valor_con * 0.08f;
                float total = valor_con + valor_imp + valor_prop;
                String factura = String.format(
                        "valor comida: $%.2f - valor propina: $%.2f - valor impoconsumo: $%.2f - total a pagar: $%.2f ",
                        valor_con, valor_prop, valor_imp, total);
                return factura;
            }

        } catch (Exception e) {
            return "error en la función Calcular_Tip";
        }
    }
}

    /*
     * 3. Diseñe un algoritmo e implemente la función Obtener_puntos que reciba
     * tres enteros representando el número de partidos ganados, perdidos y
     * empatados de un equipo de fútbol, y devuelva un entero que represente
     * los puntos totales del equipo. La puntuación sigue los lineamientos
     * de la FIFA: 3 puntos por partido ganado, 1 punto por partido empatado y
     * 0 puntos por partido perdido. Si hay algún error, retorne -1.
     * 
     * Valide ademas que los partidos ganados, perdidos y empatados sean mayores o
     * iguales a 0. Si no es así, retorne -1.
     * 
     */
public static int Obtener_puntos(int p_ganados, int p_perdidos, int p_empatados) {

    try {
        int puntos_totales = 0;
            if (p_ganados < 0 || p_perdidos < 0 || p_empatados < 0) {
                puntos_totales = -1;
            } 
            else {
                puntos_totales = (p_ganados * 3) + (p_empatados * 1);
            }
            return puntos_totales;

        } catch (Exception e) {
            return -1;
        }

    }
}


    /*
     * 4. Diseñe un algoritmo e implemente la función Calcular_definitiva que
     * reciba cinco floats representando las notas (entre 0 y 5) y cinco floats
     * representando los porcentajes (que entre todos deberán sumar 1 y cada uno
     * estar entre 0 y 1),
     * y devuelva un float que represente la nota definitiva. Si algo está mal
     * con los porcentajes o con las notas, retorne -1.
     */
public static float Calcular_definitiva (float nota_1, float nota_2, float nota_3, 
    float nota_4, float nota_5, float por_1, float por_2, float por_3, float por_4, float por_5){

        try {
            if (nota_1 < 0 || nota_1 > 5 || nota_2 < 0 || nota_2 > 5 || nota_3 < 0 || nota_3 > 5 ||
            nota_4 < 0 || nota_4 > 5 || nota_5 < 0 || nota_5 > 5) {
               return -1;
            }
            if (por_1 < 0 || por_1 > 1 || por_2 < 0 || por_2 > 1 || por_3 < 0 || por_3 >1 ||
            por_4 < 0 || por_4 > 5 || por_5 < 0 || por_5 > 1) {
               return -1;
            }
            float suma_por = por_1 + por_2 + por_3 + por_4 + por_5;
            if (suma_por != 1.0f){
                return -1;
            }
            float nota_definitiva = (nota_1 * por_1) + (nota_2 * por_2) +
            (nota_3 * por_3) + (nota_4 * por_4) + (nota_5 * por_5);
            return nota_definitiva;
            
        } 
        catch (Exception e) {
           return -1; 
        }

    }

    /*
     * 5. Diseñe un algoritmo e implemente la función Calcular_para_ganar que
     * reciba cinco floats representando los porcentajes de una materia (que
     * deberán sumar 1 y estar entre 0 y 1) y cuatro floats representando las
     * primeras notas (entre 0 y 5), y devuelva un float que represente la
     * nota que deberá sacar para ganar si el puntaje mínimo es 3. Si algo
     * está mal con los porcentajes o con las notas, retorne -1.
     */

public static float Calcular_para_ganar (float porc_1, float porc_2, float porc_3,
    float porc_4, float porc_5, float not_1, float not_2, float not_3, float not_4){

        try {
           
        float suma_porcentajes = porc_1 + porc_2 + porc_3 + porc_4 + porc_5;
        if (suma_porcentajes != 1.0f){
            return -1;
        }
        if (porc_1 < 0 || porc_1 > 1 || porc_2 < 0|| porc_2 > 1 || porc_3 < 0 || porc_3 > 1 ||
        porc_4 < 0 || porc_4 > 1 || porc_5 < 0 || porc_5 > 1) {
           return -1;
        }
        if (not_1 < 0 || not_1 > 5 || not_2 < 0 || not_2 > 5 || not_3 < 0 || not_3 > 5 ||
        not_4 < 0 || not_4 > 5 ) {
           return -1;
        }
        float porcentaje_alcanzado= (not_1 * porc_1) + (not_2 * porc_2) +
        (not_3 * porc_3) + (not_4 * porc_4);

        float porcent_restante = 3 - porcentaje_alcanzado;
       
        float nota_necesitada = porcent_restante/ porc_5;
        return nota_necesitada;

        } catch (Exception e) {
            return -1;
        }

    }


    /*
     * 6. Diseñe un algoritmo e implemente la función Calcular_salario que
     * reciba cuatro enteros: cantidad de horas normales laboradas, cantidad
     * de horas extras diurnas laboradas, cantidad de horas extras nocturnas
     * laboradas, y el valor de la hora normal como un float. La función debe
     * retornar un float con el salario total. Las horas extras diurnas tienen
     * un recargo adicional del 15% sobre la hora normal, y las horas extras
     * nocturnas tienen un recargo adicional del 35% sobre la hora normal.
     * 
     * Valide que el valor de la hora normal sea mayor a 0. Si no es así, retorne
     * -1.
     * 
     * Si hay algún error, retorne -1.
     */
public static float Calcular_salario (int horas_nor, int horas_diurnas, int horas_noct, float valor_norm){

       try {
        float valor_horas_nor = valor_norm * horas_nor;
        float valor_horas_diur = ((horas_diurnas * 0.15f) + valor_horas_nor), valor_horas_noct = ((horas_noct * 0.35f)+ valor_horas_nor);
        float salario_final = valor_horas_nor + valor_horas_diur + valor_horas_noct;

        if(horas_nor < 0){
            return -1;
        }

           return salario_final;

       }
       catch (Exception e) {
         return -1;
       }

    }

    /*
     * 7. Diseñe un algoritmo e implemente la función Calcular_area_triangulo
     * que reciba dos floats representando la base y la altura de un triángulo
     * rectángulo, y devuelva un float que represente el área del triángulo.
     * 
     * Valide que la base y la altura sean mayores a 0. Si no es así, retorne -1.
     * 
     * La fórmula del área es: área = 1/2 * base * altura.
     * 
     * Si hay algún error, retorne -1.
     */
 public static float Calcular_area_triangulo (float base, float altura){
     
        try {
            if (base < 0 || altura < 0){
                return -1;
            }
            float area = ((1/2) * (base * altura) );
            return area;
        }
        catch (Exception e) {
           return -1;
        }

    }

    /*
     * 8. Diseñe un algoritmo e implemente la función Calcular_perimetro_cuadrado
     * que reciba un float representando el lado de un cuadrado, y devuelva un
     * float que represente el perímetro del cuadrado.
     * 
     * Valide que el lado sea mayor a 0. Si no es así, retorne -1.
     * 
     * La fórmula del perímetro es: perímetro = lado * 4.
     * 
     * Si hay algún error, retorne -1.
     */
 public static float Calcular_perimetro_cuadrado (float lado){

        try {
            if(lado <= 0){
              return -1;
            }

            float perimetro = lado*4;
            return perimetro;

        } catch (Exception e) {
           return -1;
        }
    }

    /*
     * 9. Diseñe un algoritmo e implemente la función Calcular_volumen_cilindro
     * que reciba dos floats representando el radio de la base y la altura de
     * un cilindro, y devuelva un float que represente el volumen del cilindro.
     * 
     * Valide que el radio y la altura sean mayores a 0. Si no es así, retorne -1.
     * 
     * La fórmula del volumen es: V = pi * radio^2 * altura, usando pi con
     * precisión de 7 decimales (3.1415927).
     * 
     * Si hay algún error, retorne -1.
     */
  public static float Calcular_volumen_cilindro (float radio_base, float altura_cilin){

        try {

            if( radio_base <= 0 || altura_cilin <= 0){
                return -1;
            }

            final float valor_pi= 3.14f;
           float area = ((1.0f / 2) * (base * altura));
            return volumen;
           
        } catch (Exception e) {
            return -1;
    }

  }

    /*
     * 10. Diseñe un algoritmo e implemente la función Calcular_area_circulo
     * que reciba un float representando el radio de un círculo, y devuelva un
     * float que represente el área del círculo.
     * 
     * Valide que el radio sea mayor a 0. Si no es así, retorne -1.
     * 
     * La fórmula del área es: área = pi * radio^2, usando pi con precisión
     * de 7 decimales (3.1415927).
     * 
     * Si hay algún error, retorne -1.
     */

public static float Calcular_area_circulo(float radio_cir){
   
    try {
       final float valor_PI = 3.14f;

       if( radio_cir <= 0){
        return -1;
       }

       float area_circ = valor_PI * (radio_cir/2);
       return area_circ;
    } catch (Exception e) {
        return -1;
    }
  }



}
