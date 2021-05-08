public enum ZombieEnum {
  NORMAL      ("Normal", 20, 20, 10),
  CONEHEAD    ("Conehead", 50, 20, 10),
  BUCKETHEAD  ("Buckethead", 100, 20, 10),
  BRICKHEAD   ("Brickhead", 200, 20, 10),
  GARGANTUAR  ("Gargantuar", 600, 15000, 8),
  FOOTBALL    ("Football", 80, 20, 15);

  public final String type;
  public final int health;
  public final int damage;
  public final int speed;

  ZombieEnum(String type, int health, int damage, int speed) {
    this.type = type;
    this.damage = damage;
    this.health = health;
    this.speed = speed;
  }
}
