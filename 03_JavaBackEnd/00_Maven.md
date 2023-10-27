## Maven

- Maven là một công cụ quản lý dự án phần mềm tự động, sử dụng định nghĩa dự án XML để mô tả các cấu trúc và phụ thuộc của dự án.
- Maven được phát triển bởi Apache Software Foundation và được sử dụng rộng rãi bởi các nhà phát triển Java.

## Lợi ích của Maven

- Tự động hóa: Maven giúp tự động hóa các tác vụ xây dựng dự án, chẳng hạn như biên dịch, kiểm thử và đóng gói. Điều này giúp tiết kiệm thời gian và công sức cho các nhà phát triển.
- Tái sử dụng: Maven sử dụng một kho lưu trữ trung tâm để lưu trữ các phụ thuộc dự án. Điều này giúp các nhà phát triển dễ dàng tìm và sử dụng các phụ thuộc đã được kiểm tra và chứng nhận.
- Tính nhất quán: Maven sử dụng một định nghĩa dự án XML tiêu chuẩn. Điều này giúp các nhà phát triển dễ dàng cộng tác trên các dự án Maven.
- Maven có thể được sử dụng để xây dựng các dự án Java, C#, Ruby, Scala và các ngôn ngữ khác.

## Tính năng của Maven

- Cấu trúc dự án chuẩn: Maven sử dụng một cấu trúc dự án chuẩn cho tất cả các dự án. Điều này giúp các nhà phát triển dễ dàng tìm hiểu và sử dụng Maven.
- Kho lưu trữ trung tâm: Maven sử dụng một kho lưu trữ trung tâm để lưu trữ các phụ thuộc dự án. Điều này giúp các nhà phát triển dễ dàng tìm và sử dụng các phụ thuộc đã được kiểm tra và chứng nhận.
- Quy trình xây dựng tích hợp: Maven hỗ trợ quy trình xây dựng tích hợp (CI). Điều này giúp tự động hóa các tác vụ xây dựng và kiểm thử dự án.
- Quản lý phụ thuộc: Maven giúp quản lý các phụ thuộc dự án. Điều này giúp đảm bảo rằng các phụ thuộc dự án luôn được cập nhật.
- Tích hợp với các công cụ khác: Maven có thể được tích hợp với các công cụ khác, chẳng hạn như IDE, hệ thống kiểm soát phiên bản và hệ thống triển khai.

## Vòng đời của Maven

- Vòng đời của Maven là một tập hợp các giai đoạn được thực hiện bởi Maven để xây dựng, kiểm thử và đóng gói một dự án. Vòng đời của Maven được định nghĩa trong tệp pom.xml của dự án.
- Maven có hai vòng đời chính:
  - Vòng đời mặc định: Vòng đời mặc định được sử dụng để xây dựng, kiểm thử và đóng gói một dự án. Đây là vòng đời được sử dụng phổ biến nhất.
  - Vòng đời sạch: Vòng đời sạch được sử dụng để xóa tất cả các tệp được tạo bởi Maven trong quá trình xây dựng.
- Ngoài hai vòng đời chính, Maven còn có một số vòng đời bổ sung có thể được sử dụng cho các mục đích cụ thể, chẳng hạn như tạo tài liệu, triển khai và chạy ứng dụng.

### Vòng đời mặc định

- Một số giai đoạn chính trong vòng đời mặc định của Maven:
  - Validate: Giai đoạn này xác minh rằng tất cả các thông tin của dự án là hợp lệ và chính xác.
  - Compile: Giai đoạn này biên dịch mã nguồn Java của dự án.
  - Test: Giai đoạn này chạy các thử nghiệm đơn vị và tích hợp cho dự án.
  - Package: Giai đoạn này đóng gói dự án thành một tệp thực thi hoặc một tệp jar.
  - Install: Giai đoạn này cài đặt dự án vào kho lưu trữ cục bộ.
  - Deploy: Giai đoạn này triển khai dự án lên một môi trường sản xuất.
- Các giai đoạn trong vòng đời của Maven có thể được thực hiện theo thứ tự hoặc có thể được kết hợp lại để tạo ra các đường dẫn xây dựng tùy chỉnh.

## Một số lệnh Maven phổ biến

- Dưới đây là một số lệnh Maven phổ biến được sử dụng để thực hiện các giai đoạn trong vòng đời của Maven:
  - mvn clean: Xóa tất cả các tệp được tạo bởi Maven trong quá trình xây dựng.
  - mvn compile: Biên dịch mã nguồn Java của dự án.
  - mvn test: Chạy các thử nghiệm đơn vị và tích hợp cho dự án.
  - mvn package: Đóng gói dự án thành một tệp thực thi hoặc một tệp jar.
  - mvn install: Cài đặt dự án vào kho lưu trữ cục bộ.
  - mvn deploy: Triển khai dự án lên một môi trường sản xuất.

## Một mô tả chi tiết về từng giai đoạn trong vòng đời Maven

- Dưới đây là một mô tả chi tiết về từng giai đoạn trong vòng đời Maven:
  - Giai đoạn Clean sẽ xóa tất cả các tệp xây dựng và kiểm thử được tạo trước đó. Điều này bao gồm các tệp .class, .jar và .war. Giai đoạn này thường được sử dụng để bắt đầu lại quá trình xây dựng từ đầu.
  - Giai đoạn Compile sẽ biên dịch mã nguồn của dự án thành bytecode. Maven sẽ sử dụng trình biên dịch Java để thực hiện giai đoạn này.
  - Giai đoạn Test sẽ chạy các bài kiểm tra đơn vị và tích hợp. Maven sẽ sử dụng các plugin để chạy các bài kiểm tra này.
  - Giai đoạn Package sẽ tạo một gói chứa tất cả các tệp thực thi của dự án. Maven sẽ sử dụng các plugin để tạo các gói cho các định dạng khác nhau, chẳng hạn như .jar và .war.
  - Giai đoạn Install sẽ cài đặt gói vào kho cục bộ của người dùng. Điều này cho phép người dùng sử dụng gói trong các dự án khác.
  - Giai đoạn Deploy sẽ phân phối gói đến một kho lưu trữ trung tâm. Điều này cho phép người khác tải xuống và sử dụng gói.
