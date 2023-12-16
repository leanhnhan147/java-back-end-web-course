https://docs.spring.io/spring-framework/docs/3.2.x/spring-framework-reference/html/overview.html

## Spring Framework

- Là một Java Platform dùng để xây dựng những ứng dụng Java
- OpenSource (https://github.com/spring-projects/spring-framework)
- Sử dụng các Modules được cung cấp sẵn nhắm phục vụ cho mục đích tăng tốc độ quá trình phát triển, hoàn thành ứng dụng
- Hỗ trợ tương tác toàn bộ hệ thống thông qua POJO

## AOP - Aspect Oriented Programming

- Là một kỹ thuật lập trình (kiểu như lập trình hướng đối tượng) nhằm phân tách chương trình thành cách moudule riêng rẽ, phân biệt, không phụ thuộc nhau.
- Khi hoạt động, chương trình sẽ kết hợp các module lại để thực hiện các chức năng nhưng khi sửa đổi 1 chức năng thì chỉ cần sửa 1 module.
- AOP không phải dùng để thay thế OOP mà để bổ sung cho OOP.

## JPA - Java Persistence API

- Là trung gian đứng giữa cho phép tương tác với CSDL và sử dụng ORM để thực hiện mapping các class trên java với các table trên CSDL

## Spring Boot

- Là module của Spring Framework
- Framework để xây dựng ứng dụng Java nhanh hơn, đơn giản tới mức khởi động là chạy luôn
- Cung cấp helper classes and annotations
- Dễ dàng nhúng và tương tác với các Module khác của Spring (Spring Data, Spring MVC, Spring Security)
- Được nhúng sẵn Servers như tomcat, jetty

## What using Spring Boot

- Minimum configuration (Giảm thiểu config thủ công)
- Avoid comlex XML configuration in Spring
- Embedded Web Servers (tomcat, jetty)

## OpenSource and Software Other

- Source
  - OpenSource: Ai cũng có thể dùng.
  - Trả phí: không công khai, chỉ người có quyền truy cập mới chỉnh sửa
- Cost
  - OpenSource: Miễn phí
  - Trả phí: Có giấy phép sử dụng

## Maven

- A Project Managenment Tool
- Build management and dependencies

## Maven Project Structure

- File porm.xml: Khai báo library, dependencies, version
  - verison
    - SNAPSHOT: Project đang trong quá trình phát triển
    - RELEASE: Project đã hoàn thành và đưa ra thị trường
- Folder src: nơi gõ code
- Folder target: lưu các version đã build ra (thường là file .jar)

fly way

chi phí
share database, chi phí
scale, cahing

client sidering

đồng bộ dữ liệu, nhất quán

request -> không tuân thu acy -> design pattern

pf
