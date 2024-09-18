package tuan2;
// hello world
public class bai2 {
    public static void main(String[] args) {
        // Khai báo các biến
        String name = "My Duyen"; 
        int age = 19;             
        double height = 1.55;     
        boolean like = true; 

        // In ra các giá trị đã lưu
        System.out.println("Ten: " + name);
        System.out.println("Tuoi: " + age);
        System.out.println("Chieu cao: " + height);
        System.out.println("Co thich lap trinh khong: " + (like ? "Co" : "Khong"));
    }
}
