
public class Murid extends Orang {
    private String tinggi;

    public Murid (String nama, int umur, String tinggi) {
        super(nama, umur);
        this.tinggi = tinggi;
    }

    public String getTinggi() {
        return tinggi;
    }

    public void setTinggi(String tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public void introduce() {
        System.out.println("Hello, namaku " + getNama() + ",aku " + getUmur() + " tahun , dan tinggiku" + tinggi+ "169cm");
    } 
    
}
