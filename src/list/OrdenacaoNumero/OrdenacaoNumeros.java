package list.OrdenacaoNumero;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private final List<Integer> integerList;

    public OrdenacaoNumeros() {
        this.integerList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        integerList.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        Collections.sort(integerList);

        return integerList;
    }

    public List<Integer> ordenarDescendente() {
        Collections.reverse(integerList);

        return integerList;
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(1000);
        ordenacaoNumeros.adicionarNumero(13);
        ordenacaoNumeros.adicionarNumero(4000);
        ordenacaoNumeros.adicionarNumero(50);

        List<Integer> ordenarAscendente = ordenacaoNumeros.ordenarAscendente();
        System.out.println("A lista ordenada de forma ascendente é: " + ordenarAscendente);

        List<Integer> ordenarDescendente = ordenacaoNumeros.ordenarDescendente();
        System.out.println("A lista ordenada de forma descendente é: " + ordenarDescendente);
    }
}
