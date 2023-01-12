package Seanca7Usht3;

public class Katrori extends PerimetriSiperfaqja {
    private double brinja;

    public Katrori(double brinja){
        this.brinja = brinja;
        super.perimetri = 4 * brinja;
        super.siperfaqja = brinja * brinja;

    }

    public String toString(){
            return "Katror [ brinja A=" + this.brinja + ", siperfaqja=" + siperfaqja + ", perimetri=" + perimetri;
        }

}
// krijo nje klase llogaria qe ruan balancen e llogarise se nje punonjesi, deklaroni kons me dhe pa parameter , ai me
// parameter te bej inicalizimin e balances me nje input nga perdoruesi.
// deklaroni metodat get dhe set, me ane te kesaj llogarie bejm depozitimin e nje shume (nuk lejohet te behet depozitimi i
//nje shume negative, nqs shuma esht negative te printohet shuma eshte negative,,, veprimi terheqjes se lekeve
// ne rast se shuma qe kerkohet te terhiqet eshte me e madhe see shuma e llogaris se ketij personi,
// te printhoet qe shuma eshte gabim.
// bazuar ne superklasen llogaria, shtoni nje klase llogari kursimesh dhe nje klase llogari casti
//nje objekt i tipit llogari kursimesh pervec atributit ka edhe nje interes dhe me ane te tij mund te kryejme
//veprimin e shtimit te interesit mbi balancen aktuale
//nje objekt i tipit llogari casti pervec balances ka dhe nje limit overdrafti
// krijo nje main dhe printo balancen totale tenje llogarie kursimi pasi keni shtuar intersin dhe printo
// nqs nje llogari casti e ka kaluar limitin e overdraft apo jo .
