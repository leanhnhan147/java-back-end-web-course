## RESTful Web Services

- REST stands for REpresentational State Transfer.
- REST is an architectural style not a protocol.

## Questions to Answer

- What is dispatcher servlet?
  - Dispatcher handled HttpRequest
- Who is configuring dispatcher servlet?
  - Auto Configuration dispatcher servlet
  - Auto Configuration is called HTTP message converted to JSON
- What does dispatcher servlet do?
- How does the HelloWorldBean object get converted to JSON?
- Who is configuring the error mapping?

## HATEOAS

- HATEOAS (Hypermedia As The Engine Of Application State) là một trong những chuẩn được khuyến nghị cho RESTful API. Thuật ngữ “Hypermedia” có nghĩa là bất kỳ nội dung nào có chứa các liên kết (link) đến các media khác như image, movie và text.
- Kiểu kiến trúc này cho phép bạn sử dụng các liên kết hypermedia trong nội dung response để client có thể tự động điều hướng đến tài nguyên phù hợp bằng cách duyệt qua các liên kết hypermedia. Nó tương tự như một người dùng web điều hướng qua các trang web bằng cách nhấp vào các link thích hợp để chuyển đến nội dung mong muốn.
- HATEOAS mong muốn phía client không cần biết chút nào về cấu trúc phía server, client chỉ cần request đến một URL duy nhất, rồi từ đó mọi đường đi nước bước tiếp theo sẽ do chỉ dẫn của phía server trả về.

## Internationalization

## Spring Boot Actuator

- Spring Boot Actuator cung cấp các endpoints(điểm cuối) bảo mật để giám sát và quản lý ứng dụng Spring Boot

## Versioning

- Media type versioning (Content negotiation or accept header)
  - Github
- Custom header versioning
  - Microsoft
- URI versioning
  - Twitter
- Request Parameter versioning
  - Amazon
- Factors
  - URI Pollution
  - Misue of HTTP headers
  - Caching
  - Can we execute the request on the browser
  - API documentation
- No perfect Solution

## Content

- 11 Implementing Exception Handling 404 Resource Not Found
- 16 Implementing HATEOAS for RESTful Services
- 18 Internationalization for RESTful Services
- 19 Content Negotiation Implementing Support for XML
- 20 Configuring Auto Generation of Swagger Documentation
- **23 Monitoring APIs with Spring Boot Actuator**
- 25 Implementing Dynamic Filtering for RESTful Service
- **27 Versioning RESTful Services Header and Content Negotiation Approach**
- **28 Implementing Basic Authentication with Spring Security**

## Lombok

## DTO request & response

## Pagination

## mapstruct

```
<dependency>
  <groupId>org.mapstruct</groupId>
  <artifactId>mapstruct</artifactId>
  <version>1.5.5.Final</version>
</dependency>
```

```
<plugin>
  <groupId>org.apache.maven.plugins</groupId>
  <artifactId>maven-compiler-plugin</artifactId>
  <version>3.11.0</version>
  <configuration>
    <annotationProcessorPaths>
      <path>
        <groupId>org.mapstruct</groupId>
        <artifactId>mapstruct-processor</artifactId>
        <version>1.5.5.Final</version>
      </path>
      <path>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <version>1.18.28</version>
      </path>
      <path>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok-mapstruct-binding</artifactId>
        <version>0.2.0</version>
      </path>
    </annotationProcessorPaths>
  </configuration>
</plugin>
```

```java
package com.rest.webservices.mapper;

import com.rest.webservices.entity.User;
import com.rest.webservices.payload.request.UserRequest;
import com.rest.webservices.payload.response.UserResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserResponse userToUserResponse(User user);
    User userRequestToUser(UserRequest userRequest);

    List<UserResponse> usersToUserRessponses(List<User> users);

}
```

## Configuring the Default Format dd/MM/yyyy HH:mm:ss

- spring.jackson.date-format=dd/MM/yyyy HH:mm:ss
- spring.jackson.time-zone=Asia/Ho_Chi_Minh

## Custom Responese (Java Generic)

```java
public class ApiMessageDto<T> {
    private Boolean result = true;
    private String code = null;
    private T data = null;
    private String message = null;
}
```

## Annotation

- **@Target**: Dùng để chú thích phạm vi sử dụng của một Annotation. Các chú thích này đã được định nghĩa trong enum java.lang.annotation.ElementType:
  - ElementType.TYPE: Chú thích trên Class, interface, enum, annotation
  - ElementType.FIELD: Chú thích trường (field), bao gồm cả các hằng số enum.
  - ElementType.METHOD: Chú thích trên method.
  - ElementType.PARAMETER: Chú thích trên parameter.
  - ElementType.CONSTRUCTOR: Chú thích trên constructor.
  - ElementType.LOCAL_VARIABLE: Chú thích trên biến địa phương.
  - ElementType.ANNOTATION_TYPE: Chú thích trên Annotation khác.
  - ElementType.PACKAGE: Chú thích trên package.
