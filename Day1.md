# JAVA - Buổi 1
***
## 1. Syntax cơ bản 
***
### **\*** **Nhập:**
* Cần import `java.util.Scanner` có chứa class `Scanner`
```php
    import java.util.Scanner
```
* Tạo một đối tượng của lớp Scanner
```php
    Scanner sc = new Scanner(System.in);
    string name = sc.nextLine();
```
### **\*** **Xuất:**
```php
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
```
* Xuất dữ liệu ra màn hình có 3 cách:

| Syntax                  | Đặc điểm                                |
| ----------------------- | --------------------------------------- |
| System.out.printfln("") | Con trỏ chuột nhảy xuống dòng tiếp theo |
| System.out.print("")    | Con trỏ chuột không xuống dòng          |
| System.out.printf("")   | Giống trong C                           |

### **\*** **Biến:**
Gồm 3 loại: Biến local, instance và static
* **Biến local:**
  * Biến local được khai báo trong các phương thức, hàm contructor hoặc trong các block.
  * Không được sử dụng "access modifier" khi khai báo biến local.
  * Cần khởi tạo giá trị mặc định cho biến local trước khi có thể sử dụng.

* **Biến instance:**
  * Biến instance được khai báo trong một lớp(class), bên ngoài các phương thức, constructor và các block.
  * Biến instance được tạo khi một đối tượng được tạo bằng việc sử dụng từ khóa “new” và sẽ bị phá hủy khi đối tượng bị phá hủy.
  * Biến instance có giá trị mặc định phụ thuộc vào kiểu dữ liệu của nó. Ví dụ nếu là kiểu int, short, byte thì giá trị mặc định là 0, kiểu double thì là 0.0d, ... Vì vậy, bạn sẽ không cần khởi tạo giá trị cho biến instance trước khi sử dụng.

* **Biến static:**
  * Biến static được khai báo trong một class với từ khóa "static", phía bên ngoài các phương thức, constructor và block.
  * Biến static được tạo khi chương trình bắt đầu chạy và chỉ bị phá hủy khi chương trình dừng.

```php
    public class Bien {
    public static float PI = 3.14f;   // Đây là biến static
    int n;                            // Đây là biến instance
     
    public Bien () {
        char c = 'c';                 // Đây là biến local
    }
}
```
### **\*** **Toán tử:**
### **\*** **If-else:**
### **\*** **Vòng lặp for:**
* **Vòng lặp for đơn giản:**
    _Cú pháp:_
    ```php
    for (khoi_tao_bien ; check_dieu_kien ; tang/giam_bien) {  
    // Khối lệnh được thực thi
    } 
    ```
* **Vòng lặp for cải tiến:**
    _Cú pháp:_
    ```php
    for (Type var : array) { 
   		 // Khối lệnh được thực thi
    }
    ```
    _Ví dụ:_
    ```php
    public class ForEachExample {
    public static void main(String[] args) {
        int arr[] = { 12, 23, 44, 56, 78 };
        for (int i : arr) {
            System.out.println(i);
        }
    }
    }
    ```
* **Vòng lặp for gán nhãn:** 
***Chúng ta có để đặt tên cho mỗi vòng lặp for bằng cách gán nhãn trước vòng lặp for. Điều này rất hữu dụng khi chúng ta muốn thoát/tiếp tục(break/continues) chạy vòng lặp for***
    _Cú pháp:_
    ```php
    ten_nhan:
    for (khoi_tao_bien ; check_dieu_kien ; tang/giam_bien) {  
    // Khối lệnh được thực thi
    } 
    ```
    _Ví dụ:_
    ```php
    public class LabeledForExample {
    public static void main(String[] args) {
        aa: for (int i = 1; i <= 3; i++) {
            bb: for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    break aa;
                }
                System.out.println(i + " " + j);
            }
        }
    }
    }
    ```

### **\*** **Arrays:**
* Để khai báo một mảng, khai báo loại biến với dấu ngoặc vuông []:
>dataType[] arr;
dataType []arr;
dataType arr[]; 

```php
// khởi tạo mảng nặc danh
int[] c = {1, 2, 3, 4, 5};
// khởi tạo mảng bằng vòng lặp for
int[] b = new int[10];
for (int i = 0; i < 10; i++) {
    	b[i] = i;
}
```

### **\*** **Wrapper Class:**
* Lớp Wrapper trong java cung cấp cơ chế để chuyển đổi kiểu dữ liệu nguyên thủy thành kiểu đối tượng và từ đối tượng thành kiểu dữ liệu nguyên thủy.
* Trong java, có 8 lớp Wrapper chúng được thiết kế trong gói java.lang:

| Kiểu nguyên thủy | Kiểu Wrapper |
| ---------------- | ------------ |
| boolean          | Boolean      |
| char             | Character    |
| byte             | Byte         |
| short            | Short        |
| int              | Integer      |
| long             | Long         |
| float            | Float        |
| double           | Double       |

* Các phương thức của lớp Wrapper trong Java

