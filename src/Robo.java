public class Robo {
    final String nome;
    final String cor = "Azul";
    final String tracao = "esteiras";
    int nivelBateriaAtual;
    final Boolean antena = true;
    Boolean radio;
    Boolean bracoD;
    Boolean bracoE;
    final float velMax = 5.0f;
    final float peso;
    final float pesoCargaMax = 20.0f;
    float posicaoX;
    float posicaoY;

    int orientacao;
    static final int FRENTE = 0;
    static final int ATRAS = 1;
    static final int ESQUERDA = 2;
    static final int DIREITA = 3;

    public void setOrientacao (char tecla){
        switch (tecla){
            case 'w':
                this.orientacao = FRENTE; break;
            case 's':
                this.orientacao = ATRAS; break;
            case 'a':
                this.orientacao = ESQUERDA; break;
            case 'd':
                this.orientacao = DIREITA; break;    
        }
    }

    //construtores

    public Robo(String nome, float peso){
        this.nome = nome;
        this.peso = peso;
    }
    public Robo(String nome, float peso, float posX, float posY){
        this.nome = nome;
        this.peso = peso;
        this.posicaoX = posX;
        this.posicaoY = posY;
    }

    public Robo() {

    }

    public void move(float posX, float posY){
        this.posicaoX = posX;
        this.posicaoY = posY;
    }

    public void move (float pos){
        this.posicaoY = pos;
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
        System.out.println("---------------------------------------------------------------------");
    }

    public void printPos (){
        System.out.println("Analisando minhas coordenadas, estou na posição: ("+ posicaoX +","+ posicaoY+ ") da sala.");
    }
    
//classe acima
}