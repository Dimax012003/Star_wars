package Stormtroopers;
import java.util.ArrayList;
public class SuperSolier extends Soldier{
 int armor;
 String specialPower;
  SuperSolier(int speed,int attackradius,int hp,int armor,String specialPower){
	  super(speed,attackradius,hp);
	  this.armor=armor;
	  this.specialPower=specialPower;
  }
  SuperSolier(){
	  super();
	  armor=0;
	  specialPower="";
  }
 boolean savelife(int damage) {
	 hp=hp-damage;
	if(hp<0) {
	   if(hp+armor>0) {
		 return true;
	    }
	   else return false;
	 }
	 if(hp>0) {
		 return true;
	 }
	 return false;
 }
 void show() {
	 super.show();
	 System.out.print("Armor: "+armor+" SpecialPower: "+specialPower);
 }
}