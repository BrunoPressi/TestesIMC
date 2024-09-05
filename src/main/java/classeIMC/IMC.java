/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classeIMC;

/**
 *
 * @author Bruno
 */
public class IMC {
    private int codigo;
    private String nome;
    private double peso;
    private double altura;
    
    public IMC(int codigo, String nome, double peso, double altura) {
        this.codigo = codigo;
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        
    }
    
    public int getCodigo() {
        return codigo;
    }
    
    public String getNome() {
        return nome;
    }
    
    public double getPeso() {
        return peso;
    }
    
    public double getAltura() {   
        return altura;
    }
    
    public double calcularIMC() {
        return peso / (altura * altura);
    }
    
    public String classificacao() {
        
        String classificacao;
        
        if (calcularIMC() < 18.5) {
            classificacao = "Magreza";
        } else if (calcularIMC() > 18.5 && calcularIMC() <= 24.9) {
            classificacao = "Normal";
        } else if (calcularIMC() > 25.0 && calcularIMC() <= 29.9) {
            classificacao = "Sobrepeso";
        } else if (calcularIMC() > 30.0 && calcularIMC() <= 39.9) {
            classificacao = "Obesidade";
        } else {
            classificacao = "Obesidade Grave";
        }
        
        return classificacao;
    }
}
