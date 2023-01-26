package hello.core.singleton;

public class SingletonService {
    private static final SingletonService instance = new SingletonService();
    //static 키워드로 선언해서 class 레벨에 올라감

    public static SingletonService getInstance() {
        return instance;
    }

    //private 키워드를 사용해서 외부에서 또 생성하는 것을 막음
    private SingletonService() {
    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
