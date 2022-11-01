package Stormtroopers;
import java.util.ArrayList;
public class Soldier {
  int speed;
  int attackradius;
  int hp;
  Soldier(int speed,int attackradius,int hp){
	  this.speed=speed;
	  this.attackradius=attackradius;
	  this.hp=hp;
  }
  Soldier(){
	  speed=0;
	  attackradius=0;
	  hp=0;
  }
  ArrayList<Soldier> sort(ArrayList<Soldier> stormtroopers){
	  int i,j;
	  Soldier key=new Soldier();
	  for(i=0;i<stormtroopers.size();i++) {
		  key=stormtroopers.get(i);
		  j=i-1;
		  while(j>=0 && stormtroopers.get(j).hp>key.hp) {
			  stormtroopers.set(j+1, stormtroopers.get(j));
			  j--;
		  }
		  stormtroopers.set(j+1, key);
	  }
	  return stormtroopers;
  }
  boolean getDamage(int damage) {
	  hp=hp-damage;
	  if(hp<0) {
		  return true;
	  }
	  return false;
  }
  void show() {
	  System.out.println("Hp: "+hp+" Speed:"+speed+" Attackradius:"+attackradius);
  }
}