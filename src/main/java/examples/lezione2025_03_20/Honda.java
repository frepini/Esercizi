package examples.lezione2025_03_20;

public class Honda implements Player {
    int x, y;

    @Override
    public void walk() {
        x++;
    }

    @Override
    public void run() {
        x = x + 2;
    }

    @Override
    public void jump() {
        y++;
    }
}