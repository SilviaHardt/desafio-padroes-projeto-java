import PassoAPasso.*;
import Singleton.SingletonEager;
import Singleton.SingletonLazy;
import Singleton.SingletonLazyHolder;

public class Teste {

   public Teste() {
   }

   public static void main(String[] args) {

       SingletonLazy lazy = SingletonLazy.getInstancia();
       System.out.println(lazy);
       lazy = SingletonLazy.getInstancia();
       System.out.println(lazy);

       SingletonEager eager = SingletonEager.getInstancia();
       System.out.println(eager);
       eager = SingletonEager.getInstancia();
       System.out.println(eager);

       SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
       System.out.println(lazyHolder);
       lazyHolder = SingletonLazyHolder.getInstancia();
       System.out.println(lazyHolder);

       FazendoBolo ovo = new Ovo();
       FazendoBolo farinha = new Farinha();
       FazendoBolo leite = new Leite();
       FazendoBolo fermento = new Fermento();
       FazendoBolo misturando = new MisturandoIngredientes();
       FazendoBolo forno = new ColocandoNoForno();
       FazendoBolo pronto = new BoloPronto();

       Bolo bolo = new Bolo();
       bolo.setFazendoBolo(ovo);
       bolo.mexer();
       bolo.mexer();
       bolo.mexer();
       bolo.setFazendoBolo(farinha);
       bolo.mexer();
       bolo.setFazendoBolo(leite);
       bolo.mexer();
       bolo.setFazendoBolo(fermento);
       bolo.mexer();
       bolo.setFazendoBolo(misturando);
       bolo.mexer();
       bolo.setFazendoBolo(forno);
       bolo.mexer();
       bolo.setFazendoBolo(pronto);
       bolo.mexer();

   }
}