| Phương thức | Mô tả                                                                                |
| ----------- | ------------------------------------------------------------------------------------ |
| typeValue() | Trả về giá trị đã chuyển đổi của đối tượng Số này thành kiểu dữ liệu được chỉ định.  |
| compareTo() | Nó so sánh đối tượng Number này với đối số được chỉ định.                            |
| equals()    | Nó kiểm tra xem đối tượng Number này có bằng với đối số được chỉ định hay không      |
| valueOf()   | Trả về một đối tượng Integer chứa giá trị kiểu nguyên thủy đã chỉ định.              |
| toString()  | Trả về một đối tượng Chuỗi chứa giá trị của một đối số kiểu Số nguyên được chỉ định. |
| parseInt()  | Truy xuất kiểu dữ liệu nguyên thủy của một chuỗi được chỉ định.                      |

### **\*** **String Classes:**

* String được định nghĩa là một chuỗi hoặc một mảng ký tự. String trong Java không phải là một kiểu dữ liệu nguyên thủy mà là một đối tượng của lớp class String. String trong Java là một trong những lớp phổ biến nhất và được sử dụng rộng rãi trong lập trình Java.
* Có 2 cách để tạo đối tượng String:
  * **Sử dụng String Literal**:String literal được tạo ra bằng cách sử dụng 2 dấu nháy kép. Ví dụ:
    >String s = "welcome"; 
  * **Sử dụng từ khóa new**: 
    >String s=new String("Welcome");
* ***Các phương thức của lớp String trong Java:***

| Phương thức                                    | Mô tả                                                              |
| ---------------------------------------------- | ------------------------------------------------------------------ |
| char charAt(int index)                         | trả lại giá trị ký tự tại một vị trí chính xác                     |
| int length()                                   | Trả về độ dài chuỗi.                                               |
| String substring(int beginIndex)               | Trả về chuỗi con bắt đầu từ chỉ số index.                          |
| String substring(int beginIndex, int endIndex) | Trả về chuỗi con từ chỉ số bắt đầu đến chỉ số kết thúc.            |
| boolean contains(CharSequence s)               | Kiểm tra chuỗi chứa chuỗi không, kết quả trả về là giá trị boolean |
| boolean equals(Object another)                 | kiểm tra sự tương đương của chuỗi với đối tượng.                   |
| boolean isEmpty()                              | Kiểm tra chuỗi rỗng                                                |
| String concat(String str)                      | Nối chuỗi cụ thể.                                                  |
| String toLowerCase()                           | Trả về chuỗi chữ thường.                                           |
| String toUpperCase()                           | Trả về chuỗi chữ hoa.                                              |

* **Lớp StringBuffer:** Trong java, lớp StringBuffer được sử dụng để tạo chuỗi có thể thay đổi (mutable). Lớp StringBuffer trong java tương tự như lớp String ngoại trừ nó có thể thay đổi.
  * Các phương thức:

| Phương thức                                                                        | Mô tả                                                       |
| ---------------------------------------------------------------------------------- | ----------------------------------------------------------- |
| public synchronized StringBuffer append(String s)                                  | nối thêm các chuỗi được chỉ định với chuỗi này              |
| public synchronized StringBuffer insert(int offset, String s)                      | chèn chuỗi chỉ định với chuỗi này tại vị trí quy định.      |
| public synchronized StringBuffer replace(int startIndex, int endIndex, String str) | thế chuỗi từ vị trị startIndex đến endIndex bằng chuỗi str. |
| public synchronized StringBuffer delete(int startIndex, int endIndex)              | xóa chuỗi từ vị trí startIndex đến endIndex.                |
| public synchronized StringBuffer reverse()                                         | đảo ngược chuỗi.                                            |

* **Lớp StringBuilder:** Trong java, lớp StringBuilder được sử dụng để tạo chuỗi có thể thay đổi (mutable). Lớp StringBuilder trong java tương tự như lớp StringBuffer ngoại trừ nó không đồng bộ(non-synchronized).

### **\*** **Math Class:**

***Trước khi gọi các hàm Math, có thể import package để khỏi phải viết đầy đủ tên pack***
```php
import java.lang.Math;
```
***Các hàm toán học trong Math Class:***
* `Math.PI` hằng số PI
* `Math.abs()` trả về giá trị tuyệt đối của tham số
* `Math.ceil()` trả về giá trị double là số làm tròn tăng bằng giá trị số nguyên gần nhất
* `Math.floor()` trả về double là số làm tròn giảm
* `Math.max()` lấy số lớn trong hai số
* `Math.min` lấy số nhỏ
* `Math.pow` lấy lũy thừa (cơ-số, số mũ)
* `Math.sqrt()` khai căn
* `Math.sin(), Math.cos()` sin và cos của góc đơn vị radian
    ```php
    double s = Math.sin(Math.PI/2);//1
    ```
* `Math.toDegrees()` đổi góc radian thành độ
* `Math.toRadians()` đổi góc đơn vị độ ra radian

## 2. Java Regex 
***
***Java Regex hoặc Regular Expression (biểu thức chính quy)*** là một API để định nghĩa một mẫu để tìm kiếm hoặc thao tác với chuỗi. Nó được sử dụng rộng rãi để xác định ràng buộc trên các chuỗi như xác thực mật khẩu, email, kiểu dữ liệu datetime, ...

## 3. Class & Object
***
