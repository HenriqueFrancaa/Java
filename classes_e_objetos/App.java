public class App{
    public static void main(String[] args){

        //Iphone 12, tela de 6.1, 256gb
        //Galaxy Note 20 Ultra, tela de 6.9, 256gb
        //Xiaomi Mi 11 pro. tela de 6.81, 128gb
        // <tipoVarivel> nomeVariavel = valor

        //Declarando um objeto do tipo celular = instanciando um objeto
        Celular celularA = new Celular();
        celularA.nome = "Iphone 12";
        celularA.tamanhoTela = 6.1f; // float tem que colocar o f no final;
        celularA.armazenamento = 256;
        celularA.sistemaOperacional = "IOS";

        System.out.format("Celular %s com tela de %f, com %d e SO %s \n", celularA.nome, celularA.tamanhoTela, celularA.armazenamento, celularA.sistemaOperacional);
        
        Celular celularB;
        celularB = new Celular();
        celularB.nome = "Galaxy Note 20 ultra";
        celularB.tamanhoTela = 6.9f; // float tem que colocar o f no final;
        celularB.armazenamento = 256;
        celularB.sistemaOperacional = "Android";

        System.out.format("Celular %s com tela de %f, com %d e SO %s \n", celularB.nome, celularB.tamanhoTela, celularB.armazenamento, celularB.sistemaOperacional);
    }
}