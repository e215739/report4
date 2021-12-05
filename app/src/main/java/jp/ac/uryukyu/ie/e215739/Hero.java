package jp.ac.uryukyu.ie.e215739;

/**
 * ヒーロークラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Hero {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name ヒーロー名
     * @param maximumHP ヒーローのHP
     * @param attack ヒーローの攻撃力
     */
    public Hero (String name, int maximumHP, int attack) {
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    /**
     * Enemyへ攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、hero.wounded()によりダメージ処理を実行。
     * @param e 攻撃対象
     */
    public void attack(Enemy e){
        int damage = (int)(Math.random() * attack);
        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, e.getName(), damage);
        e.wounded(damage);
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", name);
        }
    }

    /**
     * メンバ変数「name」に値を設定するメソッド
     * @param _name　設定したいname
     */
    public void setName(String _name){
        this.name = _name;
    }
    
    /**
     * メンバ変数「name」を取得するメソッド
     * @return　取得したいname
     */
    public String getName(){
        return this.name;
    }

    /**
     * メンバ変数「hitPoint」に値を設定するメソッド
     * @param _hitPoint　設定したいhitPoint
     */
    public void setHitPoint(int _hitPoint){
        this.hitPoint = _hitPoint;
    }

    /**
     * メンバ変数「hitPoint」を取得するメソッド
     * @return　取得したいhitPoint
     */
    public int getHitPoint(){
        return this.hitPoint;
    }

    /**
     * メンバ変数「attack」に値を設定するメソッド
     * @param _attack　設定したいattack
     */
    public void setAttack(int _attack){
        this.attack = _attack;
    }

    /**
     * メンバ変数「attack」を取得するメソッド
     * @return　取得したいattack
     */
    public int getAttack(){
        return this.attack;
    }

    /**
     * メンバ変数「dead」に値を設定するメソッド
     * @param _dead　設定したいdead
     */
    public void setDead(boolean _dead){
        this.dead = _dead;
    }

    /**
     * メンバ変数「dead」を取得するメソッド
     * @return　取得したいdead
     */
    public boolean getDead(){
        return this.dead;
    }

}