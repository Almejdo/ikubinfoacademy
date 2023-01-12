package OOP;

public class Boks {

    private  int volume;
    private String marka;
  public Boks(){
      this.volume = 0;
  }
    public Boks(String marka, int seria){
      this(300);
      this.marka = marka;
        System.out.println("Marka e boksit eshte: " + marka + " --- dhe seria e tij eshte: " + seria);

    }
    public Boks(int cmimi){
        System.out.println("Boksi kushton: " + cmimi + "L");

    }

    public   int ngrejVolumin(){
        volume++;
        return volume;
    }

    public   int ulVolumin(){
        volume--;
        if(volume < 0){
            volume = 0;
        }
        return volume;

    }

    public  void setMarka(String marka){
      this.marka = marka;
    }
    public int  getVolumi(){

      return this.volume;
    }
}
