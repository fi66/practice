public abstract class TangibleAsset{
  private String name;
  private int price;
  private String color;

public TangibleAsset(String name,int price,String color){
  this.name = name;
  this.price = price;
  this.color = color;
}
  public String getName(){ retturn this.name; }
  public int get Price(){ return this.price; }
  public String getColor(){ return this.color; }
}
