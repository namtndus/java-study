package ch16;

public class Player {

    Player(){
        level = new BeginnerLevel();
    }

    private PlayerLevel level;

    public PlayerLevel getLevel() {
        return level;
    }

    void upgradeLevel(PlayerLevel playerLevel){
        level = playerLevel;
    }

    void play(int num1){
        level.showLevelMessage();
        level.go(num1);
    }
}
