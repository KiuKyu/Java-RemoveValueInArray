import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        khởi tạo các biến
        Scanner userInput = new Scanner(System.in);
        int size;
        int[] arrNum;
        int indexDel = -1;

//        tạo scanner cho người dùng nhập kích thước mảng
        System.out.print("Nhập kích thước mảng: ");
//        gán scanner được nhập cho biến size
        size = userInput.nextInt();
//        rồi gán biến size cho kích thước của arrNum
        arrNum = new int[size];
//        nhập liệu ngẫu nhiên vào mảng với math.random
        for (int i = 0; i < size; i++) {
            arrNum[i] = (int) (Math.floor(Math.random() * 100 + 1));
        }
//        in mảng
        for (int j : arrNum) {
            System.out.println(j);
        }
//        nhập X là phần tử cần xóa
        System.out.println("Nhập phần tử cần xóa: ");
        int numDel = userInput.nextInt();
//        tìm xem X có trong mảng k
        for (int k = 0; k < size; k++) {
            if (arrNum[k] == numDel) {
//        lưu lại vị trí của X vào biến indexDel để phục vụ việc xóa
                indexDel = k;
//        nếu có thì in ra vị trí của X
                System.out.println("Số " + numDel + " ở vị trí số " + (k + 1));
            }
        }
//         nếu giá trị của biến index vẫn được giữ nguyên là -1 vì không tìm thấy nó trong mảng
        if (indexDel == -1) {
            System.out.println("Số " + numDel + " không nằm trong mảng");
            // kết thúc chương trình
            return;
        }
//        tạo ra 1 mảng mới mới size nhỏ hơn size của mảng đầu 1 đơn vị
        int []arr2 = new int[size - 1];
        for (int x = 0; x < arr2.length; x++) {
            if (x < indexDel) {
                arr2[x] = arrNum[x];
            } else {
                arr2[x] = arrNum[x + 1];
            }
        }
//        in mảng sau khi sửa với for each
        System.out.println("Mảng sau khi sửa là:");
        for (int h : arr2) {
            System.out.println(h);
        }

    }
}
