## ORM - Object Relational Mapping
- Là một kỹ thuật lập trình cho phép ánh xạ dữ liệu giữa Objects trên ứng dụng và records trong CSDL với nhau

## Hibernate
- Là Open source ORM thực hiện trên Framework Java
- Cho phép thực hiện lưu trữ (store), truy vấn (retrieve), thao tác (manipulate) data bằng phương pháp Object Oriented
- Là 1 implements của JPA

## Why using Hibernate
- Giảm thiểu công việc lập trình viết câu lệnh SQL, SQL Query
- Tăng tính trừu tượng hóa dữ liệu (Không cần quản SQL bên dưới lưu như thế nào, chỉ cần biết các class trên java)
- Tăng hiệu suất lập trình (Do hibernate đã được thiết kế để tăng hiệu suất)
- Đảm bảo tình nhất quán và toàn vẹn dữ liệu (Do Hibernate đã quản lý các transaction)
- Tăng linh hoạt (Ban đầu làm việc với SQL Server, sau đó cần chuyển đổi sang MySQL thì không cần thay đổi source, chỉ cần đổi config sang MySQL)
 
## JPA - Java Persistence API
- Là 1 ORM thực hiện trên Java
- Định nghĩa sẵn các interface và annotation cho CRUD

## Why using JPA
- Enhances performance with **caching** and **lazy loading**
- Tương tự Hibernate (5 lợi ích)
- Giảm sự phụ thuộc vào CSDL

## Không dùng annotation @Entity có bị sao không
- Không bị sao cả

## Cascade Type
| Cascade         | Description               												     |
| --------------- | ------------------------------------------------------------------------------------------------------------------------ |
| ALL      	  | Tương ứng với tất cả các loại cascade. cascade={DETACH, MERGE, PERSIST, REFRESH, REMOVE}				     |
| DETACH   	  | Nếu đối tượng cha bị detached khỏi persistence context thì các đối tượng tham chiếu tới nó cũng bị detached 	     |
| MERGE - UPDATE  | Nếu đối tượng cha được merged vào persistence context, thì các đối tượng tham chiếu tới nó cũng được merged 	     |
| PERSIST - INSER | Nếu đối tượng cha được persisted vào persistence context, thì các đối tượng tham chiếu tới nó cũng được persisted 	     |
| REFRESH 	  | Nếu đối tượng cha được refreshed ở persistence context hiện tại, thì các đối tượng tham chiếu tới nó cũng được refreshed |
| REMOVE - DELETE | Nếu đối tượng cha bị removed khỏi persistence context, thì các đối tượng tham chiếu tới nó cũng được removed	     |

## Fetch Type
- The **EAGER** strategy is a requirement on the persistence provider runtime that data must be eagerly fetched
- The **LAZY** strategy is a hint to the persistence provider runtime that data should be fetched lazily when it is first accessed
- Default FetchType
  - OneToMany: LAZY
  - ManyToOne: EAGER
  - ManyToMany: LAZY
  - OneToOne: EAGER

## Many-To-Many Relationship in JPA
- Cách 1: Sử dụng thông qua @ManyToMany
  - Không thể bổ sung thêm trường mới
- Cách 2: Composite Key (@Embeddable, @EmbeddedId, @MapsId)
  - Đã check các trường dữ liệu
- Cách 3: Tạo Entity mới
  - Phải check các trường dữ liệu bằng tay

## Không khai báo @Repository
- Tất cả Class, Interface được kế thừa từ Repository Interface đều sẽ được tạo bean trong container
