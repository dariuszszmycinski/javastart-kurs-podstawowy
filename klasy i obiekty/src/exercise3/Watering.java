package exercise3;

public class Watering {
    public static void main(String[] args) {

        Plant cactus = new Plant();
        cactus.name = "Kaktus";
        cactus.description = "Roślina pustynna";
        cactus.water = 0.05;

        Plant orchidea = new Plant();
        orchidea.name = "Orchidea";
        orchidea.description = "Inaczej storczyk";
        orchidea.water = 0.25;

        Plant polypody = new Plant();
        polypody.name = "Paprotka";
        polypody.description = "Nie lubi słońca";
        polypody.water = 0.5;

        double dayly = cactus.water + orchidea.water + polypody.water;
        double weekly = dayly * 7;
        double yearly = dayly * 365;

        System.out.println("Zużycie wody dzienne: " + dayly + " litrów.");
        System.out.println("Zużycie wody tygodniowo: " + weekly + " litrów.");
        System.out.println("Zużycie wody rocznie: " + yearly + " litrów.");
    }
}
