package app;

import entidades.ContaCorrente;
import entidades.Titular;

import java.util.Scanner;

public class App {
// Criação do objeto Titular da Conta


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ContaCorrente cc1 = new ContaCorrente(1);
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite seu cpf: ");
        String cpf = sc.nextLine();
        cc1.setTitular(new Titular(nome,cpf));

        cc1.depositar(10.0);
        cc1.depositar(1050.86);
        cc1.sacar(0.87);
        System.out.println("Seu saldo é: R$ "+cc1.verificarSaldo());



    }
}
