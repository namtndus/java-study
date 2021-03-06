package ch16;

public abstract class PlayerLevel {

    abstract void run();
    abstract void jump();
    abstract void  turn();
    abstract void showLevelMessage();
    void go(int num){
        run();
        for(int i =0; i<num; i++){
            jump();
        }
        turn();
    }
}
