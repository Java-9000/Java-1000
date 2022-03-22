# Java-1000: Core Java - For Beginners!

> _VIDEO:_ (tbd)

## Mission: Nested Classes
Nesting one class within another need not be so uncommon!

In this case, when our evolvng `Nexus` exclusively requires 
the `CalcJob` instance, it is often a good time to __nest__ 
classes together.

Your mission is to: 
- Check the results of the __previous__ project into your GitHub fork.
- __Cut__ & past the `CalcJob` code from your __previous__ exercise into
your  __previous__ `Nexus` class.
- Update your __previous__ `main()` & test cases.

Feel free to review [our solution](Nexus.java#L209) in __this__ project if and as required.

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
* `CalcJobTest.java`

### Notes:
- Nested classes may be either `static` or not.


- Notice how `CalcJob` required an instance of `Nexus` 
to be created, first?


- Notice how the nested `CalcJob` may access that private, static `Nexus.boo`?
  - Use a non-static, nested class when you've a need to be sure that an instance of
your 'outer' class has been created and / or when the inner & outer class
__instances__ are 'tightly coupled' together.
  - See the next lesson when - as we have here - the opposite is the case.

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

