public class Main
{
  public static void main(String[] args)
  {
    System.out.println("------------------------------");

    Crypt cryptA = new CryptA();
    cryptA.encrypt("Lorem Ipsum");
    cryptA.decrypt("Lorem Ipsum");

    System.out.println("------------------------------");

    Crypt cryptB = new CryptB();
    cryptB.encrypt("Lorem Ipsum");
    cryptB.decrypt("Lorem Ipsum");

    System.out.println("------------------------------");

    Crypt cryptC = new CryptC();
    cryptC.encrypt("Lorem Ipsum");
    cryptC.decrypt("Lorem Ipsum");

    System.out.println("------------------------------");
  }
}
