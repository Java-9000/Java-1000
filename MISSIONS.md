 
> This file was created by [this](./missions.py) Python script.
Learn what Python scripts [can do](https://www.udemy.com/course/python-1000/?referralCode=D3A7B607149F46D12A28) for you!
 

## Mission: Hello!
* Show a string on your computer's screen.
* Use comments in your code.
* Use `javadoc` in your code.

> Go to [Mission](./com/soft9000/M1000/A00000/MISSION.md)

## Mission: Your Main 'Params
* Learn how to read command-line parameters.
* Discover two ways to iterate through an Array.
* Review how to index an array using a subscript.

> Go to [Mission](./com/soft9000/M1000/A00100/MISSION.md)

## Mission: Main 'Param Meta
(1) Create a public, static `main` function to:
* Detect command-line parameters.
* Test for a 'null parameter.'
* Use explicit, as well as implicit `void` return conventions.

(2) Test the above using JUnit.

> Go to [Mission](./com/soft9000/M1000/A00200/MISSION.md)

## Mission: Static Member Functions
(1) Create a private, static function.
* Function to combine string parameters together.
* Input: `String[]`
* Output: `String`

(2) Call the above from within your static `main` function.

(3) Test that `main` using JUnit.

> Go to [Mission](./com/soft9000/M1000/A00300/MISSION.md)

## Mission: StringBuilder
(1) Create a private, static function.
* Function to combine string parameters together.
* Inputs: `String[]`, `StringBuilder`
* Process: Add spaces between strings.
* Process: Add a newline at the end of the string.
* Output: void

(2) Create a `main`
* Check for valid parameters.
* Pass command-line parameters to the private function, above.
* Dsplay the results.

(3) Test using JUnit.

> Go to [Mission](./com/soft9000/M1000/A00400/MISSION.md)

## Mission: StringBuffer & Integral Arrays
(1) Create a private, static function.
* Function to combine integrals together into an addive 'expression string.' (*)
* Inputs: `int []`, StringBuffer
* Output: void

(2) Create a public, static function.
* Function to re-use the above.
  * Inputs: `int ...`
* Output: String

> Go to [Mission](./com/soft9000/M1000/A00500/MISSION.md)

## Mission: Total `null` Detections
(1) Create a public, static function.
* Function to combine `Float` instances together into an additive 'expression string.'
* Inputs: `Float []`
* Processing: Convert `null` instance values to `0`.
* Processing: Re-use (2), below.
* Output: An additive expression string.

(2) Create a public, static function.
* Function to combine `float` values together into an additive 'expression string.' 
* Inputs: `float []`
* Output: An additive expression string.

(3) Create a JUnit `@Test` to exercise the above.
* Prove that instanced types (e.g `Float`) can be null.

> Go to [Mission](./com/soft9000/M1000/A00600/MISSION.md)

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

> Go to [Mission](./com/soft9000/M1000/A00700/MISSION.md)

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

> Go to [Mission](./com/soft9000/M1000/A00800/MISSION.md)

