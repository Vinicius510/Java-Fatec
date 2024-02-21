//Verificar se um número é positivo ou negativo

import java.util.Scanner;

public class VerificarNum{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();
        
        if (numero > 0){
            System.out.print("O numero e positivo");
            }else{
                System.out.print("O numero e negativo");
            }
        }
    }

//Comparar dois números inteiros

import java.util.Scanner;

public class CompararNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        int numero1 = scanner.nextInt();
        System.out.print("Digite o segundo numero: ");
        int numero2 = scanner.nextInt();

        if (numero1 == numero2) {
            System.out.println("Os numero sao iguais: ");
        } else if (numero1 > numero2) {
            System.out.println("O primeiro e maior");
        } else {
            System.out.println("O segundo e maior");
        }
    }
}


//Calcular a area do quadrado ou do circulo

import java.util.Scanner;

public class CalcularArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha a opcao:");
        System.out.println("1. Calcular area do quadrado");
        System.out.println("2. Calcular area do circulo");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                System.out.print("Digite o lado do quadrado: ");
                double lado = scanner.nextDouble();
                double areaQuadrado = lado * lado;
                System.out.println("Area do quadrado: " + areaQuadrado);
                break;
            case 2:
                System.out.print("Digite o raio do circulo: ");
                double raio = scanner.nextDouble();
                double areaCirculo = Math.PI * raio * raio;
                System.out.println("Area do circulo: " + areaCirculo);
                break;
            default:
                System.out.println("Opcao invalida.");
        }
    }
}


//Exibir a tabuada de um numero

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}


//Verificar se um numero e par ou impar

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O numero e par.");
        } else {
            System.out.println("O numero e impar.");
        }
    }
}


//Calcular o fatorial de um numero

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();

        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        System.out.println("O fatorial de " + numero + " e " + fatorial);
    }
}


//Faixa etaria

import java.util.Scanner;

public class FaixaEtaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        if (idade < 18) {
            System.out.println("Menor de idade");
        } else if (idade >= 18 && idade < 60) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }
    }
}

//Somar numeros impares

import java.util.Scanner;

public class SomaNumerosImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        int n = scanner.nextInt();

        int soma = 0;
        int contador = 0;
        int numero = 1;
        while (contador < n) {
            if (numero % 2 != 0) {
                soma += numero;
                contador++;
            }
            numero++;
        }
        System.out.println("A soma dos primeiros " + n + " numeros impares e: " + soma);
    }
}


//Lista de Nomes

import java.util.Scanner;

public class ListaNomes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        System.out.print("Digite um nome para verificar se esta na lista: ");
        String nomeVerificar = scanner.nextLine();

        boolean encontrado = false;
        for (String nome : nomes) {
            if (nomeVerificar.equalsIgnoreCase(nome)) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println(nomeVerificar + " esta na lista.");
        } else {
            System.out.println(nomeVerificar + " nao esta na lista.");
        }
    }
}


//Senha Secreta

import java.util.Scanner;

public class SenhaSecreta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String senhaCorreta = "Java123";
        String senhaDigitada;

        do {
            System.out.print("Digite a senha: ");
            senhaDigitada = scanner.nextLine();
            if (!senhaDigitada.equals(senhaCorreta)) {
                System.out.println("Senha incorreta. Tente novamente.");
            }
        } while (!senhaDigitada.equals(senhaCorreta));

        System.out.println("Senha correta. Acesso permitido.");
    }
}
