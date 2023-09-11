## 3. Polymorphism

- Cho phép các Oject cùng kiểu thực hiện từng behavior khác nhau dựa vào Oject của nó
- Thể hiện thông qua Overloading xảy ra compiler time
- Thể hiện thông qua Overriding xảy ra rum time nó sẽ xác định được Sub Class đang chạy chứ không phải Super Class

## 4. Abstraction

- Chỉ cần khai báo phần chung (phần cần thiết)
- Đưa ra nội dung nào quan trọng để Sub Class triển khai Method này
- Có hai hình thức thể hiện:
  - Interface
  - Abstract Class

## Interface

- Không phải là 1 Class
- Là **tập hợp các Abstract methods** (Abstract methods là method không có body)
- Một **Class** phải **Implements hết tất cả method trừu tượng**
- **Default Access Modifier** là **Public**
- Không thể tạo đối tượng từ Interface

## Astract Class

- Là 1 class
- Có thể có hoặc không các **Abstract methods**
- Không thể tạo đối tượng từ Astract Class

## Astract Class and Interface

| Astract Class                                         | Interface                              |
| ----------------------------------------------------- | -------------------------------------- |
| Có thể có hoặc không các **Abstract methods**         | Chỉ có thể có các **Abstract methods** |
| Không hỗ trợ đa hình                                  | Có hỗ trợ đa hình                      |
| Chứa các biến là final, non-final, static, non-static | Chỉ chứa static, final (Hằng số)       |
| Có thể dùng private, protected, public                | Mặc định là public                     |
| Có thể kế thừa và implement nhiều interface           | Chỉ có thể kế thừa interface           |

## Interface và Abstract Class cái này chạy nhanh hơn?

- Abstract Class chạy nhanh hơn
- Abstract Class khi Class extend nó sẽ xác định được Method của Class nào để gọi
- Interface khi Class Implements nó sẽ phải đi xác định chính xác xem Method đó là của Class nào để gọi

## Interface và Abstract Class thể hiện tính Polymorphism tốt hơn ?

- Interface thể hiện tính Polymorphism tốt hơn
- Interface cho phép đa kế thừa
- Abstract Class chỉ cho phép đơn kế thừa

## Khi nào dùng Interface?

- Chỉ là khung xướng, tức là chỉ toàn là Method
- Class nào cũng có thể Implements và nó Chỉ quan tâm với Method

## Khi nào dùng Astract Class?

- Có 1 điểm chung để các Class tạo ra các mối quan hệ với nhau

## Default method and Static method in Interface

| Default method | Static method |
| -------------- | ------------- |

```java
public interface Vehicle {

    String getBrand();

    String speedUp();

    String slowDown();

    default String turnAlarmOn() {
        return "Turning the vehicle alarm on.";
    }

    default String turnAlarmOff() {
        return "Turning the vehicle alarm off.";
    }
}
```

```java
public class Car implements Vehicle {

    private String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public String speedUp() {
        return "The car is speeding up.";
    }

    @Override
    public String slowDown() {
        return "The car is slowing down.";
    }
}
```

```java
public static void main(String[] args) {
    Vehicle car = new Car("BMW");
    System.out.println(car.getBrand());
    System.out.println(car.speedUp());
    System.out.println(car.slowDown());
    System.out.println(car.turnAlarmOn());
    System.out.println(car.turnAlarmOff());
}
```

> > BMW
> > The car is speeding up.
> > The car is slowing down.
> > Turning the vehicle alarm on.
> > Turning the vehicle alarm off.
