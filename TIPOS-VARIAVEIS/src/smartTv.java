public class smartTv {
    boolean ligada = true;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
    public void aumentarVolume(){
        volume ++;
    }
    public void diminuirVolume(){
        volume --;}
    
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
}
