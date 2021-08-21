/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciofixacao;

/**
 *
 * @author warlen
 */
public class Pessoa {
    public String nome = "Carlos Eduardo";
    public int anoDeNascimento = 2010;
    public Double altura = 1.70;
    private String cpf = "123.456.789-10";
    
    public void calculaIdade() {
        int idadeCalculada;
        
        idadeCalculada = 2021 - anoDeNascimento;
        
        System.out.println("A idade de " + nome + " é: " + idadeCalculada);
    }
    
    public void verificaMaiorIdade() {
        int idadeCalculada;
        
        idadeCalculada = 2021 - anoDeNascimento;
        
        if(idadeCalculada >= 18) {
            System.out.println("É maior de idade");
        } else {
            System.out.println("É menor de idade");
        }
    }
    
    public void mostraInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Ano de nascimento: " + anoDeNascimento);
        System.out.println("Altura: " + altura);
        System.out.println("CPF: " + cpf);
    }
}
