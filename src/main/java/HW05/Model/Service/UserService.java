package HW05.Model.Service;

import HW05.Model.Groups.StudyGroup;
import HW05.Model.Service.Impl.DataService;
import HW05.Model.Service.Impl.GetGroupListImpl;
import HW05.Model.Service.Impl.GetUserListImpl;
import HW05.Model.Users.Student;
import HW05.Model.Users.Teacher;
import HW05.Model.Users.User;

import java.util.List;

public class UserService implements DataService, GetUserListImpl, GetGroupListImpl {


    @Override
    public Student createStudent() {
        return new StudentCreator().createStudent();
    }

    @Override
    public Teacher createTeacher() {
        return new TeacherCreator().createTeacher();
    }

    @Override
    public StudyGroup createStudyGroup(List<Teacher> teachers, List<Student> students) {
        return new StudyGroupCreator(this, teachers, students).newGroup();
    }

    @Override
    public String getUsersList(List<? extends User> users) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < users.size(); i++)
            sb.append(i + 1).append(". ").append(users.get(i).toString()).append("\n");
        return sb.toString();
    }

    @Override
    public String getStudyGroupList(List<StudyGroup> studyGroups) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < studyGroups.size(); i++) {
            sb.append(i + 1).append(". ").append(studyGroups.get(i).toString()).append("\n");
        }
        return sb.toString();
    }
}
