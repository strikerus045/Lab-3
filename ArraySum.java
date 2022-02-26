
public class ArraySum {			//method
	public int sumOfArray(Integer[]a, int index) {
		//base case
		if (index==0)
		{	
			return a[index];
			}
				else
				{		//method call back						
					return a[index]+sumOfArray(a, index -1);
					}
	}
}
