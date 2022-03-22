# Java-1000: Core Java - For Beginners!

> _VIDEO:_ (tbd)

## Mission: Static Class Nestings
In the last exercise, we saw that because our `Nexus` depended upon 
the `CalcJob` instance, it was a good time to __nest__ classes together.

Notice how nesting one class within another can eliminate a lot of 'class clutter.' -But naming
our classes properly can also do that! 

Unlike demonstrative naming techniques, switching between `static` and 'non-static' nesting
definitions also allows us to better manage instanced associations.

Your mission is to: 
- Check the results of the __previous__ project into your GitGub fork.
- Update your __previous__ `CalcJob` class.
  -  Redefine your __previous__ `Nexus.CalcJob` class as `static`.
   - Update & test your code.

Feel free to review our soloution in [our Nexus](Nexus.java) project if and as required.

## Bonus:
- Update __this__ project's implementation
  - Add support for additional mathematical operations
  - Be sure to test any additions!

## Challenge Activity:
- Study our implementation
  - Create & test your own version
  - Can you add & test support for `Array<CalcJob>`?

### Files:
* `CalcNester.java`
* `Nexus.java`
* `NexusTest.java`

### Notes:
- Nested classes may be either `static` or not.
- Notice how our `static` `CalcJob` may __also__ access that private, static `Nexus.boo`. 
- Use a `static` inner-class whenever you've no need to be sure
that an instance of the 'outer' class has been created; that the 
class __instances__ are 'loosely coupled,' and / or can operate __dynamically
independent__ of each other. 

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

