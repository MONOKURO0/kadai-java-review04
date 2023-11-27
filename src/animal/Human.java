package animal;

public class Human extends Animal implements Thinkable {
    /* フィールド */
    private String hobby; // 趣味

    /* getter */
    public String getHobby() {
        return hobby;
    }

    /* setter */
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    /* コンストラクタ */
    // 引数なし
    public Human() {
    }

    // 引数あり
    public Human(String name, int age, String hobby) {
        super(name, age); // スーパークラス(Animal)のコンストラクタを呼び出し
        this.hobby = hobby;
    }

    /* メソッド */
    // 趣味を表示するメソッド
    public void think() {
        System.out.println("私は" + this.hobby + "について考えています。");
    }

}
