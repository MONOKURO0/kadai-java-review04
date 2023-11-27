package animal;

public class Animal {
    /* フィールド */
    private String name; // 名前
    private int    age;  // 年齢

    /* getter */
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    /* setter */
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /* コンストラクタ */
    // 引数なし
    public Animal() {
    }

    // 引数あり
    public Animal(String name, int age) {
        this.name = name;
        this.age  = age;
    }

    /* メソッド */
    // 自己紹介メソッド
    public void say() {
        System.out.println(this.name + "です。" + this.age + "歳です。");
    }

}
