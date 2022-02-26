
public class ArraySum {			// recursive method
	public int sumOfArray(Integer[]a, int index) {
		//base case
		if (index==0)
		{	
			return a[index];
			}
				else
				{								//call to method
					return a[index]+sumOfArray(a, index -1);
					}
	}
}