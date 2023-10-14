package program;

import entities.AparelhoTelefonico;
import entities.Navegador;
import entities.NavegadorInternet;
import entities.ReprodutorMusical;

public class Iphone {
    public static void main(String[] args) {
    	
        ReprodutorMusical reprodutor = new ReprodutorMusical();
        AparelhoTelefonico telefone = new AparelhoTelefonico();
        Navegador navegador = new NavegadorInternet();

        System.out.println("Testando o Reprodutor Musical:");
        reprodutor.tocar();
        reprodutor.pausar();
        reprodutor.selecionarMusica();

        System.out.println("\nTestando o Aparelho Telefônico:");
        telefone.ligar();
        telefone.atender();
        telefone.iniciarConversaVoz();

        System.out.println("\nTestando o Navegador na Internet:");
        navegador.exibirPagina();
        navegador.adicionaNovaAba();
        navegador.atualizaPagina();
    }
}
