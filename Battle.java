package Stormtroopers;
import java.util.ArrayList;
public class Battle {
 public static void main(String[] args) {
	 Soldier a=new Soldier(72,90,100);
	 Soldier b=new Soldier(80,60,95);
	 Soldier c=new Soldier(90,45,90);
	 SuperSolier d=new SuperSolier(100,100,120,40,"poops");
	 ArrayList <Soldier> s=new ArrayList();
	 d.savelife(40);
     s.add(a);
     s.add(b);
     s.add(c);
     s.add(d);
	 a.sort(s);
	 for(int i=0;i<s.size();i++) {
		 s.get(i).show();
	 }
 }
}