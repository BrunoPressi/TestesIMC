/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

/**
 *
 * @author Bruno
 */

import java.util.ArrayList;
import classeIMC.IMC;

public class listarTestes {
    public static void ListarTestes(ArrayList<IMC> testesIMC) {
        
        if (testesIMC.isEmpty()) {
            System.out.println("Nenhum teste encontrado...");
        } else {
            System.out.println("Listando testes...");
            for (IMC imc : testesIMC) {
                System.out.println("Código: " + imc.getCodigo());
                System.out.println("Nome: " + imc.getNome());
                System.out.println("Peso: " + imc.getPeso() + " Kg.");
                System.out.println("Altura: " + imc.getAltura() + " M.");
                System.out.printf("IMC: %.2f " + "\n", imc.calcularIMC());
                System.out.println("Classificação: " + imc.classificacao());
            }
        }
    }
}
