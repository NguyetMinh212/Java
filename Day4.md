# Java - Buổi 4
## I. Package trong Java
- Một **package** (gói) trong java là một nhóm các kiểu tương tự của các lớp, giao diện và các package con .
- **Package** trong java có thể được phân loại theo hai hình thức, package được dựng sẵn và package do người dùng định nghĩa.
- Có rất nhiều package được dựng sẵn như java, lang, AWT, javax, swing, net, io, util, sql, ...

### 1. Ưu điểm của việc sử dụng package trong Java
- Package được sử dụng để phân loại lớp và interface giúp dễ dàng bảo trì.
- Package cung cấp bảo vệ truy cập.
- Package khắc phục được việc đặt trùng tên.

### 2. Truy câp package từ package khác
#### Sử dụng `packagename.*`
- Nếu sử dụng **packagename.\***. Thì tất cả các lớp và các interface của các gói này sẽ có thể truy cập, nhưng gói con của gói này thì không được truy cập.
- Từ khóa **import** được sử dụng để truy cập các lớp và interface của gói khác từ gói hiện tại.

#### Sử dụng `packagename.classname`
- Nếu khai báo `import package.classname` thì chỉ được truy cập tới lớp đã được khai báo của package này.

```php
package pack;  
public class A {
    public void msg() {
        System.out.println("Hello");
    }
} 

package mypack;  
import pack.A;  
   
class B {
    public static void main(String args[]) {
        A obj = new A();
        obj.msg();
    }
}
```
#### Sử dụng tên đầy đủ
- Nếu sử dụng tên đầy đủ thì chỉ được truy cập tới lớp đã được khai báo của package này, không cần phải sử dụng đến từ khóa import. Nhưng cần phải sử dụng tên đầy đủ mỗi khi truy cập vào các lớp hoặc interface.

- Cách này thường được sử dụng khi 2 package có tên lớp giống nhau. Ví dụ, 2 package java.util và java.sql chứa lớp có tên giống nhau là lớp Date. 

```php
package pack;  
public class A {
    public void msg() {
    System.out.println("Hello");
    }
}

package mypack;  
class B{  
    public static void main(String args[]){  
        pack.A obj = new pack.A(); //Sử dụng tên đầy đủ
        obj.msg();  
    }  
}  
```

> Note: Nếu bạn import một package thì package con của package đó không được import.
Thứ tự của chương trình phải là `package->import->class.`

