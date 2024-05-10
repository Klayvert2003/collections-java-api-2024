package list.SomaNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SomaNumeros {
    private final List<Integer> integerList;

    public SomaNumeros() {
        this.integerList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        integerList.add(numero);
    }

    public Integer calcularSoma() {
        if (!integerList.isEmpty()) {
            Integer total = 0;

            for (Integer number : integerList) {
                total += number;
            }

            return total;
        }

        throw new RuntimeException("Lista de inteiros vazia!");
    }

    public Integer encontrarMaiorNumero(){
        Collections.sort(integerList);

        return integerList.getLast();
    }

    public Integer encontrarMenorNumero(){
        Collections.sort(integerList);

        return integerList.getFirst();
    }

    public void exibirNumeros() {
        System.out.println("A lista de números é: " + integerList);
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(100000);
        somaNumeros.adicionarNumero(20);
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(30);
        somaNumeros.adicionarNumero(1000);

        somaNumeros.exibirNumeros();

        Integer soma = somaNumeros.calcularSoma();
        System.out.println("A soma dos números é: " + soma);

        Integer maiorNumero = somaNumeros.encontrarMaiorNumero();
        System.out.println("O maior número é: " + maiorNumero);

        Integer menorNumero = somaNumeros.encontrarMenorNumero();
        System.out.println("O menor número é: " + menorNumero);
    }
}
