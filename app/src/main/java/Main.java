public class Main {
    public static void main(String[] args) {
        // macOS Dock'ta "java" yerine uygulama adı görünsün (JavaFX/AWT
        // başlamadan ÖNCE ayarlanmalı).
        System.setProperty("apple.awt.application.name", "Oyun Kütüphanesi");
        GameCatalogUI.launch(GameCatalogUI.class, args);
    }
}