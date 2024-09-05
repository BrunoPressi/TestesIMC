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
import java.util.Scanner;
import classeIMC.IMC;

public class excluirTeste {
    public static void ExcluirTeste(Scanner scanner, ArrayList<IMC> testesIMC) {
        
        int indiceExclusao;
        
        if (testesIMC.isEmpty()) {
            System.out.println("Nenhum teste para ser excluido.");
        } else {
            for (IMC testes : testesIMC) {
                System.out.println("Código: " + testes.getCodigo());
                System.out.println("Nome: " + testes.getNome());
            }
            System.out.print("Digite o código do teste que deseja excluir:");
            indiceExclusao = scanner.nextInt();
            
            boolean removido = testesIMC.removeIf(testes -> testes.getCodigo() == indiceExclusao);

            if (removido) {
                System.out.println("Objeto com código " + indiceExclusao + " removido.");
            } else {
                System.out.println("Código " + indiceExclusao + " não encontrado.");
            }
        }
    }
}
