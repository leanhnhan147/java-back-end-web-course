
## 1. Encapsulation 
- Được thể hiện qua Access Modifier.
- **Tính đóng gói** sử dụng **phương thức để truy xuất** các thuộc tính được che dấu.
- Mục đích của sự che dấu là để
  - Tránh việc **truy xuất, chỉnh sửa một cách trực tiếp** Properties của Class.
  - Bảo vệ dữ liệu (tính toàn vẹn dữ liệu)
  - Tăng cường khả năng mở rộng
- Đối với những Properties muốn sử dụng **tính Encapsulation thì khai báo với Access Modifier là Private**
- Sử dụng **getter** và **setter** để giúp **truy cập những Properties là Private**

## 2. Inheritance
- Cho phép tạo ra lớp mới là lớp con kế thừa lớp cha có sẵn (Trong Java 1 lớp con chỉ có 1 lợp cha duy nhất - Đơn kế thừa)
- **Extends Keyword** dùng để chỉ định lớp con (sub class) kế thừa từ lớp cha (super class)
- Lớp con được phép sử dụng các Properties và methods **không phải là Private** của lớp cha
