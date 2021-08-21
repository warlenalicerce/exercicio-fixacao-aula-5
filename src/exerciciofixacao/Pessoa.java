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
    public int anoDeNascimento = 1950;
    public Double altura = 1.70;
    private String cpf = "123.456.789-10";
    
    public void calculaIdade() {
        int idadeCalculada;
        
        idadeCalculada = 2021 - anoDeNascimento;
        
        System.out.println("A idade de " + nome + " é: " + idadeCalculada);
    }
    
    public void mostraInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Ano de nascimento: " + anoDeNascimento);
        System.out.println("Altura: " + altura);
        System.out.println("CPF: " + cpf);
    }
}
