import java.util.Random;

public class Personagem {
    String nome;
    int nivel;
    int forca;

    void mostrarStatus(Personagem heroi){
        System.out.format("heroi: %s (lvl %d) com %d de força.\n", heroi.nome,heroi.nivel,heroi.forca);
    }

    int calcularDano(Personagem heroi){
        Random gerador = new Random();
        int dado20faces = 1 + gerador.nextInt(19);
        int dano = heroi.forca + dado20faces;
        return dano;
    }

    void atacar(Personagem heroi, String oponente, String habilidade){
        int dano = calcularDano(heroi);
        if(habilidade.length() == 0){
            System.out.format("%s atacou %s e causou %d de dano.\n", heroi.nome, oponente ,dano );
        }else{
            System.out.format("%s atacou %s utilizando %s e causou %d de dano.\n", heroi.nome, oponente ,habilidade,dano);
        }
    }
}
