package designpatterns.structuraldp.proxy.virtualproxy;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        //Calling Movie without proxy, just for creating objects it takes time
        /*Video movie = new Movie("Shawshank Redemption");
        Video movie2 = new Movie("Batman rises");
        Video movie3 = new Movie("Odessey");*/

        Video movie = new MovieProxy("Shawshank Redemption");
        Video movie2 = new MovieProxy("Batman rises");
        Video movie3 = new MovieProxy("Odessey");

    }
}
