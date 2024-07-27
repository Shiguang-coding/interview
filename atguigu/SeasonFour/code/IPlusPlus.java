/**
 * Created By Shiguang On 2024/7/27 10:59
 */
public class IPlusPlus {
    /**
     *  `i++`（后置自增）: 这个运算符在表达式中使用时，会先返回 `i` 的当前值，然后再将 `i` 的值增加,即先赋值后自增。
     *  `++i`（前置自增）: 这个运算符在表达式中使用时，会先将 `i` 的值增加 1，然后返回 `i` 的新值,即先自增后赋值。
     */
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
}
