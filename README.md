# Instructions  

## PRACTICUM 14 - Enhanced for Loop in Java<br>

### BACKGROUND<br>
**The Enhanced for Loop in Java**<br><br>
There is a version of the for loop, called the `enhanced for loop`
that can be conveniently used in certain situations. This version
of the for loop makes it very easy to iterate over a series of
values, as we did in the above example. By use of the enhanced
for loop, the above code could be written as follows,
```java
   int sum = 0;
   int[] exam1_grades = new int[25];
   // assume grades entered into array exam1_grades

   for(int i : exam1_grades)
     sum = sum + exam_grades[i];

   System.out.println("Exam 1 average = " + 
                       sum / (double) exams_grades.length;
```
Note that the construction of the for loop in this case is much
simplier than the "regular" for loop. All we need to do is
declare the iterator variable, `i` followed by a `:` and then
the array name iterating over. We do NOT need to provide any
code related to the length of the array (i.e., when to stop).
Java determines that on its own. This avoids common errors in
providing the wrong iteration condition, e.g.,
```java
     for(int i = 0; i <= exam_grades.length; i++);
     // the above would iterator one more than
     // the length of the way by <= and this 
     // cause a runtime error when executed
```
The enhanced for loop CANNOT, however, be used to update elements of
an array. For example, suppose we need to add one point to each
student's exam grade. We would do that as follows,
```java
   for(int i = 0; i < exam_grades.length; i++)
     exam_grades[i] = exam_grades[i] + 1;
```
This cannot be done with use of the enhanced for loop since there is
not an iteration variable (`i`) to refer to.
<br><br>
### WHAT TO DO
- `Finish the program.`
- Correct any syntax, runtime or logic errors.


