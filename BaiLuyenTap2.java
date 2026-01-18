import java.util.Scanner;

public class BaiLuyenTap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hovaten = null;
        String email = null;
        String sdt = null;
        String matkhau = null;
     while (true) {
        System.out.println(""" 
                    --- QUẢN LÝ NGƯỜI DÙNG --- 
                    1. Nhập thông tin người dùng
                    2. Chuẩn hóa họ tên
                    3. Kiểm tra email hợp lệ 
                    4. Kiểm tra số điện thoại hợp lệ 
                    5. Kiểm tra mật khẩu hợp lệ
                    6. Thoát
                    Lựa chọn của bạn: """);
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1: {
                System.out.println("Nhập họ và tên: ");
                hovaten = sc.nextLine();
                System.out.println("Nhập email: ");
                email = sc.nextLine();
                System.out.println("Nhập số điện thoại: ");
                sdt = sc.nextLine();
                System.out.println("Nhập mật khẩu: ");
                matkhau = sc.nextLine();
                }
                break;
            case 2: {
                hovaten = hovaten.trim().toLowerCase();
                String[] words = hovaten.split("\\s+");
                StringBuilder sb = new StringBuilder();
                for (String w : words) {
                    sb.append(Character.toUpperCase(w.charAt(0))) .append(w.substring(1)) .append(" ");
                }
                hovaten = sb.toString().trim();
                System.out.println("Họ và tên sau chuẩn hóa: " + hovaten);
            }
            break;
            case 3: {
                boolean hopLe = email.matches("^[\\w.-]+@[\\w.-]+\\.\\w{2,}$");
                System.out.println("Email " + (hopLe ? "hợp lệ" : "không hợp lệ"));
            }
            break;
            case 4: {
                boolean hopLe = sdt.matches("^(0|\\+84)(3[2-9]|5[6-9]|7[0|6-9]|8[1-9]|9[0-9])[0-9]{7}$");
                System.out.println("SĐT " + (hopLe ? "hợp lệ" : "không hợp lệ"));
            }
            break;
            case 5: {
                boolean hopLe = matkhau.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$");
                System.out.println("Mật khẩu " + (hopLe ? "hợp lệ" : "không hợp lệ"));
            }
            break;
            case 6: {
                System.out.println("Thoát chương trình.");
                System.exit(0);
            }
            default:
                System.out.println("Lựa chọn không hợp lệ.");
            }
            }
        }
            }

