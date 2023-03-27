package HW05.Model.Groups;

import java.util.List;

public abstract class Group <T1, T2>{
    T1 leadership;
    List<T2> members;

    public Group(T1 leadership, List<T2> members) {
        this.leadership = leadership;
        this.members = members;
    }

    public T1 getLeadership() {
        return leadership;
    }

    public List<T2> getMembers() {
        return members;
    }
}
