package net.greg.examples.tre;

/*
Have the function ThreeSum(arr) take the array of integers stored in arr, and determine if any three distinct numbers (excluding the first element) in the array can sum up to the first element in the array.

For example: if arr is [8, 2, 1, 4, 10, 5, -1, -1] then there are three sets of triplets that sum to the number 8: [2, 1, 5], [4, 5, -1] and [10, -1, -1].

Your program should return the string true if 3 distinct elements sum to the first element, otherwise your program should return the string false.

The input array will always contain at least 4 elements.

*/

public final class TrippLets {

  public static void main (String... varargs_blah) {

    new TrippLets().
      computeCombinatorial(UNIVERSE_BASELINE, OK_BASELINE_ID).publish().
      computeCombinatorial(UNIVERSE_GOOD, EXPECT_GOOD_ID).publish().
      computeCombinatorial(UNIVERSE_FAIL, EXPECT_FAIL_ID).publish();
  }


  private TrippLets computeCombinatorial(int[] set, String ID) {

    accum = 0;
    answer = false;


    if (set.length < 4) {
      answer = false;
    }

    INVARIANT = set[0];


    System.err.println(
      "\n\nSET \n" + ID +
      "\nReady, Set, Go, INVARIANT:  " + set[0] + "\n");


    for (int ndx=1; ndx < set.length-1; ndx++) {

      for (int ndx1=2; ndx1 < set.length-1; ndx1++) {

        for (int ndx2=3; ndx2 < set.length-1; ndx2++) {

          accum = set[ndx] + set[ndx1] + set[ndx2];

          if (accum == INVARIANT) {

            System.err.println(
              "Ans " +
              accum + " = " +
              (set[ndx]) + " + " +
              set[ndx1] + " + " + set[ndx2]);

            answer = true;
          }

          accum = 0;
        }
      }
    }

    return this;
  }


  private TrippLets publish() {

    System.err.println("\nControl " + INVARIANT);
    System.err.println("Outcome " + answer + "\n");

    INVARIANT = 0;
    accum = 0;
    answer = false;

    return this;
  }


  private static int INVARIANT;
  private static int accum;
  private static boolean answer;

  private static final String OK_BASELINE_ID = "OK_BASELINE | 8, 2, 1, 4, 10, 5, -1, -1";
  private static final String EXPECT_GOOD_ID = "EXPECT_GOOD | 10, 2, 3, 1, 5, 3, 1, 4, -4, -3, -2";
  private static final String EXPECT_FAIL_ID = "EXPECT_FAIL | 12, 3, 1, -5, -4, 7";

  private static final int[] UNIVERSE_BASELINE = { 8, 2, 1, 4, 10, 5, -1, -1 };
  private static final int[] UNIVERSE_GOOD = { 10, 2, 3, 1, 5, 3, 1, 4, -4, -3, -2 };
  private static final int[] UNIVERSE_FAIL = { 12, 3, 1, -5, -4, 7 };
}
