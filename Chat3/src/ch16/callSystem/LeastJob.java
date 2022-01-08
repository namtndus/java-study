package ch16.callSystem;

public class LeastJob implements Scheduler{
    @Override
    public void getNextCall() {
        System.out.println("대기가 적은 상담원이 상담 전화를 대기열에서 가저옵니다");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("다음 순서의 상담원에게 배분합니다");
    }
}
