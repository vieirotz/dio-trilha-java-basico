import APP.AparelhoTelefonico;
import APP.NavegadorInternet;
import APP.ReprodutorMusical;

public class Iphone {
    public static void main(String[] args){

        //OBJETOS
        
        ReprodutorMusical repoduzir = new ReprodutorMusical();
        NavegadorInternet navegador = new NavegadorInternet();
        AparelhoTelefonico telefonar = new AparelhoTelefonico();


        // APLICAÇÃO DE MUSICA
        
        System.out.println("\nMUSICA\n");

        repoduzir.tocar();
        System.out.println("Ouvindo Musica");

        repoduzir.pausar();
        System.out.println("Musica foi Pausada");

        repoduzir.selecionarMusica("Bruno Mars");
        System.out.println("Ouvindo Musica Selecionada");


        // APLICAÇÃO DE INTERNET

        System.out.println("\nNAVEGACAO\n" );

        navegador.atualizarPagina();
        System.out.println("Pagina Atualizada");

        navegador.adicionarNovaAba();
        System.out.println("A aba foi adicionada");

        navegador.mostrarPagina("www.alexsandro.com.br");
        System.out.println("Site Apresentado na Tela");


        //APLICAÇÃO DE TELEFONIA

        System.out.println("\n LIGAÇÃO \n" );

        telefonar.ligar("011999999999");
        System.out.println("Ligando...");

        telefonar.atender();
        System.out.println("atendimento realizado");

        telefonar.iniciarCorreioVoz();
        System.out.println("Mensagem recebida");

        System.out.println("\n FIM \n");

    }
}