![png](https://viettuts.vn/images/java/thu-tu-cua-package.jpg)

### 3. Package con trong Java
- Package bên trong một package khác được gọi là subpackage hay package con trong java.
> Tiêu chuẩn để định nghĩa tên package trong java là **domain.company.package**

```php
package vn.viettuts.core;
 
public class Simple {
    public static void main(String args[]) {
        System.out.println("Hello subpackage");
    }
}
```
## II. Xử lý ngoại lệ trong Java (Xử lý Exception)
- **Exception Handling** trong java hay xử lý ngoại lệ trong java là một cơ chế mạnh mẽ để xử lý các lỗi runtime để có thể duy trì luồng bình thường của ứng dụng.

### 1. Khối lệnh try-catch trong Java
- **Khối lệnh try trong java** được sử dụng để chứa một đoạn code có thế xảy ra một ngoại lệ. Nó phải được khai báo trong phương thức.

- Sau một **khối lệnh try** bạn phải khai báo khối lệnh **catch** hoặc **finally** hoặc cả hai.
#### Cú pháp của khối lệnh try-catch trong java
```php
try {  
    // code có thể ném ra ngoại lệ
} catch(Exception_class_Name ref) {
    // code xử lý ngoại lệ
}  
```

#### Cú pháp của khối lệnh try-finally trong java
```php
try {  
    // code có thể ném ra ngoại lệ
} finally {
    // code trong khối này luôn được thực thi
}  
```

#### Khối lệnh catch trong java
- **Khối catch** trong java được sử dụng để xử lý các Exception. Nó phải được sử dụng sau khối try.

- Có thể sử dụng nhiều khối catch với một khối try duy nhất.

#### Đa khối lệnh catch trong Java

- Nếu phải thực hiện các tác vụ khác nhau mà ở đó có thể xảy ra các ngoại lệ khác nhau, hãy sử dụng đa khối lệnh catch trong java.
> Quy tắc: Vào một thời điểm chỉ xảy ra một ngoại lệ và tại một thời điểm chỉ có một khối catch được thực thi.

> Quy tắc: Tất cả các khối catch phải được sắp xếp từ cụ thể nhất đến chung nhất, tức là phải khai báo khối lệnh catch để xử lý lỗi ArithmeticException trước khi khai báo catch để xử lý lỗi Exception.

#### Khối lệnh try lồng nhau trong Java
- Đôi khi một tình huống có thể phát sinh khi một phần của một khối lệnh có thể xảy ra một lỗi và toàn bộ khối lệnh chính nó có thể xảy ra một lỗi khác. Trong những trường hợp như vậy, trình xử lý ngoại lệ phải được lồng nhau.
```php
try {  
    statement 1;  
    statement 2;  
    try {  
        statement 1;  
        statement 2;  
    }  
    catch(Exception e) {
         
    }  
}  
catch(Exception e) {
     
}
```
```php
public class TestException {
    public static void main(String args[]) {
        try {
            try {
                System.out.println("Thuc hien phep chia");
                int b = 39 / 0;
            } catch (ArithmeticException e) {
                System.out.println(e);
            }
 
            try {
                int a[] = new int[5];
                a[5] = 4;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
 
            System.out.println("khoi lenh khac");
        } catch (Exception e) {
            System.out.println("xy ly ngoai le");
        }
 
        System.out.println("tiep tuc chuong trinh..");
    }
}
```

#### Khối lệnh finally
- Khối lệnh finally trong java được sử dụng để thực thi các lệnh quan trọng như đóng kết nối, đóng các stream,...

- Khối lệnh finally trong java luôn được thực thi cho dù có ngoại lệ xảy ra hay không hoặc gặp lệnh return trong khối try.

- Khối lệnh finally trong java được khai báo sau khối lệnh try hoặc sau khối lệnh catch.

![png](https://viettuts.vn/images/java/exception-handling/flow-cua-khoi-lenh-finally-trong-java.png)

```php
public class TestFinallyBlock {
    public static void main(String args[]) {
        try {
            int data = 25 / 5;
            System.out.println(data);
        } catch (NullPointerException e) {
            System.out.println(e);
        } finally {
            System.out.println("finally block is always executed");
        }
        System.out.println("rest of the code...");
    }
}
```

> Quy tắc: Đối với mỗi khối try, có thể có không hoặc nhiều khối catch, nhưng chỉ có một khối finally

> Note: Khối finally sẽ không được thực thi nếu chương trình bị thoát (bằng cách gọi System.exit() hoặc xảy ra một lỗi không thể tránh khiến chương trình bị chết).

#### Từ khóa throw trong Java
- Từ khoá throw trong java được sử dụng để ném ra một ngoại lệ cụ thể.

- Từ khóa throw chủ yếu được sử dụng để ném ngoại lệ tùy chỉnh (ngoại lệ do người dùng tự định nghĩa). 

```php
// Cú pháp
throw exception;

//ví dụ
throw new IOException("File không tồn tại");
```

```php
//throw ra ngoại lệ nhưng không xử lý
public class TestThrow1 {
    static void validate(int age) {
        if (age < 18)
            throw new ArithmeticException("not valid");
        else
            System.out.println("welcome");
    }
 
    public static void main(String args[]) {
        validate(13);
        System.out.println("rest of the code...");
    }
}
// Output: 
Exception in thread "main" java.lang.ArithmeticException: not valid

// throw ra ngoại lệ nhưng có xử lý
public class TestThrow2 {
    static void validate(int age) {
        try {
            if (age < 18)
                throw new ArithmeticException("not valid");
            else
                System.out.println("welcome");
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }
    }
 
    public static void main(String args[]) {
        validate(13);
        System.out.println("rest of the code...");
    }
}
// Output:
not valid
rest of the code...
```

#### Từ khóa throws trong Java
```php
return_type method_name() throws exception_class_name {  
    / /method code
}
```

> Quy tắc: Nếu bạn đang gọi một phương thức khai báo throws một ngoại lệ, bạn phải bắt hoặc throws ngoại lệ đó

```php
void m() throws ArithmeticException {  
    throw new ArithmeticException("sorry");  
}  
```


