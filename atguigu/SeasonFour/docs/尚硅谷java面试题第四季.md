---
title: 尚硅谷java面试题第四季
categories: 学习笔记
tags:
  - 尚硅谷
  - 面试
abbrlink: b5ec3824
date: 2024-07-27 10:18:26
---
> 在线视频：[尚硅谷Java面试题第4季，最新大厂java面试真题](https://www.bilibili.com/video/BV13T421k794/)
>
> 课程资料：[尚硅谷Java高频面试闯关秘籍.pdf](https://pan.baidu.com/s/1Zr6ihGvDkINAraArNdfWfw?pwd=yyds)

# 开胃小菜：i++热身

> `i++`与`++i`的区别，以下回答来自`gpt-4o-mini`
>
> 在 Java 中，`i++` 和 `++i` 都是自增运算符，用于将变量 `i` 的值增加 1，但它们的使用方式和效果略有不同。
>
> 1. **`i++`（后置自增）**:
>    
>    - 这个运算符在表达式中使用时，会先返回 `i` 的当前值，然后再将 `i` 的值增加 1。
>    - 示例：
>      ```java
>      int i = 5;
>      int a = i++; // a 的值是 5, i 的值变为 6
>      ```
>    
> 2. **`++i`（前置自增）**:
>    
>    - 这个运算符在表达式中使用时，会先将 `i` 的值增加 1，然后返回 `i` 的新值。
>    - 示例：
>      ```java
>      int i = 5;
>      int a = ++i; // i 的值变为 6, a 的值也是 6
>      ```
>
> ### 总结
> - 如果你只需要增加 `i` 的值并不在意原始值，可以使用 `i++` 或 `++i`，结果是相同的。
> - 如果你在表达式中需要使用 `i` 的当前值，则选择 `i++`；如果需要使用增加后的值，则选择 `++i`。
>
> ### 示例代码
> ```java
> public class Test {
>     public static void main(String[] args) {
>         int i = 5;
>         
>         int a = i++; // a = 5, i = 6
>         System.out.println("a: " + a + ", i: " + i);
>         
>         i = 5; // 重置 i
>         int b = ++i; // b = 6, i = 6
>         System.out.println("b: " + b + ", i: " + i);
>     }
> }
> ```
>
> 运行上述代码将输出：
> ```
> a: 5, i: 6
> b: 6, i: 6
> ```

`i++`（后置自增）: 先返回 `i` 的当前值，然后再将 `i` 的值增加，即先赋值后自增。
`++i`（前置自增）: 先将 `i` 的值增加 1，然后返回 `i` 的新值，即先自增后赋值。

```java
 public static void main(String[] args) {
        int i = 1;
        System.out.println("i: " + i);
        System.out.println("++i: " + ++i);
        System.out.println("i++: " + i++);
        System.out.println("i: " + i);
        System.out.println("--i: " + --i);
        System.out.println("i--: " + i--);
        System.out.println("i: " + i);
    }
```

执行结果：

```java
i: 1
++i: 2
i++: 2
i: 3
--i: 2
i--: 2
i: 1
```

