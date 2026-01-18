import java.util.Scanner;

public class BaiLuyenTap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int[] arr = null;
        while (true) {
            System.out.println(""" 
                    --- QUẢN LÝ ĐIỂM SINH VIÊN --- 
                    1. Nhập danh sách điểm sinh viên
                    2. In danh sách điểm
                    3. Tính điểm trung bình của các sinh viên 
                    4. Tìm điểm cao nhất và thấp nhất 
                    5. Đếm số lượng sinh viên đạt và trượt
                    6. Sắp xếp điểm tăng dần
                    7. Thống kê số lượng sinh viên giỏi và xuất sắc
                    8. Thoát
                    Lựa chọn của bạn: """);
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1: {
                    System.out.print("Nhập số lượng sinh viên: ");
                    n = Integer.parseInt(sc.nextLine());
                    arr = new int[n];
                    for (int i = 0; i < n; i++) {
                        System.out.print("Nhập điểm sinh viên thứ " + (i + 1) + ": ");
                        arr[i] = Integer.parseInt(sc.nextLine());
                    }
                }
                break;
                case 2: {
                    System.out.println("Danh sách điểm: ");
                    for (int i = 0; i < arr.length; i++) {
                        System.out.println("Sinh viên " + (i + 1) + ": " + arr[i]);
                    }
                }
                break;
                case 3: {
                    double sum = 0;
                    for (int i = 0; i < arr.length; i++) {
                        sum += arr[i];
                    }
                    double avg = sum / arr.length;
                    System.out.printf("Diểm trung bình: %.2f \n", avg);
                }
                break;
                case 4: {
                    int min = arr[0], max = arr[0];
                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i] > max) {
                            max = arr[i];
                        }
                        if (arr[i] < min) {
                            min = arr[i];
                        }
                    }
                    System.out.printf("Diểm cao nhất: %d \n", max);
                    System.out.printf("Diểm thấp nhất: %d \n", min);
                }
                break;
                case 5: {
                    int pass = 0, fail = 0;
                    for (int i = 0; i < n; i++) {
                        if (arr[i] >= 5) {
                            pass++;
                        } else {
                            fail++;
                        }
                    }
                    System.out.println("Số SV đạt: " + pass);
                    System.out.println("Số SV trượt: " + fail);
                }
                    break;
                case 6: {
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = 0; j < n - i - 1; j++) {
                            if (arr[j] > arr[j + 1]) {
                                int temp = arr[j];
                                arr[j] = arr[j + 1];
                                arr[j + 1] = temp;
                            }
                        }
                    }
                    System.out.println("Điểm sau khi sắp xếp tăng dần:");
                    for (int num : arr) {
                        System.out.println(num + " ");
                    }
                }
                break;
                case 7: {
                    int goodandexcellent = 0 ;
                    for (int i = 0; i < n; i++) {
                        if (arr[i] >= 8) {
                            goodandexcellent++;
                        }
                    }
                    System.out.println("Số lượng SV đạt giỏi và xuất sắc: " + goodandexcellent);
                }
                break;
                case 8: {
                    System.out.println("Thoát chương trình.");
                    System.exit(0);
                }
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
                }
            }
        }
    }



