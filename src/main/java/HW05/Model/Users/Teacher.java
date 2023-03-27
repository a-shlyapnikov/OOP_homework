package HW05.Model.Users;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Teacher extends User {
    int exp;
    List<Integer> group;

    public Teacher(String dateBirth, String fio, int id) {
        super(dateBirth, fio, id);
    }



    public Teacher(String dateBirth, String fio) {
        this(dateBirth, fio, getCount());
    }
    public Teacher() {
        this(LocalDate.now().toString(), "Ivanov Ivan");
    }


    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "Teacher {" +
                "exp=" + exp +
                ", group=" + group +
                ", dateBirth=" + dateBirth +
                ", fio='" + fio + '\'' +
                ", Id=" + id +
                '}';
    }
}
