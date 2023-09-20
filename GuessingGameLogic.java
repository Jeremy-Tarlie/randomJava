package random;

public class GuessingGameLogic implements GuessingGame {
    private int random;
    private int life;
    private boolean win = false;
    
    public GuessingGameLogic(int random) {
        this.random = random;
        this.life = 3;
    }
    
    @Override
    public void find(int number) {
        if (this.random == number && this.life > 0) {
            System.out.println("Tu as gagné(e)");
            this.win = true;
        } else if (this.life > 0) {
            this.life--;
            System.out.println("Essaie encore");
        } else {
            System.out.println("Tu as perdu(e)");
        }
    }
    
    
}
