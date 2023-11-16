public class usuarioTv {
    public static void main(String[] args) {
        
        smartTv smartTv = new smartTv();

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal atual? " + smartTv.canal);
        System.out.println("Volume atual? " + smartTv.volume);
        
        smartTv.mudarCanal(13);
        System.out.println("Canal atual? " + smartTv.canal);

    }
    
}
