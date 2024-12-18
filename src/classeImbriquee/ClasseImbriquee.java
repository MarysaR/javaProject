package classeImbriquee;

public class ClasseImbriquee {
  static final double TAUX=1.2;

  static class Interne {
    public double calculTTC(double prix){
      return prix*ClasseImbriquee.TAUX;
    }
  }

  public static void main(String[] args){
    ClasseImbriquee.Interne interne = new ClasseImbriquee.Interne();
    System.out.println(interne.calculTTC(120));
  }
}

