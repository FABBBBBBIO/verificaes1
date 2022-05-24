/**
 * questa classe permette di creare oggetti di tipo player
 */
public class Player extends Thread{
    public String nome;
/**
 * questo costruttore va ad impostare il nome del player
 * @param nome
 */
    public Player(String nome){
        this.nome=nome;
        
    }
    /**
     * Questo get ritorna il nome del player
     * @return
     */
    public String getPlayer(){
        return this.nome;
    }
    /**
     * questo set serve a settare il nome del player
     * @param nome
     */
    public void setPlayer(String nome){
        this.nome=nome;
    }
   /**
    * metodo del thread che permette di simulare un lancio di due dadi per poi farne la somma
    */
   @Override
   public void start(){
       int numero=(int)(Math.random()*7);
       int numero2=(int)(Math.random()*7);
       if(numero == 0 || numero2 ==0){
            numero=(int)(Math.random()*7);
            numero2=(int)(Math.random()*7);
       }
       int somma=numero+numero2;
       System.out.println("al giocatore "+nome+" è uscito il numero "+numero +" e il numero "+numero2);
       System.out.println("il giocatore "+nome+" ha ottenuto un punteggio di:" +somma);
       if(numero == numero2){
        int numero3=(int)(Math.random()*7);
            if(numero3==0){
                numero3=(int)(Math.random()*7);
            }
           System.out.println("lancio bonus: "+numero3);
           int somma2=somma+numero3;
           System.out.println("il giocatore "+nome+" ha ottenuto un punteggio di:" +somma2);
       }
   }
}
