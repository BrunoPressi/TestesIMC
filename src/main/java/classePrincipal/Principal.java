/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.Principal to edit this template
 */
package classePrincipal;

/**
 *
 * @author Bruno
 */

import java.util.ArrayList;
import java.util.Scanner;
import classeIMC.IMC;
import static metodos.novoTeste.NovoTeste;
import static metodos.listarTestes.ListarTestes;
import static metodos.excluirTeste.ExcluirTeste;

public class Principal {
    public static void main(String[] args) {
        
        ArrayList<IMC> testesIMC = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        char opcao;
        
        do {
            System.out.println("Menu Calculadora de IMC");
            System.out.println("N - Novo teste");
            System.out.println("E - Excluir teste");
            System.out.println("L - Listar testes armazenados");
            System.out.println("S - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.next().toUpperCase().charAt(0);
            
            switch(opcao) {
                case 'N' -> {
                    NovoTeste(scanner, testesIMC);
                    break;
                }
                case 'E'-> {
                    ExcluirTeste(scanner, testesIMC);
                    break;
                }
                case 'L' -> {
                    ListarTestes(testesIMC);
                    break;
                }
                case 'S' -> {
                    System.out.println("Encerrando programa...");
                    return;
                }
                default -> {
                    System.out.println("Opção inválida");
                    continue;
                }
            }
        } while (opcao != 'S');
    }    
}