- **@Retention**: Dùng để chú thích mức độ tồn tại của một Annotation nào đó. Cụ thể có 3 mức nhận thức tồn tại của vật được chú thích, và được định nghĩa trong enum java.lang.annotation.RetentionPolicy:
  - RetentionPolicy.SOURCE: Tồn tại trên mã nguồn, và không được trình biên dịch nhận ra.
  - RetentionPolicy.CLASS: Mức tồn tại được trình biên dịch nhận ra, nhưng không được nhận biết bởi máy ảo tại thời điểm chạy (Runtime).
  - RetentionPolicy.RUNTIME: Mức tồn tại lớn nhất, được trình biên dịch nhận biết, và máy ảo (JVM) cũng nhận ra khi chạy chương trình.
- **@Inherited**: Chú thích này chỉ ra rằng chú thích mới nên được bao gồm trong tài liệu Java được tạo ra bởi các công cụ tạo tài liệu Java.
- **@Documented**: Chú thích chỉ ra rằng loại chú thích có thể được kế thừa từ lớp cha và có giá trị mặc định là false. Khi người dùng truy vấn kiểu Annotation của lớp con và lớp con không có chú thích cho kiểu này thì lớp cha của lớp được truy vấn cho loại chú thích sẽ được gọi. Chú thích này chỉ áp dụng cho các khai báo class.

## Custom vadation @Sex

- Kiểm tra value có phải là Nam, Nữ, Khác không

## HMAC - keyed-hash message authentication code

- HMAC được tính toán bằng cách sử dụng một hàm hash cùng với secret key (là key chỉ có sender và receiver biết)

## 22/09/2023

- How to create a CRUD
  - model
  - repository
  - request (form)
  - response (dto)
  - mapstruct
  - exception (error code)
  - controller
- Check project
- What is Criteria?
- Postman: Create and test all controller except forger password
- How many types of response?

## 24/09/2023

- Trước khi check parentId phải join

- @PreAuthorize

  - L - List
  - V - Get
  - C - Create
  - U - Update
  - D - Delete

- Dùng liquibase để handle việc tạo và migrate data
  - 1. Cấu hình liquibase
  - 2. Khởi tạo db(changelog) đầu tiên
  - 3. Tạo diff changelog mỗi khi thêm 1 entity mới

## Liquibase

- changelog
- changeset
- changetype

## 26/09/2023

- Custom Id: Use Custom Generator (Use @GenericGenerator)
- Saving CreatedBy, CreatedDate, LastModifiedBy, LastModifiedDate automatically: https://www.baeldung.com/database-auditing-jpa (Reading part 4. Spring Data JPA)
- Exclude autocomplete không cần đăng nhập vẫn vào được

## Main flow security

- Khi 1 API được gọi => Vào AuthorizationServer

## 28/09/2023

- How to us SourceTree
  - Commit
  - Push
  - Pull
  - Merge
  - Fix conflict
  - Stash

## 01/10/2023

- One tenant connect to one database

- Create database: db_elms_tenant
- Create user
  - elms_user@% - Fullpermissions
  - elms_user@localhost - Fullpermissions
- Run project
- Test postman: account: itdemodev/123456
  => success -> has token
- Change url in service > feign > FeignDbConfigAuthService.java -> ${auth.internal.base.url}
- Run project
- Test postman: url http://localhost:7878/v1/category/get/1
  - Headers
    - Key: X-tenant
    - Values:

db: db_elms_tenant
user: elms_user
pass: elms_user@123

account: itdemodev/123456

https://elms-auth.developteam.net/v1/permission/create

## 05/10/2023

spring.mail.username=anhnhan9a3@gmail.com
spring.mail.password=hgrqnxidkfiiyogm

## 09/10/2023

## 11/10/2023

- Developer: Add API developer/project/{id}
  - response: list developer
- Setting: Remove authorize API find by key, find by group and Get only isSystem = false
- Leader: Fix CreateLeaderForm insert status field
- Company: Add API company/list-company (public) with pageable
  - reponse: {
    "id":
    "name":
    "logo":
    }

## 12/10/2023

- Delete Company
  - CompanyRequest
  - CompanySeek
  - CompanySubscription
- Delete Developer

  - CompanySeek
  - MemberProject
  - ProjectTask

- Delete Leader

  - Course (nếu có => error)
  - Project (nếu có => error)

- Delete RegistrationMoneyHistory
  - Không có
