import gui.*;
import gui.botoes.*;
import videos.Documentario;
import videos.Filme;
import videos.Novela;
import videos.Serie;


//import videos.*; importa todas as classes que estão no pacote;

public class App{
    public static void main(String[] args){
        Filme filme = new Filme(); // ou videos.Filme filme
        Filme filme2 = new Filme();
        
        Novela novela = new Novela();
        Documentario documentario = new Documentario();
        Serie serie = new Serie();

        Janela janelinha = new Janela();

        MiniaturaVideo miniatura = new MiniaturaVideo();
        BotaoPlay botaoPlay = new BotaoPlay();

    }
}
