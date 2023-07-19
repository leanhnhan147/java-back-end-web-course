## Không sử dụng IDE để compile file Java
- javac thuộc về JDK, dùng để biên dịch lại code Java 
  - javac <name file>.java => Sẽ tạo file <name file>.class
- java thuộc về JRE (JDK chưa JRE nên cũng chứa java) dùng để chạy bytecode Java
  - java <name file>.class
- Từ Java 17 trở đi chỉ cần java <name file>.java 

## Các thành phần cơ bản của Java (Components of Java SE Platform)
- **Java Virtual Machine (JVM)**: Cung cấp môi trường cho Java Bytecode có thể thực thi trên đó.
- **Java Runtime Environment (JRE)** Provides a **Java Virtual Machine (JVM)**, the standard **class libraries** and other components to run applications written in the Java programming language. 
- **Java Development Kit (JDK)** is a superset of the JRE, and **contains everything in the JRE**, plus **tools** such as **compilers and debuggers** for development.

## Khi muốn chạy một chương trình Java chỉ cần tải Component nào?
- **Java Runtime Environment (JRE)**

## Nếu khai báo biến và không gán giá trị cho biến thì khi chạy chương trình có báo lỗi hay không?
- Nếu biến được khai báo trong **Class** thì biến sẽ **có default values**.
- Nếu biến được khai báo trong **method, function** thì biến **không có default values**.

## Default values of Data type
| Data type | Default values | Size (bits) |
| --------- | -------------- | ----------- |
| byte      | 0              | 8           |
| short     | 0              | 16          |
| int       | 0              | 32          |
| long      | 0L             | 64          |
| float     | 0.0f           | 32          |
| double    | 0.00d          | 64          |
| char      | '\u0000'       | 16          |
| String    | null           | -           |
| Oject     | null           | -           |
| boolean   | false          | 1           |

## Primitive data types
- Interger
  - byte
  - short
  - int
  - long
- Float
  - float
  - double
- Character
 - char
- Boolean
 - boolean

## Reference data types
- Array
- Class
- Interface

