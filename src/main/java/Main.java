public class Main {

    public static void main(String[] args) throws InterruptedException {
        Switch aSwitch = new Switch();

        Thread user = new Thread(new User(aSwitch), " Пользователь ");
        user.start();

        Thread toy = new Thread(new Toy(aSwitch), " Игрушка ");
        toy.start();

        try {
            user.join();
            System.out.println(" Поток пользователя завершился");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        toy.interrupt();
        System.out.println(" Поток игрушки завершился");
    }
}
