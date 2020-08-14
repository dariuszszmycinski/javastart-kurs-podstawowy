package exercise2;

class Sell {
    Ticket createTicket(Movie movie, Client client){
        if (movie.getFreeSeats() == 0) {
            System.out.println("Brak wolnych miejsc na wskazany seans");
            return null;
        } else if (client.getAge() < movie.getAgeRequired()) {
            System.out.println("Film dostępny dla osób powyżej " + movie.getAgeRequired() + " lat");
            return null;
        } else {
            int ticketId = movie.getMaxSeats() - movie.getFreeSeats() + 1;
            movie.setFreeSeats(movie.getFreeSeats() - 1);
            return new Ticket(ticketId, movie, client);
        }
    }
}
