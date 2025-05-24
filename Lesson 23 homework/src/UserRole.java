public enum UserRole {
    ADMIN(3, "Admin : Are acces deplin."),
    MODERATOR(2, " Moderator : Acces permis la panoul administratorului."),
    USER(1, "User : Acces ce permite doar citirea.");

    private int accesLevel;
    private String description;

    UserRole(int accesLevel, String description) {
        this.accesLevel = accesLevel;
        this.description = description;
    }

    public boolean hasAccesToAdminPanel() {
        if (this == ADMIN || this == MODERATOR) {
            return true;
        }
        else {
            return false;
        }
    }

    public String getDescription() {
        return description;
    }
}
