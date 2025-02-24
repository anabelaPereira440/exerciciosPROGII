public class Automovel {
    //atributos de instância, característica de cada um dos objetos
    private String matricula;
    private String marca;
    private int cilindrada;

    private static final String MATRICULA_POR_OMISSAO = "sem matrícula";//é uma constante(final). é um atributo de classe(static)
    private static final String MARCA_POR_OMISSAO = "sem marca";
    private static final int CILINDRADA_POR_OMISSAO = 0;

    private static int totalAutomoveis = 0;//contador. variável de classe(static)

    public Automovel() {//construtor-só tem public-são metodos especiais//nome do construtor SEMPRE igual ao da classe. é um construtor vazio!!!
        matricula = MATRICULA_POR_OMISSAO;
        this.marca = MARCA_POR_OMISSAO;//this ou não é igual!!!
        cilindrada = CILINDRADA_POR_OMISSAO;
        totalAutomoveis++;//contador de instância. sempre que se cria um objeto este contador acrescenta +1//não diz respeito a nenhum objeto em concreto
    }

    //public Automovel(){} //construtor vazio
    //dependendo do número de variáveis passadas vão ser chamados diferentes construtores//estes construtores e as variáveis são passadas através do main

    public Automovel(String matricula, String marca, int cilindrada){ //construir o objeto //construtor completo
        this.matricula=matricula;//o this.nome diz respeito ao atributo//o nome é o nome que foi passado por parametro//nome=nome ele fica confuso
        this.marca=marca;
        this.cilindrada=cilindrada;
        totalAutomoveis++;
    }
    public Automovel(String matricula, String marca) {
        this.matricula=matricula;
        this.marca=marca;
        this.cilindrada=CILINDRADA_POR_OMISSAO;
        totalAutomoveis++;
    }
    public Automovel(String marca, int cilindrada) {
        this.marca=marca;
        this.cilindrada=cilindrada;
        this.matricula=MATRICULA_POR_OMISSAO;
        totalAutomoveis++;
    }
    public Automovel(int cilindrada,String matricula){
        this.cilindrada=cilindrada;
        this.matricula=matricula;
        this.marca=MARCA_POR_OMISSAO;
        totalAutomoveis++;
    }
    public Automovel(String matricula){
        this.matricula=matricula;
        this.marca=MARCA_POR_OMISSAO;
        this.cilindrada=CILINDRADA_POR_OMISSAO;
        totalAutomoveis++;
    }
    public Automovel(int cilindrada){
        this.cilindrada=cilindrada;
        this.matricula=MATRICULA_POR_OMISSAO;
        this.marca=MARCA_POR_OMISSAO;
        totalAutomoveis++;
    }


    //métodos de acesso e de modificação
    public String getMatricula() {
        return matricula;
    }
    public String getMarca() {
        return marca;
    }
    public int getCilindrada() {
        return cilindrada;
    }
    public void setMatricula(String matricula) {
        this.matricula=matricula;//evita ambiguidades
    }
    public void setMarca(String marca) {
        this.marca=marca;// o "this" evita ambiguidades
    }
    public void setCilindrada(int cilindrada) {
        this.cilindrada=cilindrada;
    }


    public String toString() {
        return String.format("O automóvel com matrícula %s é um %s e tem cilindrada de %d cc. ", matricula,marca,cilindrada);
        //existe uma alternativa menos eficiente
    }

    public int calcularDiferencaCilindrada(Automovel outroAutomovel) {
        return this.cilindrada- outroAutomovel.cilindrada;//parametro implicito-parametro explicito
    }

    public boolean isCilindradaMaior(Automovel outroAutomovel) {//passar objetos por parametro
        if (this.cilindrada> outroAutomovel.cilindrada){
            return true;
        }else{
            return false;
        }
        //return this.cilindrada>outroAutomovel.cilindrada
    }
    /*public boolean isCilindradaMaior(int cilindrada){
        return this.cilindrada>cilindrada;
    }*/ //exemplo que tenho entre asteriscos

    public static int getTotalAutomoveis() { //metodo static. não está associado a nenhum objeto em concreto
        return totalAutomoveis;
    }
}
