public class Cilindro {
    private float raio;
    private float altura;

    public void setRaio(float r){
        raio=r;
    }
    public void setAltura(float a){
        altura=a;
    }
    public float getRaio() {
        return raio;
    }
    public float getAltura() {
        return altura;
    }

    public double volumeCilindro(){
        return (Math.PI*Math.pow(raio,2)*altura);
    }
}
