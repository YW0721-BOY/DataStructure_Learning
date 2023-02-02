## HashMap与HashSet的区别
HashSet的底层就是基于HashMap实现的。

HashMap|HashSet
----|----
实现了Map接口|实现了Set接口
存储键值对|仅存储对象
调用put()向map中添加元素|调用add()方法向Set中添加元素
HashMap使用键（Key）计算hashcode|HashSet使用成员对象来计算hashcode,对于两个对象来说hashcode可能相同，所以equals()方法用来判断对象的相等性

### HashMap常见的方法
