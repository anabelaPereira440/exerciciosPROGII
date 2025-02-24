public class Automovel {
    private String matricula;
    private String marca;
    private int cilindrada;

    private static final String MATRICULA_POR_OMISSAO = "sem matrícula";
    private static final String MARCA_POR_OMISSAO = "sem marca";
    private static final int CILINDRADA_POR_OMISSAO = 0;

    private static int totalAutomoveis = 0;

    public Automovel() {
        matricula = MATRICULA_POR_OMISSAO;
        this.marca = MARCA_POR_OMISSAO;
        cilindrada = CILINDRADA_POR_OMISSAO;
        totalAutomoveis++;
    }

    public Automovel(String matricula, String marca, int cilindrada){
        this.matricula=matricula;
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
        this.matricula=matricula;
    }
    public void setMarca(String marca) {
        this.marca=marca;
    }
    public void setCilindrada(int cilindrada) {
        this.cilindrada=cilindrada;
    }


    public String toString() {
        return String.format("O automóvel com matrícula %s é um %s e tem cilindrada de %d cc. ", matricula,marca,cilindrada);
    }

    public int calcularDiferencaCilindrada(Automovel outroAutomovel) {
        return this.cilindrada- outroAutomovel.cilindrada;
    }

    public boolean isCilindradaMaior(Automovel outroAutomovel) {
        if (this.cilindrada> outroAutomovel.cilindrada){
            return true;
        }else{
            return false;
        }

    }

    public static int getTotalAutomoveis() {
        return totalAutomoveis;
    }
}
