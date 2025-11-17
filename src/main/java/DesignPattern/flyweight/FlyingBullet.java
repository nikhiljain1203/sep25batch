package DesignPattern.flyweight;

public class FlyingBullet {
    private int x;
    private int y;
    private Bullet bullet; // Shared intrinsic state

    public FlyingBullet(int x, int y, Bullet bullet) {
        this.x = x;
        this.y = y;
        this.bullet = bullet;
    }

    public void render() {
        // Render the bullet at (x, y) using the shared bullet image
        System.out.println("Rendering bullet at (" + x + ", " + y + ")");
    }
}
