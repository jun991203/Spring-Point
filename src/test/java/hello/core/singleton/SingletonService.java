package hello.core.singleton;

public class SingletonService {

    // 1.  static 영역에 객체를 1개만 생성
    // static - 클래스 레벨이 올라가기 때문에 하나만 존재함
    private static final SingletonService instance = new SingletonService();

    // 2. public으로 열어서 객체 인스턴스가 필요하면 이 static 메소드를 통해서만 조회하도록 함
    public static SingletonService getInstance() {
        return instance;
    }

    // 3. 생성자를 private 으로 선언해서 외부에 new 키워드를 사용한 객체 생성을 막음
    private SingletonService() {
    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }

}
