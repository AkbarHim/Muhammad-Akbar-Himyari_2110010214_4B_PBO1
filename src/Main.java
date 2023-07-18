
public class Main {
     public static void main(String[] args) {
        Orang  orang= new Orang("Akbar", 25);
        orang.introduce();

        Murid murid = new Murid("Himyari", 20,"");
        murid.introduce();

        // Polymorphism
        Orang anotherOrang = new Murid("Putri", 22,"");
        anotherOrang.introduce();

        // Looping
        Orang[] people = new Orang[3];
        people[0] = orang;
        people[1] = murid;
        people[2] = anotherOrang;

        for (Orang p : people) {
            p.introduce();
        }
    }
    
}
