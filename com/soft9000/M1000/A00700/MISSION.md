# Java-1000: Core Java - For Beginners!

> _VIDEO:_ (tbd)

## Mission: Decimal Precisions
The Internet has much to say about floating point 
accuracies. The net effect (no pun intended) of which 
easily justifies Java's creation of the `BigDecimal` class. 

Worthy of several activities in its own right, the mission 
here is merely to demonstrate the basics.

(1) Create public, static functions to add, subtract, multiply, and divide `double` values.
* Inputs: `BigDecimal result` and `Double ... vals` for each.
* Processing: Ignore any `null` input for `vals`.
* Processing: Ignore `null` instance values.
* Processing: Perform the function-named operation.
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
- Notice that "boxing" is automatically performed on the input-parameters.
- Notice the use of the `D` suffix. Others are available! (e.g. `L`, `F`)
- Notice that `assertEquals` newfangled `delta` option supports result-tolerances.
- Did you notice the Factory Pattern?

### Java Educational Groups:
If you crave everything java - _and / or have your **own**
'stuff to share_ - then join us at the
Javaeers Groups for [Java Training Videos](https://www.facebook.com/JavaVideos9000/)
and [Java Training, General](https://www.facebook.com/groups/javatraining9000/).

Finally, if you are looking for advanced lessons, consider joining the
[Design, Frameworks & Threads](https://www.facebook.com/Java-Design-Frameworks-Thread-Video-Training-670850766419490)
Group.

### Support our efforts:
Like you, I too indeed have bills to pay as well... So you can help me help you
by [buying our training](https://www.udemy.com/course/how-to-java)?

You can [click here](../../../../MISSIONS.md) to see the mission index.
