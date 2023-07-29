public class Robo {
    String nome;
    String cor;
    String tracao;
    int nivelBateriaAtual;
    Boolean antena;
    Boolean radio;
    Boolean bracoD;
    Boolean bracoE;
    float velMax;
    float peso;
    float pesoCargaMax;
    float posicaoX = 50.0f;
    float posicaoY = 50.0f;
    //funcao
    public void move (float x, float y){
        posicaoX = x;
        posicaoY = y;
    }
    public void printStatus (){
        System.out.println("---------------------------------INFO--------------------------------");
        System.out.println("Olá, mestre! Meu nome é "+ nome + " e estou à disposição para ajudar.");
        System.out.println("Preciso te passar as minhas informações principais.");
        System.out.println("Eu sou "+ cor);
        System.out.println("Minha velocidade máxima é: "+ velMax +" m/h");
        System.out.println("Estou com " + nivelBateriaAtual +"% de bateria");
        System.out.println("Tenho "+ peso +"kg");
        System.out.println("Posso carregar até "+ pesoCargaMax +"kg");
        System.out.println("Me locomovo com as minhas "+ tracao);
        System.out.println("Minha antena está operacional? "+ antena);
        System.out.println("Meu rádio está operacional? "+ radio);
        System.out.println("Meu braço direito está operacional? "+ bracoD);
        System.out.println("Meu braço esquerdo está operacional? "+ bracoE);
        System.out.println("Analisando minhas coordenadas, estou na posição: ("+ posicaoX +","+ posicaoY+ ") da sala.");
        System.out.println("---------------------------------------------------------------------");
    }
//classe acima
//bloco executável abaixo
    public static void main(String[] args){
        Robo obj1 = new Robo();
        obj1.nome = "R-ATM";
        obj1.cor = "Azul";
        obj1.velMax = 5.0f;
        obj1.nivelBateriaAtual = 58;
        obj1.peso = 70.0f;
        obj1.pesoCargaMax = 20.0f;
        obj1.tracao = "esterias";
        obj1.antena = true;
        obj1.radio = true;
        obj1.bracoD = true;
        obj1.bracoE = true;
        obj1.move(60,50);
        obj1.printStatus(); //esse método passa todos os valores da classe Robo para o obj1
        obj1.move(65,55);
        obj1.printStatus();
    }
}