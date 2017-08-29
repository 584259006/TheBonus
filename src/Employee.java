
public abstract class Employee {
	BonusCalculator bonusCalculator;
	void setB(int n){

		System.out.println("ได้โบนัสเพิ่มจากเดิม  "+n+" เป็น "+(bonusCalculator.computeBonus(n)));
	}
}
