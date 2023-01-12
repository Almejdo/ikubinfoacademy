package UshtNEKlase;

public class LlogariCasti extends Llogaria {
    private double limitOverdraft;

      public LlogariCasti(double limitiOverdraft){
          super();
          this.limitOverdraft = limitiOverdraft;
      }

      public double terhiqShumen(double shuma) {
          double balanca = super.getBalanca();
          double balancaMeOverdraft = balanca + this.limitOverdraft;
          if(balancaMeOverdraft < shuma){
              System.out.println("Keni kaluar shumen");
          }
          else{
              if(shuma >= balanca){
                  balanca = 0;
                  this.limitOverdraft = balancaMeOverdraft - shuma;
              }
              else{
                  balanca -= shuma;
              }
          }
          setBalanca(balanca);
          return getBalanca();

      }


      public void setLimitOverdrafti(int limit){
          this.limitOverdraft = limit;
      }

    public double getLimitOverdrafti() {
        return limitOverdraft;
    }
}
