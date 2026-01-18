import java.util.Scanner;

public class BaiLuyenTap3 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String[] arr = null;
            int n = 0;
            int chon;
            do {
                System.out.println("******** QUẢN LÝ BIỂN SỐ XE ********");
                System.out.println("1. Thêm các biển số xe");
                System.out.println("2. Hiển thị danh sách biển số xe");
                System.out.println("3. Tìm kiếm biển số xe");
                System.out.println("4. Tìm biển số xe theo mã tỉnh");
                System.out.println("5. Sắp xếp biển số xe tăng dần");
                System.out.println("6. Thoát");
                System.out.print("Lựa chọn của bạn: ");
                chon = Integer.parseInt(sc.nextLine());

                switch (chon) {
                    case 1: {
                        System.out.print("Nhập số lượng biển số xe: ");
                        n = Integer.parseInt(sc.nextLine());
                        arr = new String[n];
                        for (int i = 0; i < n; i++) {
                            System.out.print("Nhập biển số xe thứ " + (i + 1) + ": ");
                            arr[i] = sc.nextLine();
                        }
                    }
                    break;
                    case 2: {
                        System.out.println("Danh sách biển số xe: ");
                        for (int i = 0; i < arr.length; i++) {
                            System.out.println("Biển Số Xe " + (i + 1) + ": " + arr[i]);
                        }
                    }
                    break;

                    case 3: {
                        System.out.print("Nhập biển số xe cần tìm: ");
                        String tim = sc.nextLine();
                        for (int i = 0; i < n; i++) {
                            if (arr[i].equals(tim)) {
                                System.out.println("Tìm thấy: " + arr[i]);
                            } else {
                                System.out.println("Không tìm thấy.");
                            }
                        }
                    }
                    break;

                    case 4: {
                        System.out.print("Nhập mã tỉnh: ");
                        String maTinh = sc.nextLine();
                        for (int i = 0; i < n; i++) {
                            if (arr[i].startsWith(maTinh)) {
                                System.out.println(arr[i]);
                            } else {
                                System.out.println("Không có biển số thuộc tỉnh này");
                            }
                        }
                    }
                    break;

                    case 5: {
                        for (int i = 0; i < n - 1; i++) {
                            for (int j = 0; j < n - i - 1; j++) {
                                if (arr[i].compareTo(arr[j]) > 0) {
                                    String temp = arr[i];
                                    arr[i] = arr[j];
                                    arr[j] = temp;
                                }
                            }
                        }
                        System.out.println("Biển số xe sau khi sắp xếp tăng dần:");
                        for (String num : arr) {
                            System.out.println(num + " ");
                        }
                    }
                    break;

                    case 6: {
                        System.out.println("Thoát chương trình.");
                        System.exit(0);
                    }

                    default:
                        System.out.println("Lựa chọn không hợp lệ.");
                }
            } while (chon != 6);
        }
    }


