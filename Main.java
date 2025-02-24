public class Main {
    public static void main(String[] args) {
        Automovel a1=new Automovel("11-11-AA","Toyota",1400);//criação 1ªinstancia
        System.out.println(a1.toString());
        System.out.print("A matrícula do automóvel a1 é "+a1.getMatricula());
        System.out.print("\nNúmero de instâncias criadas até ao momento: "+ Automovel.getTotalAutomoveis());

        Automovel a2=new Automovel("22-22-BB","Fiat");//criação 2ªinstância
        System.out.print("\n"+a2.toString());
        a2.setCilindrada(1800);//registo de uma nova matricula. substitui o que lá está por uma coisa nova
        System.out.print("\n"+a2.toString());
        System.out.print("\nNúmero de instâncias criadas até ao momento: "+ Automovel.getTotalAutomoveis());


        System.out.print("\nA diferença de cilindrada (valor absoluto) entre os automóveis a1 e a2 é: "+ a1.calcularDiferencaCilindrada(a2)+" cc.");
        boolean comparacao= a1.isCilindradaMaior(a2);//*******a1.isCilindradaMaior(a2.getCilindrada)******;
        if (comparacao){
            System.out.print("\nA matrícula com a cilindrada maior é "+ a1.getMatricula());
        }else{
            System.out.print("\nA matrícula com a cilindrada maior é "+ a2.getMatricula());
        }


        if(a1.getCilindrada()>2000){
            System.out.print("\nO automóvel a1 tem cilindrada superior à do automóvel a2!\n");
        }else{
            System.out.print("\nO automóvel a1 não tem cilindrada superior à do automóvel a2!\n");
        }
    }
}
