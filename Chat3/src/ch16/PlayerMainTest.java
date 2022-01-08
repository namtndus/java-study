package ch16;

public class PlayerMainTest {

    public static void main(String[] args) {

        Player player = new Player();
        player.play(1);

        AdvancedLevel advancedLevel = new AdvancedLevel();
        player.upgradeLevel(advancedLevel);
        player.play(2);

        SuperLevel sLevel = new SuperLevel();
        player.upgradeLevel(sLevel);
        player.play(3);
    }
}
