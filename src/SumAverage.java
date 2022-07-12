/**
 * Compute the sum and average for running integers using loop.
 */
public class SumAverage {
  /**
   * Computes sum of running integers from a lower bound to an upper bound.
   *
   * @param lowerBound lower bound
   * @param upperBound upper bound
   * @return sum of integers
   */
  public static int sum(int lowerBound, int upperBound) {
    // TODO fill in code here using for loop and replace the return statement
    int forSum = 0;

    for (; lowerBound <= upperBound; lowerBound++) {
      forSum = forSum + lowerBound;
    }
    return forSum;
  }

  /**
   * Computes sum of running integers from a lower bound to an upper bound within an array.
   *
   * @param numbers running integers array
   * @return sum of integers
   */
  public static int sum(int[] numbers) {
    // TODO fill in code here using for each loop and replace the return statement
    int forEachSum = 0;

    for (int i : numbers) {
      forEachSum += i;
    }
    return forEachSum;
  }

  /**
   * Computes average of running integers from a lower bound to an upper bound.
   *
   * @param lowerBound lower bound
   * @param upperBound upper bound
   * @return average of integers
   */
  public static double average(int lowerBound, int upperBound) {
    // TODO fill in code here using while loop and replace the return statement
    double sumTotal = 0;
    int counter = 0;

    while (lowerBound <= upperBound) {
      counter++;
      sumTotal += lowerBound;
      lowerBound++;
    }
    return sumTotal/counter;
  }

  /**
   * Computes average of running integers from a lower bound to an upper bound within an array.
   *
   * @param numbers running integers array
   * @return average of integers
   */
  public static double average(int[] numbers) {
    // TODO fill in code here using do-while loop and replace the return statement
    int i = 0;
    double doWhileSum = 0;

    do {
      doWhileSum += numbers[i];
      i++;
    } while (i < numbers.length);
    return doWhileSum / i;
  }
}