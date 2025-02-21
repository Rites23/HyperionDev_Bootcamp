package testing;

public class PrimeNumberMethod {
	  public Boolean validate(final Integer primeNumber) {
		  //To check if the number is a prime number:
	    for (int i = 2; i < (primeNumber / 2); i++) {
	      if (primeNumber % i == 0) {
	        return false;
	      }
	    }
	    return true;
	  }
	}
