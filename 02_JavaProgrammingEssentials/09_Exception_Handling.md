## Checked Exceptions
- Là các loại Exception mà **Compiler** yêu cầu kiểm tra và xử lý ngoại lệ
- Examples of Checked Exception
  - NoSuchFileException
  - FileNotFoundException
  - SQLException

## Unchecked Exceptions


## Throw Keyword
- Khai báo trong body code
- Sử dụng để bắt code bên dưới và quăng Exception cho tầng bên trên có thể bắt và xử lý Exception

## Throws Keyword
- Khai báo ở tên Method
- Sử dụng để bắt code bên dưới và quăng Exception cho tầng bên trên có thể bắt và xử lý Exception
- Khi sử dụng Throws thì ở tầng trên bắt buộc phải sử dụng **Catch**, Catch sẽ bắt Exception giống với Throws

## Khi 1 method có đủ try, catch, finally và đoạn code trong try có exception + return thì khi gọi method đó sẽ vẫn thực hiện code ở finally
- Có lỗi hay không lỗi thì Finally luôn luôn được thực hiện 

## Khi đoạn chạy code xong sẽ thoát luôn mà không vào thực hiện code trong finally 
- Sử dụng System.exit(0) để thoát chương trình mà không vào thực hiện code trong finally