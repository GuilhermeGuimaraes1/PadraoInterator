/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraointerator;

/**
 *
 * @author Guilherme
 */
public class PadraoInterator {

    public static void main(String[] args) {
        AgregadoDeCanais canaisDeEsportes = new CanaisEsportes();
        System.out.println("Canais de Esporte:");
        for (IteradorInterface it = canaisDeEsportes.criarIterator(); !it
                .isDone(); it.next()) {
            System.out.println(it.currentItem().nome);
        }

        AgregadoDeCanais canaisDeFilmes = new CanaisFilmes();
        System.out.println("\nCanais de Filmes:");
        for (IteradorInterface it = canaisDeFilmes.criarIterator(); !it
                .isDone(); it.next()) {
            System.out.println(it.currentItem().nome);
        }
    }

}
