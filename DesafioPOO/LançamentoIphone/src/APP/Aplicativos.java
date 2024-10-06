package APP;
public class Aplicativos {
    
    //NAVEGADOR DE INTERNET

    

    public void mostrarPagina(String url){
        System.out.println("Abrindo o site " + url );
    }

    public void adicionarNovaAba(){
        System.out.println("Adicionando Nova Aba");
    }

    public void atualizarPagina(){
        System.out.println("Atualizando Pagina");
    }


    //REPRODUTOR DE MUSICA

    public void tocar(){
        System.out.println("Tocando Musica");
    }

    public void pausar(){
        System.out.println("Musica Pausada");
    }

    public void selecionarMusica(String musica){
        System.out.println("Selecionado a musica do " + musica);
    }


    // TELEFONE

    public void ligar(String telefone){
        System.out.println("Ligando para " + telefone);
    }

    public void atender(){
        System.out.println("Atendendo");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Abrindo Mensagem de Voz");
    }
}


