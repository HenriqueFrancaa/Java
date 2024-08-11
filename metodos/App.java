public class App{
    public static void main(String[] args){
        Personagem heroi = new Personagem();
        heroi.nome = "Hércules";
        heroi.forca = 16;
        heroi.nivel = 2; 

        // "heroi: <nome> (lvl <ninvel>) com <forca> de força."
        heroi.mostrarStatus(heroi);
        heroi.atacar(heroi, "Hydra","arco");
    }
}