
public abstract class Employee {
	BonusCalculator bonusCalculator;
	void setB(int n){

		System.out.println("  Salary "+n+" Bonus "+(bonusCalculator.computeBonus(n)));
	}
}
