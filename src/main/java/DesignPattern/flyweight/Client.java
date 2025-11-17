package DesignPattern.flyweight;

public class Client {
    public static void main(String[] args) {
        Bullet bullet1 = new Bullet(new int[]{0,1,2,3,4,5,6,7,8,9});

        for(int i = 0; i < 5; i++) {
            FlyingBullet flyingBullet = new FlyingBullet(i * 10, i * 15, bullet1);
            flyingBullet.render();
        }

        System.out.println("Total Bullet objects created: 1");
    }
}
