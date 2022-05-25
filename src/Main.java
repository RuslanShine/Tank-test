public class Main {
    public static void main(String[] args) {
        // Â (0;0) ñ fuel = 100
        Tank justTank = new Tank();
// Â (10;20) ñ fuel = 100
        Tank anywareTank = new Tank(10, 10);
// Â (20;30) ñ fuel = 200
        Tank customTank = new Tank(20, 30, 200);
        justTank.goForward(200);
        justTank.printPosition();
        anywareTank.goBackward(-200);
        anywareTank.printPosition();
        customTank.goForward(201);
        customTank.printPosition();
    }
}
