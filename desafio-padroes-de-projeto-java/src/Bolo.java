import PassoAPasso.FazendoBolo;

public class Bolo {
    private FazendoBolo fazendoBolo;

   public Bolo() {
   }

   public void setFazendoBolo(FazendoBolo fazendoBolo) {
     this.fazendoBolo = fazendoBolo;
   }

   public void mexer() {
      this.fazendoBolo.mexer();
   }
}
