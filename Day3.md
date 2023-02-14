# Java - Buổi 3
## I. MVC
### 1. MVC là gì?
- **MVC** (viết tắt của Model-View-Controller) là một mẫu kiến trúc phần mềm hay mô hình thiết kế để tạo lập giao diện người dùng trên máy tính.
- **MVC** chia một ứng dụng thành ba phần tương tác được với nhau, mỗi thành phần có một nhiệm vụ riêng biệt và độc lập với các thành phần khác.
  - **Model**: Quản lý, xử lý dữ liệu.
  - **View**: Hiển thị dữ liệu cho người dùng.
  - **Controller**: Điều khiển sự tương tác giữa Model và View.

  ![Mô hình MVC](https://niithanoi.edu.vn/pic/News/images/tin-tuc-cong-nghe-va-lap-trinh/mo-hinh-mvc.jpg)
- **Mô hình MVC** giúp tách biệt giữa cách thức mà dữ liệu được xử lý phía nội hàm và phần dữ liệu hiển thị phía người dùng. Ở đây **Controller** nhận được tất cả các yêu cầu cho ứng dụng và sau đó làm việc với **Model** để chuẩn bị dữ liệu cần thiết cho **View**. **View** sau đó sử dụng các dữ liệu được chuẩn bị bởi **Controller** để hiển thị cho người dùng.

### 2. Các thành phần trong MVC
- **Model:**
  - Là bộ phận có nhiệm vụ quản lý dữ liệu của ứng dụng.
  - Chức năng biểu diễn, vận chuyển thông tin để trình diễn (view) và xử lý (control).
  - Chứa tất cả các nghiệp vụ logic, đối tượng mô tả dữ liệu, ...

- **View:**
  - Tương tác với người sử dụng.
  - Show kết quả từ tầng Controller.
  - Thu nhận các hoạt động, request của người sử dụng và chuyển cho tầng Controller xử lý.
  - Hiểu một cách đơn giản, View là hệ thống các frame, cửa sổ của ứng dụng; các trang giao diện web: html, jsp; Các bảng, mẫu biểu, báo cáo.

- **Controller:**
  - Định nghĩa các hoạt động, xử lý của hệ thống
  - Đối chiếu các hành động của người dùng từ View. Đồng thời tương tác Model để gọi View và hiển thị thông tin tương ứng cho người dùng.

### 3. Ưu điểm và nhược điểm của MVC
- Ưu điểm:
  - Do được chia thành các thành phần độc lập nên Mô hình MVC giúp phát triển ứng dụng có code dễ đọc, dễ nâng cấp, bảo trì.
  - Thể hiện tính chuyên nghiệp trong việc tạo ứng dụng.

- Nhược điểm:
  - Đối với dự án nhỏ việc áp dụng mô hình MC gây cồng kềnh, tốn thời gian trong quá trình phát triển. Tốn thời gian trung chuyển dữ liệu của các thành phần.

## II. Đọc ghi file trong Java
### 1. Đọc ghi file trong Java với byte stream
- Các chương trình sử dụng `Byte Stream` để đọc ghi dữ liệu theo từng byte( 8 bit ). Tất cả các class `Byte Stream` có nguồn gốc từ `InputStream` và `OutputStream`.
- Có rất nhiều class `Byte Stream`, để hình dung `Byte Stream` hoạt động như thế nào, chúng ta sẽ tập trung vào `FileInputStream` và `FileOutputStream`, ví dụ:
 ```php
 public class CopyFileByte {
    public static void main(String [] args) throws IOException {
      FileInputStream inputStream = null;
      FileOutputStream outputStream = null;
 
      try {
         inputStream = new FileInputStream("inStream.txt");
         outputStream = new FileOutputStream("outStream.txt");
          
         int c;
         while ((c = inputStream.read()) != -1) {
            outputStream.write(c);           
         }
      } finally {
         if (inputStream != null) {
            inputStream.close();
         }
         if (outputStream != null) {
            outputStream.close();
         }
      }         
    }
}
```
- Việc đóng một Stream khi mà không có nhu cầu sử dụng nó nữa là một việc rất quan trong - tránh bị leak tài nguyên. Ví dụ trên sử dụng khối finally để đảm bảo cả `2 Streams (input, output)` đều được đóng ngay cả khi có lỗi xảy ra.

### 2. Đọc ghi file trong Java với character stream
- ``Character Stream`` trong Java được sử dụng để thực hiện input và output cho ``Unicode 16 bit``. Tất cả các class ``Character Stream`` có nguồn gốc từ Reader và Writer.
- Mặc dù có nhiều lớp liên quan tới ``Character Stream`` nhưng các lớp thường dùng nhất là ``FileReader`` và ``FileWriter``, ví dụ:

```php
public class CopyFileCharacter {
    public static void main(String [] args) throws IOException {
      FileReader in = null;
      FileWriter out = null;
 
      try {
         in = new FileReader("input.txt");
         out = new FileWriter("output.txt");
          
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);           
         }
      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }         
    }    
}
```
### 3. Đọc ghi file trong Java với buferred stream
- Các ví dụ trên không sử dụng ``Buffered Streams``, điều này có nghĩa là việc đọc và xuất dữ liệu được thực hiện trực tiếp dưới quyền điều khiển của hệ điều hành, gây lãng phí thời gian và tài nguyên. 
- ``Buffered Streams`` được sử dụng để tăng tốc độ hoạt động I/O, bằng cách đơn giản là tạo ra một khoảng nhớ đệm với kích thước cụ thể nào đó. 
- Một chương trình có thể chuyển đổi từ không sử dụng`` buffered stream`` (``Byte Stream`` và ``Character Stream``) sang sử dụng ``buffered stream ``bằng việc sử dụng ý tưởng ``"Wrapping"``
- ***Đọc file với Buffered Reader trong Java***
   >Trong java, Lớp `BufferedReader` được sử dụng để đọc văn bản từ một input stream dựa trên các ký tự (character stream). Nó có thể được sử dụng để đọc dữ liệu theo dòng (line by line) bằng phương thức `readLine()`. Nó giúp hiệu suất nhanh.

   ```php
   import java.io.BufferedReader;
   import java.io.FileReader;
   
   public class BufferedReaderExample {
      public static void main(String args[]) throws Exception {
         FileReader fr = new FileReader("D:\\testout.txt");
         BufferedReader br = new BufferedReader(fr);
   
         int i;
         while ((i = br.read()) != -1) {
               System.out.print((char) i);
         }
         br.close();
         fr.close();
      }
   ```
- ***Ghi file trong Java với lớp Buffered Writer***
   >Lớp `BufferedWriter` trong java được sử dụng để cung cấp bộ đệm cho các các thể hiện của lớp `Writer`. Nó giúp hiệu suất nhanh. Nó thừa kế lớp `Writer`. Các ký tự đệm được sử dụng để cung cấp việc ghi dữ liệu hiệu quả với các mảng đơn, các ký tự và chuỗi.

   ```php
   import java.io.BufferedWriter;
   import java.io.FileWriter;
   
   public class BufferedWriterExample {
      public static void main(String[] args) throws Exception {
         FileWriter writer = new FileWriter("D:\\testout.txt");
         BufferedWriter buffer = new BufferedWriter(writer);
         buffer.write("Welcome to java.");
         buffer.close();
         System.out.println("Success...");
      }
   }
   ```
### 4. Đọc ghi file trong Java sử dụng Scanner
> `Scanner` có thể được sử dụng để nhập dữ liệu từ bàn phím, phân tích chuỗi ký tự, nhập dữ liêu từ file.

```php
Scanner sc = new Scanner(new File("myNumbers.txt"));
while (sc.hasNextLong()) {
    long aLong = sc.nextLong();
}
```

### 5. Ví dụ tổng quát về đọc ghi file ký tự