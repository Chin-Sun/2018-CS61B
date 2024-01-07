# Week 1 + Week 2
**Efficient & Saving Space**
- **data structure能够教会我们如何优化慢的代码，可以帮助我们修改bug。所以data structure不仅仅是while, for这些语句和数组类型，它是整个编程中最重要的核心内容**  
- **你要做的是学会它以后，能够熟练地去运用它，就像你学会了二次函数后，可以在数学中的多个领域去运用。**  
- **所以你对于data structure的掌握也要达到这个高度。通过leetcode题库里的每个题的思考，上数据结构的公开课等，坚持补上自己做题时的每一个盲点。**
- 其实每次做题，你都多一些些思考，整个结果都会不一样。
****
1. {  } & ；用来分割  
2. varaibles must be declared, such as int, string....  
3. functions (methods) are declared as a part of class

----------------------------------------------------------------
```
*  
**  
***  
****  
*****
```

```
public class Printstrings{
  public static void main(String[] args){
    string x='*';
    int i=0;

    if (i<5){
      System.out.println("x");
      x=x+*;
}
}
}
```
### Golden Rule of Equals
There are 9 types of variables in Java  
- 8 primitive types (byte, short, int, long, float, double, boolean, char)
- The 9th type is references to Objects (an arrow). References may be null.

In box-and-pointer notation, each variable is drawn as a labeled box and values are shown in the box.  
- Addresses are represented by arrows to object instances.

#### Given variables b and a:  
b = a copies all the bits from a into b 　　

#### Parameter Passing:  
This is also called **pass by value**:  Passing Parameters obeys the same rule: Simply **copy the bits** to the new scope.  


----------------------
#### What is Recursion?
- base case: stop condition
- recursion condition.

https://www.youtube.com/watch?v=IJDJ0kBx2LM

### Sentinel
A special case is not always simple. Sometimes we can use sentinel to replace the special case, which can reduce the complexity of data structure. What you need to do is use one space O（1）. Same for reducing time.

### SLList vs. IntList
使用single linked list去操作数据，使得数据结构不再naked。其实在IntList中操作的数据结构，就是naked
## 一些优化数据结构的方法(for List)
### DLList
double linked list
### Generic List
int: Integer  
double: Double  
boolean: Boolean    
string: String  
char: Character  
long: Long  
```
int-->lochNest(类似any type parameter)
SLList s = new SLList(2) ----> SLList<string> s = new SLList("bone")
```

## Array
class: W.size 调用class W的size  
array: A.(3) 第三位的内容  
In Java, every number in an array should have the same type(int/string/..), which is different in Python
