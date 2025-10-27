package lessons.lessons15.homework.educationalInstitution

class ElementarySchool(
    name: String,
    address: String,
    accreditationLevel: String,
    studentGradeLevels: IntRange,
    hasKindergarten: Boolean,
    val hasAfterSchoolCare: Boolean
) : School(name, address, studentGradeLevels, hasKindergarten)