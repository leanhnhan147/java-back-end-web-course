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
- Là **tập hợp các Abstract methods** (Abstract methods là  method không có body)
- Một **Class** phải **Implements hết tất cả method trừu tượng**
- **Default Access Modifier** là **Public**

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

## This Keyword
- This trỏ tới đối tượng (Oject) hiện tại.

## Final Keyword

## Static Keyword
- Dùng  trong Class lồng nhau (Super Class truy xuất Properties của Sub Class, Sub Class không thể truy xuất Properties của Super Class)
