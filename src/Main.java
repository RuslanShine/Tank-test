public class Main {
    public static void main(String[] args) {
        // ? (0;0) ? fuel = 100
        Tank justTank = new Tank();
// ? (10;20) ? fuel = 100
        Tank anywareTank = new Tank(10, 10);
// ? (20;30) ? fuel = 200
        Tank customTank = new Tank(20, 30, 200);
        justTank.goForward(200);
        justTank.printPosition();
        anywareTank.goBackward(-200);
        anywareTank.printPosition();
        customTank.goForward(201);
        customTank.printPosition();
    }
}
