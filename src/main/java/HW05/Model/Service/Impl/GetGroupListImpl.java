package HW05.Model.Service.Impl;

import HW05.Model.Groups.StudyGroup;

import java.util.List;

/**
 * Реализовал принцип инверсии зависимостей,
 * Детали зависят от абстракций
 */
public interface GetGroupListImpl {
    public String getStudyGroupList(List<StudyGroup> studyGroups);
}
