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
