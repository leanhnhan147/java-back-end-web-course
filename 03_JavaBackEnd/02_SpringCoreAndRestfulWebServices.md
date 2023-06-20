SOLID (https://www.bmc.com/blogs/solid-design-principles/#:~:text=SOLID%20is%20an%20acronym%20that,some%20important%20benefits%20for%20developers)

## IoC - Inversion of Control
- Là 1 nguyên lý thiết kế, phát triển phần mềm mà thao tác này sẽ đảo chiều sự phụ thuộc (Dependency) của các class, object với nhau.
- Quản lý các phụ thuộc (Dependency) thông qua container.
- Giúp chúng ta không cần khởi tạo các Object bị phụ thuộc.

## DI - Dependency Injection
- Là 1 intance của IoC mà sự phụ thuộc (Dependency) này được thực hiện Injec đối tượng từ bên ngoài.

## Bean factory
- Là 1 container sử dụng cơ chế IoC
- Là các contrainer quản lý các Bean mà các Bean là các Object được khởi tạo.

## Application context
- Là 1 container sử dụng cơ chế IoC
- Là sự kế thừa từ Bean factory và bổ sung thêm một số tính năng
 
## Bean Scopes 
- Đánh dấu Bean có phạm vi truy cập như thế nào
- Có 5 Sope
  - singleton 
    - Là Default Value
    - Đánh dấu Bean này chỉ khởi tạo duy nhất một lần trong suốt quá trình run project.
    - Scopes a single bean definition to a single object instance per Spring IoC container.
  - prototype:
    - Mỗi lần gọi tới Bean đó thì sẽ khởi tạo một Oject mới.
    - Scopes a single bean definition to any number of object instances.
  - request
    - Đánh dấu Bean này sử dụng cho HTTP Request.
    - Mỗi lần gửi Request sẽ khởi tạo một Object mới.
    - Scopes a single bean definition to the lifecycle of a single HTTP request 
    - That is each and every HTTP request will have its own instance of a bean created off the back of a single bean definition. 
    - Only valid in the context of a web-aware Spring ApplicationContext.
  - session
    - Scopes a single bean definition to the lifecycle of a HTTP Session. 
    - Only valid in the context of a web-aware Spring ApplicationContext. 
  - global session
    - Scopes a single bean definition to the lifecycle of a global HTTP Session. 
    - Typically only valid when used in a portlet context. 
    - Only valid in the context of a web-aware Spring ApplicationContext.

Source: https://docs.spring.io/spring-framework/docs/3.0.0.M3/reference/html/ch04s04.html

## @Conponent
- Sẽ đánh dấu class này là bean trong container 
- Cho phép các Class khác có thể sử dụng DI để Injec Class này vào.

## @Service
- Tương tự @Conponent
- Đánh dấu class này là 1 service để xử lý nghiêp vụ, logic

## @Respository
- Tương tự @Component 
- Đ́nh dấu Class này là Respository để xử lý, thao tác (Inser, Update, Delete,...) với Database  

## @Controller
- Đánh dấu Class này là Bean
- Đánh dấu Class này là nơi xử lý logic điều hướng HTTP Request
- **Không đánh dấu sẵn các @ResponseBody ở API**

## @RestController
- Đánh dấu Class này là Bean
- Đánh dấu Class này là nơi xử lý logic điều hướng HTTP Request
- **Có đánh dấu sẵn các @ResponseBody ở API**

## @ResponseBody
- Đánh dấu method có kiểu trả về là gì

## @Requestmapping
- Đánh dấu path 
- Để gop nhóm các API trong path đó
- Không dùng @Requestmapping vẫn được

## There are three common ways of injecting dependencies
- Property injection thông qua Autowired
- Contructor injection
- Method injection

## Microservices
- Tách thành nhiều services nhỏ

## Web Services 
- Là 1 dạng API tương tác thông qua Network
- Tất cả Web Services đều là API, nhưng tất cả API chưa chắc là Web Services

## Restful API
- Là giao thức truyền dữ liệu
- Sử dụng giao thức GET, POST, PUT, DELETE,...
- Sử dụng chuẩn JSON, XML
JSON - https://json.org/example.html

## WebSocket
- Tương tác giữa 2 máy thông qua 1 kênh nào đó

## @PathVariable
- Sử dụng theo 1 template bắt buộc 
- Phải truyền đúng thứ tự param

## @RequestParam
- Sử dụng để lấy param không yêu cầu thứ tự param

