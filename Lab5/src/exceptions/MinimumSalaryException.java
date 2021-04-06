package exceptions;

//exercise 3

public class MinimumSalaryException extends Exception {
	MinimumSalaryException(String salary)
	{
		super(salary);
	}
}
