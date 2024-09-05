/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

/**
 *
 * @author Bruno
 */

import java.util.Scanner;
import java.util.ArrayList;
import classeIMC.IMC;

public class novoTeste {
    public static void NovoTeste(Scanner scanner, ArrayList<IMC> testesIMC) {
                           
        double peso = 0;
        String nome = null;
        double altura = 0;
        
        System.out.print("Digite o código: ");
        int codigo = scanner.nextInt();
        boolean codigoJaExiste = false;
        
        for (IMC imc : testesIMC) {
            if (imc.getCodigo() == codigo) {
                codigoJaExiste = true;
                break;
            }
        }
        
        if (codigoJaExiste) {
            
            System.out.println("Código informado já existe.");
            
        } else {
            
            System.out.print("Digite seu nome: ");
            nome = scanner.next();
        
            System.out.print("Digite seu peso: ");
            peso = scanner.nextDouble();
        
            System.out.print("Digite sua altura: ");
            altura = scanner.nextDouble();
            
            IMC imc = new IMC(codigo, nome, peso, altura);
            testesIMC.add(imc);
            
            System.out.println("Dados coletados com sucesso!!");
            
        }
    }
}
