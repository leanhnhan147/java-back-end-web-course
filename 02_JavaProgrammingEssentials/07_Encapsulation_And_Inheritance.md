## 1. Encapsulation 
- Được thể hiện qua Access Modifier.
- **Tính đóng gói** sử dụng **phương thức để truy xuất** các thuộc tính được che dấu.
- Mục đích của sự che dấu là để
  - Tránh việc **truy xuất, chỉnh sửa một cách trực tiếp** Properties of Class.
  - Bảo vệ dữ liệu (tính toàn vẹn dữ liệu)
  - Tăng cường khả năng mở rộng
- Đối với những Properties muốn sử dụng **tính Encapsulation thì khai báo với Access Modifier là Private**
- Sử dụng **getter** và **setter** để giúp **truy cập những Properties là Private**

## 2. Inheritance
- Cho phép tạo ra lớp mới là lớp con kế thừa lớp cha có sẵn (Trong Java 1 lớp con chỉ có 1 lợp cha duy nhất - Đơn kế thừa)
- Lớp con được phép sử dụng các Properties và methods **không phải là Private** của lớp cha
- **Extends Keyword** dùng để chỉ định lớp con (sub class) kế thừa từ lớp cha (super class)
- Nếu super class có nhiều constructor thì sub class được quyền chỉ định 1 constructor của super class
- Nếu sub class không chỉ chỉ thì constructor mặc định của super class sẽ tự động thực hiện
- Constructor của super class được thực hiện trước rồi mới đến constructor của sub class
- **Super Keyword** dùng để gọi method khởi tạo của super class

## Override methods
- Là việc khai báo các method trùng tên, cùng danh sách parameter và kiểm trả về giữa super class and sub class
- Mục đích để sửa lại nội dung method của super class tại sub class

## Nếu ở sub class không có Anitation @Override thì được không?
- Khi khai báo các method trùng tên, cùng danh sách parameter và kiểm trả về thì Java đã mặc định đó là Override nên có hay không có Anitation @Override vậy được

## Overloading and Overriding
### Overloading
- Cho phép khai báo các phương thức trùng tên nhưng khác tham số
  - Số lượng tham số khác nhau
  - Hoặc cùng số lượng tham số nhưng khác kiểu dữ liệu
  - Hoặc cùng số lượng, cùng kiểu dữ liệu nhưng khác nhau về thứ tự
### Overriding
- Cho phép sub class thay đổi phần thân method của super class tại sub class 
  - Phần khai báo giống nhau giữa super class and sub class
  - Phần thân được định nghĩa lại tại sub class 
