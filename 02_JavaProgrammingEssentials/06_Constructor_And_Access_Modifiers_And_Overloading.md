### Nếu không khai báo Constructor thì có khởi tạo Oject được không?
- Khi không khai báo Constructor thì Java tự động cung cấp Default Constructor mặc định (không tham số)

### Nếu có 1 Constructor khác với Default Constructor mà không khai báo Default Constructor trong Class thì có khởi tạo Object với Default Constructor được không?
- Không khởi tạo Object với Default Constructo được

### Access Modifiers
- Mục đích thể hiện phạm vi truy cấp đối với Properties, Method
- There are **four types** of Java **access modifiers**:
  - **Private**
    - English: The access level of a private modifier is only within the class. It cannot be accessed from outside the class. 
    - Vietnamese: Chỉ được phép truy cập tại lớp khai báo.
  - **Protected** 
    - English: The access level of a protected modifier is within the package and outside the package through child class. If you do not make the child class, it cannot be accessed from outside the package.
    - Vietnamese: Được phép truy cập tại lớp khai báo và lớp con (lớp được kế thừa).
  - **Default** 
    - English: The access level of a default modifier is only within the package. It cannot be accessed from outside the package. If you do not specify any access level, it will be the default.
    - Vietnamese: Được truy cập ở những lớp cùng package.
  - **Public**
    - English: The access level of a public modifier is everywhere. It can be accessed from within the class, outside the class, within the package and outside the package. 
    - Vietnamese: Được truy cập ở tất cả các lớp.
- Reference source: https://www.javatpoint.com/access-modifiers

### Package là gì? 
- Là tập hợp các Class có cũng điểm chung và Class này có Access Modifiers là Default

### Khi declare Properties, Method trong Java thì Access Modifiers Default là?
- Access Modifier là Default

### Khi Overloading Method cùng tên, cùng địa chỉ, khác kiểu trả về có được không?
- Overloading Method chỉ xãy khi Method **trùng tên** và **khác địa chỉ** (địa chỉ là số lượng Parameter) (Xảy ra ở Compile time)
  - Số lượng Parameter khác nhau.
  - Hoặc cùng số lượng Parameter nhưng khác Data Type.
  - Hoặc cùng số lượng Parameter, cùng Data Type nhưng khác vể thứ tự

## This Keyword
- This trỏ tới đối tượng (Oject) hiện tại.

## Final Keyword
- Để tạo các thuộc tính mà không thể thay đổi giá trị của nó một lần nữa, gọi là hằng số
- Để tạo các method không thể Override
- Để tạo các class không thể Inheritance

## Static Keyword
- Dùng trong Class lồng nhau (Super Class truy xuất Properties của Sub Class, Sub Class không thể truy xuất Properties của Super Class)
- Properties, Method in Class: Sẽ thuộc về Class chứ không thuộc về Object