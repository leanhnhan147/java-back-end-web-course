## RESTful Web Services

- REST stands for REpresentational State Transfer.
- REST is an architectural style not a protocol.

##

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
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserRequest userToUserRequest(User user);
    UserResponse userToUserResponse(User user);
    User userRequestToUser(UserRequest userRequest);

    List<UserResponse> usersToUserRessponses(List<User> users);

}
```

## Configuring the Default Format dd/MM/yyyy HH:mm:ss

- spring.jackson.date-format=dd/MM/yyyy HH:mm:ss
- spring.jackson.time-zone=Asia/Ho_Chi_Minh

Chọn vị trí
Quản lý dịch vụ
Quản lý xe ôm
Quản lý taxi

Quản lý giá xe

- 4 chỗ, 7 chỗ theo km
- xe ôm theo km

Người dùng gửi định vị trí
Tài xế gửi định vị trí
=> Real time

Trả chuyển

Định nghĩa rule
Quản lý tài xế, rule của tài xế
Xem doanh thu dự kiến
Tài xế tham gia vào hệ thống phải đóng tiền ký quỹ

Chat
track tọa độ tài xế và driver và custom
khởi tạo phiên chat

Real time tracking
khi tài xế di chuyển bắn tọa độ lên
