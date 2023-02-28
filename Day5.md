# Java - Buổi 5
# Java Swing
Hệ thống phân cấp của API java swing:
![image](https://viettuts.vn/images/java-swing/phan-cap-cac-lop-java-swing.jpg)

**Các phương thức thường dùng của lớp Component**

| Constructor                                | Nội dung                                                                   |
| ------------------------------------------ | -------------------------------------------------------------------------- |
| public void add(Component c)               | thêm một thành phần vào thành phần khác.                                   |
| public void setSize(int width, int height) | public void setSize(int width, int height)                                 |
| public void setLayout(LayoutManager m)     | thiết lập trình quản lý bố cục (layout) cho thành phần.                    |
| public void setVisible(boolean b)          | thiết lập khả năng hiển thị của thành phần. Nó theo mặc định là false (ẩn) |

## 1. Lớp JLabel trong Java Swing
* Lớp **JLabel** trong **Java Swing** có thể hiển thị hoặc text, hoặc hình ảnh hoặc cả hai.
* Theo mặc định, các label được căn chỉnh theo chiều dọc trong khu vực hiển thị. 
* Theo mặc định, ``text-only label`` là căn chỉnh theo cạnh, ``image-only label`` là căn chỉnh theo chiều ngang.
### Cú pháp của lớp javax.swing.JLabel
```php
public class JLabel extends JComponent
        implements SwingConstants, Accessible
```
### Constructor của lớp JLabel trong Java Swing

| Constructor                                             | Nội dung                                                                          |
| ------------------------------------------------------- | --------------------------------------------------------------------------------- |
| JLabel()                                                | Tạo một instance của JLabel, không có hình ảnh, và với một chuỗi trống cho title. |
| JLabel(Icon image)                                      | Tạo một instance của JLabel với hình ảnh đã cho.                                  |
| JLabel(Icon image, int horizontalAlignment)             | Tạo một instance của JLabel với hình ảnh và căn chỉnh ngang đã cho.               |
| JLabel(String text)                                     | Tạo một instance của JLabel với text đã cho.                                      |
| JLabel(String text, Icon icon, int horizontalAlignment) | Tạo một instance của JLabel với text, hình ảnh, và căn chỉnh ngang đã cho.        |
| JLabel(String text, int horizontalAlignment)            | Tạo một instance của JLabel với text và căn chỉnh ngang đã cho.                   |

### Một số phương thức thường được sử dụng của lớp JLabel:
| Phương thức                   | Nội dung                                                      |
| ----------------------------- | ------------------------------------------------------------- |
| void setText(String text)     | Định nghĩa trường text dòng đơn mà thành phần này sẽ hiển thị |
| void setLabelFor(Component c) | void setLabelFor(Component c)                                 |
| void setIcon(Icon icon)       | void setIcon(Icon icon)                                       |

## 2. Lớp JFrame trong Java Swing
* Container là thành phần chủ chốt trong các thành phần của SWING GUI. Một Container cung cấp một không gian, là nơi đặt một thành phần. 
* Các lớp con của Container được gọi là Container. Một số ví dụ về các lớp con của Container là JPanel, JFrame và JWindow.
* Container chỉ có thể thêm Component vào chính nó.
* Một layout mặc định có mặt trong mỗi container. Layout này có thể bị ghi đè bởi sử dụng phương thức setLayout().

### Lớp JFrame này có các constructor sau:
| Constructor                                    | Nội dung                                                                                  |
| ---------------------------------------------- | ----------------------------------------------------------------------------------------- |
| JFrame()                                       | Xây dựng một Frame mới, ban đầu là không nhìn thấy (invisible).                           |
| JFrame(String title)                           | Tạo một Frame mới, ban đầu là không nhìn thấy (invisible) với title đã cho.               |
| JFrame(String title, GraphicsConfiguration gc) | Tạo một Frame với title đã cho và GraphicsConfiguration đã cho của một thiết bị màn hình. |

## 3. Lớp JTextField trong Java Swing
* Lớp JTextField trong Java Swing là một thành phần cho phép sửa đổi một dòng text đơn.
### Các constructor của lớp JTextField trong Java Swing
| Constructor                                        | Nội dung                                                                             |
| -------------------------------------------------- | ------------------------------------------------------------------------------------ |
| JTextField()                                       | Xây dựng một TextField mới.                                                          |
| JTextField(Document doc, String text, int columns) | Xây dựng một JTextField mới mà sử dụng mô hình lưu trữ text đã cho và số cột đã cho. |
| JTextField(int columns)                            | Xây dựng một TextField mới và trống với số cột đã cho.                               |
| JTextField(String text)                            | Xây dựng một TextField mới được khởi tạo với text đã cho.                            |
| JTextField(String text, int columns)               | Xây dựng một TextField mới được khởi tạo với text và các cột đã cho.                 |

### Một số phương thức thường dùng

| Method                                      | Description                                                                                   |
| ------------------------------------------- | --------------------------------------------------------------------------------------------- |
| void addActionListener(ActionListener l)    | Thêm action listener đã cho để nhận các action event từ textfield này                         |
| void setFont(Font f)                        | Thiết lập font hiện tại                                                                       |
| Action[] getActions()                       | It returns the currently set Action for this ActionEvent source, or null if no Action is set. |
| void removeActionListener(ActionListener l) | Xóa action listener đã cho để nó không bao giờ nhận action event từ textfield này nữa         |

## 4. Lớp JButton trong Java Swing
* Lớp JButton trong Java Swing được sử dụng để tạo một nút có thể click.
* Thành phần này có một label và tạo một sự kiện (event) khi được nhấn.
* Cũng có thể chèn ảnh vào button.

### Lớp JButton có các constructor sau
| Constructor                     | Description                                                            |
| ------------------------------- | ---------------------------------------------------------------------- |
| JButton()                       | Tạo một button mà không thiết lập text hoặc icon.                      |
| JButton(Action a)               | Tạo một button tại đây các thuộc tính được nhận từ Action đã cung cấp. |
| JButton(Icon icon)              | Tạo một button với một icon.                                           |
| JButton(String text)            | Tạo một button với text.                                               |
| JButton(String text, Icon icon) | Tạo một button với text ban đầu và một icon.                           |

### Các phương thức được sử dụng phổ biến của lớp JButton
| Method                                          | Description                                             |
| ----------------------------------------------- | ------------------------------------------------------- |
| public void setText(String s)                   | được sử dụng để thiết lập text đã cho trên button.      |
| public String getText()                         | được sử dụng để trả về text của button.                 |
| public void setEnabled(boolean b)               | được sử dụng để kích hoạt hoặc vô hiệu hóa button.      |
| public void setIcon(Icon b)                     | được sử dụng để thiết lập Icon đã cho trên button.      |
| public Icon getIcon()                           | được sử dụng để lấy Icon của button.                    |
| public void addActionListener(ActionListener a) | được sử dụng để thêm action listener tới đối tượng này. |

## 5. Lớp JPanel trong Java Swing
* JPanel trong Java Swing được sử dụng để tạo ra các container nơi chứa các phần tử khác
### Các constructor
| Constructor                                            | Description                                                            |
| ------------------------------------------------------ | ---------------------------------------------------------------------- |
| JPanel()                                               | Tạo một JPanel mới với một double buffer và một Flow Layout.           |
| JPanel(boolean isDoubleBuffered)                       | Tạo một JPanel mới với Flow Layout và trình đệm đã xác định.           |
| JPanel(LayoutManager layout)                           | Tạo một JPanel mới với Layout Manager đã cho                           |
| JPanel(LayoutManager layout, boolean isDoubleBuffered) | Tạo một JPanel mới với Layout Manager đã cho và trình đệm đã xác định. |

## 6. Lớp JComboBox trong Java Swing
* Lớp JComboBox trong Java Swing là một thành phần mà kết hợp một button, một trường có thể chỉnh sửa và một drop-down list.
* Tại một thời điểm chỉ có một item có thể được lựa chọn từ list. 

### Các constructor phổ biến

| Constructor               | Description                                                |
| ------------------------- | ---------------------------------------------------------- |
| JComboBox()               | Tạo một JComboBox với data model mặc định.                 |
| JComboBox(Object[] items) | Tạo một JComboBox mà chứa các phần tử trong mảng đã cho.   |
| JComboBox(Vector items)   | Tạo một JComboBox mà chứa các phần tử trong Vector đã cho. |

### Các method phổ biến

| Method                                          | Description                             |
| ----------------------------------------------- | --------------------------------------- |
| public void addItem(Object anObject)            | được sử dụng để thêm một item tới list. |
| public void removeItem(Object anObject)         | được sử dụng để xóa một item từ list.   |
| public void addActionListener(ActionListener a) | được sử dụng để thêm ActionListener.    |

## 7. Lớp JMenu trong Java Swing
* Mỗi cửa sổ window có một thanh trình đơn (menu bar) được liên kết với nó. Thanh trình đơn này gồm các lựa chọn có sẵn tới người dùng cuối cùng. Các điều khiển Menu và MenuItem là lớp con của lớp MenuComponent.
* Lớp JMenu trong Java biểu diễn thành phần pull-down menu mà được triển khai từ một thanh trình đơn. 

### Các constructor
| Constructor                | Description                                                                                                                       |
| -------------------------- | --------------------------------------------------------------------------------------------------------------------------------- |
| JMenu()                    | Xây dựng một JMenu mới không có text.                                                                                             |
| JMenu(Action a)            | Xây dựng một menu có các thuộc tính được nhận từ Action đã cho.                                                                   |
| JMenu(String s)            | Xây dựng một JMenu mới với chuỗi s đã cho (như là text của nó).                                                                   |
| JMenu(String s, boolean b) | Xây dựng một JMenu mới với chuỗi s đã cho (như là text của nó) và một giá trị boolean để xác định có hay không một tear-off menu. |

## 8. Lớp JMenuBar
* Mỗi cửa sổ window có một thanh trình đơn (menu bar) được liên kết với nó. Thanh trình đơn này gồm các lựa chọn có sẵn tới người dùng cuối cùng.
![Vidu](https://viettuts.vn/images/java-swing/lop-jmenubar-trong-java-swing-1.png)

## 9. Lớp JMenuItem
* Lớp JMenuItem trong Java biểu diễn item thực sự trong một menu. Tất cả item trong một menu nên kế thừa từ lớp JMenuItem, hoặc một trong các lớp con của nó.
![png](https://viettuts.vn/images/java-swing/lop-jmenuitem-trong-java-swing-1.png)

# Xử lý sự kiện trong Java Swing
