
package linguagem;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class Linguagem {

   
    public static void main(String[] args) {
        
       
        String nome;
        
         Scanner leitura = new Scanner(System.in);
        
        
        System.out.print("Ola, Informe seu nome : ");
        nome = leitura.nextLine();
        
        
        
        //Pega data e horas juntos
        Date dia = new Date();
        //Pega apenas a data do formato em que esta especificado aqui embaixo
        String data = new SimpleDateFormat("dd/MM/yyyy").format(dia);
        
        Date horas = new Date();
        //Pega apena a hora do formato em que esta especificado aqui embaixo
        String hora = new SimpleDateFormat("HH:mm:ss").format(horas);
        
        //Pega a linguagem do sistema
        Locale idioma = Locale.getDefault();
       //Armazenando "idioma" em uma string como o nome linguagem 
        String linguagem = idioma.getDisplayLanguage();
        
        //Pega a resolução da sua maquina 
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        

        System.out.println("");
        System.out.println("Ola " + nome + " , você esta programando na data : " + data + " no horaio : " + hora + " e com a reolução de sua maquina = " + d.width + " x " + d.height );
        
    }
    
}
