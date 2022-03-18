# Java-1000: Core Java - For Beginners!

> _VIDEO:_ (tbd)

## Mission: The Scanner Class
If you have been craving more complex activities, then 
you are in luck!

In this activity we will employ Java's `Scanner` class 
to allow us to document & test those floating-point oddities. 
We will also need to manage some exceptions.

(1) Create public, static functions to convert strings into 
any possible `Integer`, `Float`, `Double`, or `BigDecimal` instances. 
Return `null` on error.

(2) Test the above conversions using JUnit. 
* Place your scanner's input into a `File` (optional.)

(3) Create & test a public, static function called `addNum`.
* Input: A `Scanner`.
* Processing: Aggregate individual `int`, `float`, and `double` totals.
* Processing: Ignore any other input.
* Output: Show each individual aggregation.
* Output: Show the combined values as "SIGMA".

(4) Repeat the above processing to create `addBigNum`.
* Input: A `Scanner` and `int precision`
* Processing: As per above, using only `Integer` and `BigDecimal`.
* Output: As above, yet with "SIGMA" rounded to the requested
input `precision`.

(5) Finally, create a public, static `main` to scan the
standard input for any values. 
* Note that `System.in` will 
require a `CTRL+d` / `CTRL+z` (aka "EOF") to stop the scanning process!

## Bonus:
* Update the test case to perform additional tests. 
* Ideas include
parsing multiple file-lines testing different:
  * numeric sequences
  * input test files
  * `Scanner` creations
  * as well many more numeric values.

## Challenge Activity:
- Study our implementation.
- Create & test your own version as an importable / reusable class!

### Files:
* `WordProblem.java`
* `WordProblemTest.java`
* `WpTest001.txt`

### Notes:
- Witness how BigDecimal easily accepts many numerical types.
- Notice how using `var` can save us a lot of test-creation time?
- Note that using the `var` keyword requires __JDK 10, or greater__.

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
