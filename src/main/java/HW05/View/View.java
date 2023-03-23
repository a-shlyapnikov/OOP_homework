package HW05.View;

import HW05.Model.Users.User;

import java.util.List;

public class View {
    StringBuilder sb = new StringBuilder();

    public String studentView(List<? extends User> students) {
        for (var s:students){
            sb.append(s.toString()).append("\n");
        }
        return sb.toString();
    }
    public String gropView(){
        return null;
    }
}
