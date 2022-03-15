# Java-1000: Core Java - For Beginners!

> _VIDEO:_ (tbd)

## Mission: Decimal Precisions
The Internet has much to say about floating point 
accuracies. The net effect (no pun intended) of which 
easily justifies Java's creation the `BigDecimal` class. 

Worthy of several activities in its own right, the mission 
here is merely to demonstrate the basics.

(1) Create public, static functions to add, subtract, multiply, and divide `double` values.
* Inputs: `BigDecimal result` and `Double ... vals` for each.
* Processing: Ignore any `null` input for `vals`.
* Processing: Ignore `null` instance values.
* Output: A final `BidDecimal` result.

(2) Review the test case to examine BigDecimal's primitive type support.
* Notice the `.valueOf()`, `.floatValue()`, and other `.*Value()` operations.
* Notice how to extract fractional as well as whole values.

## Bonus:
* Examine the members of BigDecimal.
* What other tests might we perform?

## Challenge Activity:
- Update our tests to perform any missing / additional tests.

### Files:
* `BigD.java`
* `BigDTest.java`

### Notes:
- Notice that "boxing" is automatically performed for the input-parameters.
- Notice the use of the `D` suffix. Others are available! (e.g. `L`, `F`)
- Notice that `assertEquals` newfangled `delta` option supports result-tolerances.
- Did you see the Factory Pattern?

### p.s.
* You can help me help you by purchasing [My Training](https://www.udemy.com/course/how-to-java).
* You can also join our [Javaeers Group](https://www.facebook.com/JavaVideos9000/)!
* If you are looking for advanced lessons, consider joining the [Design, Frameworks & Threads](https://www.facebook.com/Java-Design-Frameworks-Thread-Video-Training-670850766419490) Group.

