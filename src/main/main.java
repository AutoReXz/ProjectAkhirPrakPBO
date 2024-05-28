package main;

public class main {

    // untuk menyimpan status login
    static boolean isLoggedIn = false;

    public static void main(String[] args) {
        // Menampilkan PilihView saat aplikasi dimulai
        PilihView v = new PilihView();
        v.setVisible(true);
        v.setLocationRelativeTo(null);
    }

    public static void setLoggedIn(boolean status) {
        isLoggedIn = status;
    }

    public static boolean isLoggedIn() {
        return isLoggedIn;
    }
}
