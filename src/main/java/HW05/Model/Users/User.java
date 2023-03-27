package HW05.Model.Users;

import java.time.LocalDate;
import java.util.Date;

public abstract class User {
    String dateBirth;
    String fio;
    int id;



    private static int count;

    public User(String dateBirth, String fio, int id) {
        this.dateBirth = dateBirth;
        this.fio = fio;
        this.id = id;
        count++;
    }
    public User(String dateBirth, String fio) {
        this(dateBirth, fio, ++count);
    }
    public User() {
        this(LocalDate.now().toString(), "User unknown");
    }

    @Override
    public String toString() {
        return "User{" +
                "dateBirth=" + dateBirth +
                ", fio='" + fio + '\'' +
                ", id=" + id +
                '}';
    }

    public String getFio() {
        return fio;
    }

    public static int getCount() {
        return count;
    }
}
