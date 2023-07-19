## Compare Equals and operator ==
- Equals: so sánh dựa trên giá trị của biến
- Operator ==: so sánh bộ nhớ đang trỏ tới

## Mọi objiect  = new Object() được lưu trên Heap

## Result 10/0
- Exception / by zero

## 
```java
int x = 10, y = 20, a = 30;
if(x < y || x / 0 == 0){
    System.out.println("if");
}
else{
    System.out.println("else");
}
```
> Result: if

```java
int x = 10, y = 20, a = 30;
if(x < y && x / 0 == 0){
    System.out.println("if");
}
else{
    System.out.println("else");
}
```
> Result: Exception / by zero


```java
int x = 10, y = 20, a = 30;
if(x > y && x / 0 == 0){
    System.out.println("if");
}
else{
    System.out.println("else");
}
```
> Result: else