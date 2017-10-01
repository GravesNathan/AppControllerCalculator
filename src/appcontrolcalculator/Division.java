package appcontrolcalculator;

public class Division implements doMath{
	public void execute(Integer input1, Integer input2){
		Integer division = input1 / input2;
		System.out.println(division);
	}
	
	public int division(int i, int j) {
		return i / j;
	}
}
