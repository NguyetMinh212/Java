# Java - Buổi 2
## I. Collection vs Collections
* **Collections** trong java là một khuôn khổ cung cấp một kiến trúc để lưu trữ và thao tác tới nhóm các đối tượng. Tất cả các hoạt động thực hiện trên một dữ liệu như tìm kiếm, phân loại, chèn, xóa,... có thể được thực hiện bởi Java Collections.
* **Collection** trong java là một root interface trong hệ thống cấp bậc Collection. Java Collection cung cấp nhiều interface (Set, List, Queue, Deque vv) và các lớp (ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet vv).

    ![Collection](https://viettuts.vn/images/java/java-collection/colection-vs-collections-trong-java.png)

* **Hệ thống cấp bậc Collection trong Java**
  * Gói `java.util` chứa tất cả các lớp và interface của Collection.

  ![interface](https://viettuts.vn/images/java/java-collection/he-thong-cap-bac-colection-trong-java.png)

* **Các phương thức của interface Collection trong java**

| Phương thức                              | Mô tả                                                                                                           |
| ---------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| public boolean add(Object element)       | Được sử dụng để chèn một phần tử vào collection.                                                                |
| public boolean addAll(Collection c)      | Được sử dụng để chèn các phần tử collection được chỉ định vào collection gọi phương thức này.                   |
| public boolean remove(Object element)    | Được sử dụng để xóa phần tử từ collection.                                                                      |
| public boolean removeAll(Collection c)   | Được sử dụng để xóa tất cả các phần tử của collection được chỉ định từ collection gọi phương thức này.          |
| public boolean retainAll(Collection c)   | Được sử dụng để xóa tất cả các thành phần từ collection gọi phương thức này ngoại trừ collection được chỉ định. |
| public int size()                        | Trả lại tổng số các phần tử trong collection.                                                                   |
| public void clear()                      | Loại bỏ tổng số của phần tử khỏi collection.                                                                    |
| public boolean contains(Object element)  | Được sử dụng để tìm kiếm phần tử.                                                                               |
| public boolean containsAll(Collection c) | ược sử dụng để tìm kiếm collection được chỉ định trong collection.                                              |
| public Iterator iterator()               | Trả về một iterator.                                                                                            |
| public Object[] toArray()                | Chuyển đổi collection thành mảng (array).                                                                       |
| public boolean isEmpty()                 | Kiểm tra nếu collection trống.                                                                                  |
| public boolean equals(Object element)    | So sanh 2 collection.                                                                                           |
| public int hashCode()                    | Trả về số hashcode của collection.                                                                              |

* **Duyệt các phần tử của collection**
  * _Sử dụng Iterator interface._
  * _Sử dụng vòng lặp for-each._

```php
import java.util.ArrayList;
import java.util.Iterator;
 
public class ArrayListExample1 {
    public static void main(String args[]) {
        // Creating arraylist
        ArrayList<String> list = new ArrayList<String>();
        // Add objects to arraylist
        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add("Java");
        // Show list through Iterator
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + ", ");
        }
        // Show list through for-each
        System.out.println();
        for (String obj : list) {
            System.out.print(obj + ", ");
        }
        // Show list through index
        System.out.println();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            System.out.print(list.get(i) + ", ");
        }
    }
}
``` 
## II. Các Collection phổ biến
### 1. List
**List** là một interface trong java. Nó chứa các phương thức để chèn và xóa các phần tử dựa trên chỉ số index.
* **Khai báo** interface List trong java
```php
public interface List<E> extends Collection<E>
```
* Các **phương thức** của interface List trong java

| Method                                 | Description                                                                             |
| -------------------------------------- | --------------------------------------------------------------------------------------- |
| void add(int index,Object element)     | Nó được sử dụng để chèn các phần tử vào list tại chỉ số index.                          |
| boolean addAll(int index,Collection c) | Nó được sử dụng để chèn tất cả các yếu tố của c vào danh sách tại chỉ số index.         |
| object get(int index)                  | Nó được sử dụng để trả về đối tượng được lưu trữ tại chỉ số index trong list.           |
| object set(int index,Object element)   | Nó được sử dụng để gán phần tử cho vị trí được chỉ định index trong list.               |
| object remove(int index)               | Nó được sử dụng để xóa các phần tử tại vị trí có chỉ số index và trả về phần tử đã xóa. |
| ListIterator listIterator()            | Nó được sử dụng để trả về một Iterator mà bắt đầu từ phần tử đầu tiên của list.         |
| ListIterator listIterator(int index)   | Nó được sử dụng để trả về một Iterator mà phần tử bắt đầu từ chỉ số index chỉ định.     |

```php
import java.util.ArrayList;
import java.util.List;
 
public class ListExample {
    public static void main(String args[]) {
        List<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add(1, "Python");
        System.out.println("Phan tu co index = 2 la: " + list.get(2));
        // show list
        for (String s : list) {
            System.out.println(s);
        }
    }
}
```
* Khai báo interface ListIterator trong java
```php
public interface ListIterator<E> extends Iterator<E>
```
* Các phương thức của interface ListIterator trong java

| Method                | Description                                                                                 |
| --------------------- | ------------------------------------------------------------------------------------------- |
| boolean hasNext()     | Phương pháp này trả về true nếu list interator có tồn tại phần tử kế tiếp phần tử hiện tại. |
| Object next()         | Phương thức này trả về phần tử kế tiếp trong danh sách và vị trí con trỏ tăng lên 1.        |
| boolean hasPrevious() | Phương pháp này trả về true nếu list interator có tồn tại phần tử kế sau phần tử hiện tại.  |
| Object previous()     | Phương thức này trả về phần tử kế sau trong danh sách và vị trí con trỏ giảm đi 1.          |

```php
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
 
public class ListExample {
    public static void main(String args[]) {
        List<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add(1, "Python");
        System.out.println("Phan tu co index = 2 la: " + list.get(2));
 
        ListIterator<String> itr = list.listIterator();
        System.out.println("Duyet cac phan tu tu dau den cuoi:");
        while (itr.hasNext()) {
            System.out.println("\t" + itr.next());
        }
        System.out.println("Duyet cac phan tu tu cuoi ve dau:");
        while (itr.hasPrevious()) {
            System.out.println("\t" + itr.previous());
        }
    }
}
```
### 2. ArrayList
**ArrayList** được sử dụng như một mảng động để lưu trữ các phần tử.
- Lớp ArrayList trong java có thể chứa các phần tử trùng lặp.
- Lớp ArrayList duy trì thứ tự của phần tử được thêm vào.
- Lớp ArrayList là không đồng bộ 
- Lớp ArrayList cho phép truy cập ngẫu nhiên vì nó lưu dữ liệu theo chỉ mục.
- Lớp ArrayList trong java thao tác chậm vì cần nhiều sự dịch chuyển nếu bất kỳ phần tử nào bị xoá khỏi danh sách.

**Khai báo**
```php
public class ArrayList<E> extends AbstractList<E>
        implements List<E>, RandomAccess, Cloneable, java.io.Serializable
```
**Khởi tạo ArrayList trong java**
```php
ArrayList list = new ArrayList(); // non-generic - kiểu cũ
ArrayList<String> list = new ArrayList<String>(); // generic - kiểu mới
```
**Constructor của lớp ArrayList**

| Constructor             | Mô tả                                                                                          |
| ----------------------- | ---------------------------------------------------------------------------------------------- |
| ArrayList()             | Nó được sử dụng để khởi tạo một danh sách mảng trống.                                          |
| ArrayList(Collection c) | Nó được sử dụng để xây dựng một danh sách mảng được khởi tạo với các phần tử của collection c. |
| ArrayList(int capacity) | Nó được sử dụng để xây dựng một danh sách mảng mà có dung lượng ban đầu được chỉ định.         |

**Phương thức của lớp ArrayList**
| Phương thức                             | Mô tả                                                                                                                                                 |
| --------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------- |
| boolean add(Object o)                   | Nó được sử dụng để nối thêm phần tử được chỉ định vào cuối một danh sách.                                                                             |
| void add(int index, Object element)     | Nó được sử dụng để chèn phần tử element tại vị trí index vào danh sách.                                                                               |
| boolean addAll(Collection c)            | Nó được sử dụng để nối tất cả các phần tử trong collection c vào cuối của danh sách, theo thứ tự chúng được trả về bởi bộ lặp iterator.               |
| boolean addAll(int index, Collection c) | Nó được sử dụng để chèn tất cả các phần tử trong collection c vào danh sách, bắt đầu từ vị trí index.                                                 |
| void retainAll(Collection c)            | Nó được sử dụng để xóa những phần tử không thuộc collection c ra khỏi danh sách.                                                                      |
| void removeAll(Collection c)            | Nó được sử dụng để xóa những phần tử thuộc collection c ra khỏi danh sách.                                                                            |
| int indexOf(Object o)                   | Nó được sử dụng để trả về chỉ mục trong danh sách với sự xuất hiện đầu tiên của phần tử được chỉ định, hoặc -1 nếu danh sách không chứa phần tử này.  |
| int lastIndexOf(Object o)               | Nó được sử dụng để trả về chỉ mục trong danh sách với sự xuất hiện cuối cùng của phần tử được chỉ định, hoặc -1 nếu danh sách không chứa phần tử này. |
| Object[] toArray()                      | Nó được sử dụng để trả về một mảng chứa tất cả các phần tử trong danh sách này theo đúng thứ tự.                                                      |
| Object[] toArray(Object[] a)            | Nó được sử dụng để trả về một mảng chứa tất cả các phần tử trong danh sách này theo đúng thứ tự.                                                      |
| Object clone()                          | Nó được sử dụng để trả về một bản sao của ArrayList.                                                                                                  |
| void clear()                            | Nó được sử dụng để xóa tất cả các phần tử từ danh sách này.                                                                                           |
| void trimToSize()                       | Nó được sử dụng để cắt dung lượng của thể hiện ArrayList này là kích thước danh sách hiện tại.                                                        |
| boolean contains(element)               | Kết quả trả về là true nếu tìm thấy element trong danh sách, ngược lại trả về false.                                                                  |

**Các Ví dụ ArrayList trong Java**
* _Cập nhật giá trị của phần tử Arraylist_

    >Để cập nhật giá trị của phần tử trong ArrayList, Java cung cấp cho chúng ta phương thức set(index, element), trong đó index là chỉ số của phần tử cần cập nhật và element là phần tử mới để thay thế.

```php
package vn.viettuts.arraylist;
 
import java.util.ArrayList;
 
public class CapNhatArrayList1 {
    public static void main(String[] args) {
        // khai báo 1 ArrayList có tên là list
        // có kiểu là String
        ArrayList<String> list = new ArrayList<String>();
        // thêm các phần tử vào list
        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add("Java");
 
        System.out.println("list trước khi cập nhật: ");
        System.out.println(list);
        // cập nhật giá trị cho phần tử có chỉ số là 3 (Java)
        list.set(3, "Python");
        System.out.println("list sau khi cập nhật: ");
        System.out.println(list);
    }
}
```

* _Tạo ArrayList có kiểu generic là đối tượng do người dùng định nghĩa_

```php
import java.util.ArrayList;
 
class Student {
    private String name;
    private int age;
    public Student(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student@[name=" + name + ", age=" + age + "]";
    }
}
 
public class ArrayListExample2 {
    public static void main(String[] args) {
        // Create listStudent
        ArrayList<Student> listStudent = new ArrayList<Student>();
        // Create students
        Student student1 = new Student("Bac", 17);
        Student student2 = new Student("Nam", 20);
        Student student3 = new Student("Trung", 19);
        // Add objects to listStudent
        listStudent.add(student1);
        listStudent.add(student2);
        listStudent.add(student3);
        // Show listStudent
        for (Student student : listStudent) {
            System.out.println(student.toString());
        }
    }
}
```
### 3. Map
Trong java, **map** được sử dụng để lưu trữ và truy xuất dữ liệu theo cặp key và value. Mỗi cặp key và value được gọi là mục nhập (entry). Map trong java chỉ chứa các giá trị key duy nhất. Map rất hữu ích nếu bạn phải tìm kiếm, cập nhật hoặc xóa các phần tử trên dựa vào các key.

**Các phương thức hữu ích của Map interface**

| Phương thức                          | Mô tả                                                                       |
| ------------------------------------ | --------------------------------------------------------------------------- |
| Object put(Object key, Object value) | Nó được sử dụng để chèn một mục nhập trong map hiện tại.                    |
| void putAll(Map map)                 | Nó được sử dụng để chèn map chỉ định vào map hiện tại.                      |
| Object remove(Object key)            | Nó được sử dụng để xóa một mục nhập của key được chỉ định.                  |
| Object get(Object key)               | Nó được sử dụng để trả lại giá trị cho khoá được chỉ định.                  |
| boolean containsKey(Object key)      | Nó được sử dụng để tìm kiếm key được chỉ định từ map hiện tại.              |
| Set keySet()                         | Nó được sử dụng để trả đối tượng Set có chứa tất cả các keys.               |
| Set entrySet()                       | Nó được sử dụng để trả lại đối tượng Set có chứa tất cả các keys và values. |

**Map.Entry Interface**

**Entry** là một interface con của Map. Vì vậy, chúng ta được truy cập nó bằng tên **Map.Entry**. Nó cung cấp các phương pháp để truy xuất các key và value.

| Phương thức       | Mô tả                         |
| ----------------- | ----------------------------- |
| Object getKey()   | Nó được dùng để lấy key.      |
| Object getValue() | Nó được sử dụng để lấy value. |

**Ví
```php
package vn.viettuts.collection;
 
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
 
public class MapExample1 {
    public static void main(String args[]) {
        // init map
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(100, "A");
        map.put(101, "B");
        map.put(102, "C");
        // show map
        Set<Integer> set = map.keySet();
        for (Integer key : set) {
            System.out.println(key + " " + map.get(key));
        }
    }
}
```

_sử dụng Map.Entry interface để truy cập các phần tử của Map_
```php
package vn.viettuts.collection;
 
import java.util.HashMap;
import java.util.Map;
 
public class MapExample3 {
    public static void main(String args[]) {
        // init map
        Map<Integer, String> map = new HashMap<Integer, String>();
        // add elements to map
        map.put(1, "Java");
        map.put(3, "C++");
        map.put(2, "PHP");
        map.put(4, "Python");
        // show map
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
```
## III. List và ArrayList
### 1. Phân biệt List và ArrayList
* Sự khác biệt chính giữa **List** và **ArrayList** là **List** là một giao diện và **ArrayList** là một lớp.
* Giao diện List mở rộng khung Collection trong khi đó, ArrayList mở rộng Class trừu tượng và nó thực hiện các giao diện List .
* Giao diện danh sách tạo ra một tập hợp các phần tử được lưu trữ theo trình tự và được xác định hoặc truy cập bằng số chỉ mục của chúng. Mặt khác, ArrayList tạo ra một mảng các đối tượng trong đó mảng có thể tự động phát triển khi được yêu cầu.
* ArrayList khắc phục vấn đề của một mảng tĩnh trong Java tiêu chuẩn, tức là mảng không thể tăng kích thước một khi nó được tạo. Khi một mảng được tạo bằng ArrayList, một mảng động được tạo có thể tăng và thu nhỏ kích thước khi cần.
### 2. Khi nào dùng List, khi nào dùng ArrayList
## IV. Một số methods thường dùng trong Collections

| Method                                                                               | Description                                                                                                              |
| ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| static <T> boolean addAll(Collection<? super T> c, T... elements)                    | Nó được sử dụng để thêm tất cả các phần tử quy định vào bộ sưu tập được chỉ định.                                        |
| static <T> Queue<T> asLifoQueue(Deque<T> deque)                                      | Nó được sử dụng để trả về một đối tượng Deque như một hàng đợi LIFO (Last-In-First-Out).                                 |
| static <T> int binarySearch(List<? extends T> list, T key, Comparator<? super T< c)  | Nó được sử dụng để tìm kiếm danh sách được chỉ định cho đối tượng được chỉ định sử dụng thuật toán tìm kiếm nhị phân.    |
| static <E> List<E> checkedList(List<E> list, Class<E> type)                          | Nó được sử dụng để trả về một chế độ xem kiểu động của đối tượng list được chỉ định.                                     |
| static <E> Set<E> checkedSet(Set<E> s, Class<E> type)                                | Nó được sử dụng để trả về một chế độ xem kiểu động của đối tượng set được chỉ định.                                      |
| static <E> SortedSet<E>checkedSortedSet(SortedSet<E> s, Class<E> type)               | Nó được sử dụng để trả về một chế độ xem kiểu động của đối tượng SortedSet được chỉ định.                                |
| static void reverse(List<?> list)                                                    | Nó được sử dụng để đảo ngược thứ tự của các phần tử trong danh sách được chỉ định.                                       | . |
| static <T> T max(Collection<? extends T> coll, Comparator<? super T> comp)           | Nó được sử dụng để trả về phần tử max của bộ sưu tập đã cho, theo thứ tự được sắp xếp bởi comparator được chỉ định.      |
| static <T extends Object & Comparable<? super T>>T min(Collection<? extends T> coll) | Nó được sử dụng để trả về phần tử min của bộ sưu tập đã cho, theo thứ tự được sắp xếp bởi comparable được chỉ định.      |
| static boolean replaceAll(List list, T oldVal, T newVal)                             | Nó được sử dụng để thay thế tất cả các lần xuất hiện của một giá trị được chỉ định trong danh sách với một giá trị khác. |

**Sorting trong Collection**

*Phương thức `Collections.sort(List list)`*

`public void sort(List list)`: được sử dụng để sắp xếp các phần tử của List. Với điều kiện các phần tử của List phải là kiểu Comparable. Nghĩa là lớp các phần tử phải được implements giao diện Comparable
>Note: Lớp String và các lớp Wrapper được implements giao diện Comparable. Vì vậy nếu bạn lưu trữ các đối tượng của lớp String và Wrapper thì chúng đã là kiểu Comparable. Khi đó bạn có thể áp dụng phương thức Collections.sort(List list) mà không phải cài đặt gì thêm.Còn đối với List của các đối tượng do người dùng tự định nghĩa thì bạn phải implements giao diện Comparable cho lớp của đối tượng đó.
* Ví dụ sắp xếp đối tượng String:
```php
package vn.viettuts.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
 
public class CollectionsExample3 {
    public static void main(String args[]) {
        // create list
        List<String> list = new ArrayList<String>();
        // add elements to list
        list.add("Java");
        list.add("C");
        list.add("C++");
        list.add("PHP");
        list.add("Python");
        // sort list
        Collections.sort(list);
        // show list
        for (String element : list) {
            System.out.println(element);
        }
    }
}
```
>Đối với String implements giao diện Comparable **mặc định là sắp xếp tăng dần**. Muốn sắp xếp giảm dần ta phải override.
```php
package vn.viettuts.collection;
 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
 
public class CollectionsExample4 {
    public static void main(String args[]) {
        // create list
        List<String> list = new ArrayList<String>();
        // add elements to list
        list.add("Java");
        list.add("C");
        list.add("C++");
        list.add("PHP");
        list.add("Python");
        // sort list
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        // show list
        for (String element : list) {
            System.out.println(element);
        }
    }
}
```
* Ví dụ sắp xếp đối tượng của lớp Wrapper
```php
package vn.viettuts.collection;
 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
 
/**
 * CollectionsExample5 class
 * 
 * @author viettuts.vn
 */
public class CollectionsExample5 {
    public static void main(String[] args) {
        // create list
        List<Double> list = new ArrayList<Double>();
        // add elements to list
        list.add(15D);
        list.add(20D);
        list.add(16.5D);
         
        // sort list ASC
        Collections.sort(list);
        // show list
        System.out.println("show list ASC:");
        for (Double element : list) {
            System.out.println(element);
        }
         
        // sort list DESC
        Collections.sort(list, new Comparator<Double>() {
            @Override
            public int compare(Double o1, Double o2) {
                return o1 > o2 ? -1 : 1;
            }
        });
        // show list
        System.out.println("show list DESC:");
        for (Double element : list) {
            System.out.println(element);
        }
    }
}
```
* Ví dụ sắp xếp đối tượng của lớp Student (User-defined)
  * **Cách 1**: lớp Student `implements giao diện java.lang.Comparable` để cài đặt phương thức __compareTo()__. Bạn cần phải _cài đặt tiêu chí để so sánh trong phương thức compareTo()_ để so sánh các đối tượng Student với nhau.

```php
package vn.viettuts.collection;
 
class Student implements Comparable<Student> {
    private int id;
    private String name;
    private int age;
    private String address;
 
    public Student() {
    }
 
    public Student(int id, String name, int age, String address) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }
 
    // getter & setter
     
    @Override
    public String toString() {
        return "Student@id=" + id + ",name=" + name 
                + ",age=" + age + ",address=" + address;
    }
 
    @Override
    public int compareTo(Student student) {
        // sort student's name by ASC
        return this.getName().compareTo(student.getName());
    }
}

package vn.viettuts.collection;
 
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample6 {
    public static void main(String[] args) {
        // create list students
        List<Student> listStudents = new ArrayList<Student>();
        // add students to list
        listStudents.add(new Student(1, "Vinh", 19, "Hanoi"));
        listStudents.add(new Student(2, "Hoa", 19, "Hanoi"));
        listStudents.add(new Student(3, "Phu", 20, "Hanoi"));
        listStudents.add(new Student(4, "Quy", 22, "Hanoi"));
        // sort list student
        Collections.sort(listStudents);
        // show list students
        for (Student student : listStudents) {
            System.out.println(student.toString());
        }
    }
}
```